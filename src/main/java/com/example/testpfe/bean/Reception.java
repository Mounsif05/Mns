package com.example.testpfe.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Reception {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Commande commande;
    private String reference;
    @ManyToOne
    private EtatReception etatReception;
    private Date dateReception;

    public Reception() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public EtatReception getEtatReception() {
        return etatReception;
    }

    public void setEtatReception(EtatReception etatReception) {
        this.etatReception = etatReception;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }
}
