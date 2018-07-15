package com.diagnostic.diagnostic.disease;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "disease")
public class Disease {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    public Disease(Long id) {
        this.id = id;
    }
}
