package com.example.testpfe.bean;


import javax.persistence.*;
import java.util.List;

@Entity

public class Voeux {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private String description;
    @ManyToOne
    private EtatVoeux etatVoeux;
    @ManyToOne
    private Budget budget;
    @ManyToOne
    private EntiteAdministrative entiteAdministrative;
    @OneToMany(mappedBy = "voeux")
    private List<VoeuxItem> voeuxItems;

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public Voeux() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EtatVoeux getEtatVoeux() {
        return etatVoeux;
    }

    public void setEtatVoeux(EtatVoeux etatVoeux) {
        this.etatVoeux = etatVoeux;
    }

    public EntiteAdministrative getEntiteAdministrative() {
        return entiteAdministrative;
    }

    public void setEntiteAdministrative(EntiteAdministrative entiteAdministrative) {
        this.entiteAdministrative = entiteAdministrative;
    }

    public List<VoeuxItem> getVoeuxItems() {
        return voeuxItems;
    }

    public void setVoeuxItems(List<VoeuxItem> voeuxItems) {
        this.voeuxItems = voeuxItems;
    }
}
