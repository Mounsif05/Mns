package com.example.testpfe.bean;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity

public class Livraison {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private String description;
    private Date dateLivraison;
    @ManyToOne
    private EtatLivraison etatLivraison;
    @ManyToOne
    private Reception reception;
    @OneToMany(mappedBy = "livraison")
    private List<LivraisonItem> livraisonItems;

    public Livraison() {
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

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public EtatLivraison getEtatLivraison() {
        return etatLivraison;
    }

    public void setEtatLivraison(EtatLivraison etatLivraison) {
        this.etatLivraison = etatLivraison;
    }

    public Reception getReception() {
        return reception;
    }

    public void setReception(Reception reception) {
        this.reception = reception;
    }

    public List<LivraisonItem> getLivraisonItems() {
        return livraisonItems;
    }

    public void setLivraisonItems(List<LivraisonItem> livraisonItems) {
        this.livraisonItems = livraisonItems;
    }
}
