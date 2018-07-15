package com.diagnostic.diagnostic.symptom;

import com.diagnostic.diagnostic.disease.Disease;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SymptomController {

    @Autowired
    private SymptomService symptomService;

    @RequestMapping(method = RequestMethod.GET, value = "/symptoms/getAll")
    private Iterable<Symptom> getAllSymptoms() {
        return symptomService.getAllSymptoms();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/symptoms/{id}")
    private Optional<Symptom> getSymptomById(@PathVariable Long id) {
        return symptomService.getSymptomById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/diseases/{name}/symptoms")
    private Iterable<Symptom> getAllSymptomsByDiseaseName(@PathVariable String name) {
        return symptomService.getSymptomsByDiseaseName(name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/diseases/{diseaseId}/symptoms/add")
    private void addSymptom(@RequestBody Symptom symptom, @PathVariable Long diseaseId) {
        symptom.setDisease(new Disease(diseaseId));
        symptomService.addSymptom(symptom);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/diseases/{diseaseId}/symptoms/update/{symptomId}")
    private void updateSymptom(@PathVariable Long symptomId, @PathVariable Long diseaseId, @RequestBody Symptom symptom) {
        symptom.setDisease(new Disease(diseaseId));
        symptomService.updateSymptom(symptomId, symptom);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/diseases/{diseaseId}/symptoms/delete/{symptomId}")
    private void deleteSymptom(@PathVariable Long diseaseId, @PathVariable Long symptomId) {
        symptomService.deleteSymptom(symptomId);
    }

}
