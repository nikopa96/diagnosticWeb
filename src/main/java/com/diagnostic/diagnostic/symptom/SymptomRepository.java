package com.diagnostic.diagnostic.symptom;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SymptomRepository extends CrudRepository<Symptom, Long> {

    public List<Symptom> findByDiseaseName(String diseaseName);

}
