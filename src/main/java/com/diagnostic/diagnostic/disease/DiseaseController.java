package com.diagnostic.diagnostic.disease;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/diseases")
public class DiseaseController {

    @Autowired
    private DiseaseService diseaseService;

    @GetMapping(path = "/getAll")
    private Iterable<Disease> getAllDiseases() {
        return diseaseService.getAllDiseases();
    }

    @GetMapping(path = "/{id}")
    private Optional<Disease> getDiseaseById(@PathVariable Long id) {
        return diseaseService.getDiseaseById(id);
    }

    @PostMapping(path = "/add")
    private void addDisease(@RequestBody Disease disease) {
        diseaseService.addDisease(disease);
    }

    @PutMapping(path = "update/{id}")
    private void updateDisease(@PathVariable Long id, @RequestBody Disease disease) {
        diseaseService.updateDisease(id, disease);
    }

    @DeleteMapping(path = "/delete/{id}")
    private void deleteDisease(@PathVariable Long id) {
        diseaseService.deleteDisease(id);
    }
}
