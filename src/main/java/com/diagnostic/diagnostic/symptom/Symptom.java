package com.diagnostic.diagnostic.symptom;

import com.diagnostic.diagnostic.disease.Disease;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "symptom")
public class Symptom {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private Disease disease;
}
