package com.example.testpfe.Vo;


import com.example.testpfe.bean.Budget;
import com.example.testpfe.bean.EntiteAdministrative;
import com.example.testpfe.bean.EtatVoeux;
import com.example.testpfe.bean.VoeuxItem;

import java.util.List;

public class VoeuxVo {

    private Long id;
    private String reference;
    private String description;
    private EtatVoeux etatVoeux;
    private Budget budget;
    private EntiteAdministrative entiteAdministrative;
    private List<VoeuxItem> voeuxItems;


    public VoeuxVo() {
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

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
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
