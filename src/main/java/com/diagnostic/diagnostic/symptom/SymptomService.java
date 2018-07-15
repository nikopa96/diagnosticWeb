package com.diagnostic.diagnostic.symptom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SymptomService {

    @Autowired
    private SymptomRepository symptomRepository;

    public Iterable<Symptom> getAllSymptoms() {
        return symptomRepository.findAll();
    }

    public Iterable<Symptom> getSymptomsByDiseaseName(String diseaseName) {
        return symptomRepository.findByDiseaseName(diseaseName);
    }

    public Optional<Symptom> getSymptomById(Long id) {
        return symptomRepository.findById(id);
    }

    public void addSymptom(Symptom symptom) {
        symptomRepository.save(symptom);
    }

    public void updateSymptom(Long id, Symptom symptom) {
        symptomRepository.save(symptom);
    }

    public void deleteSymptom(Long id) {
        symptomRepository.deleteById(id);
    }
}
