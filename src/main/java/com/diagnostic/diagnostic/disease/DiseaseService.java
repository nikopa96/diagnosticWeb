package com.diagnostic.diagnostic.disease;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DiseaseService {

    @Autowired
    private DiseaseRepository diseaseRepository;

    public Iterable<Disease> getAllDiseases() {
        return diseaseRepository.findAll();
    }

    public Optional<Disease> getDiseaseById(Long id) {
        return diseaseRepository.findById(id);
    }

    public void addDisease(Disease disease) {
        diseaseRepository.save(disease);
    }

    public void updateDisease(Long id, Disease disease) {
        diseaseRepository.save(disease);
    }

    public void deleteDisease(Long id) {
        diseaseRepository.deleteById(id);
    }

}
