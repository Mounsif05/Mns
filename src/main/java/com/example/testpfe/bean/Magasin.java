package com.example.testpfe.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Magasin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String llibelle;


    public Magasin() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLlibelle() {
        return llibelle;
    }

    public void setLlibelle(String llibelle) {
        this.llibelle = llibelle;
    }
}
