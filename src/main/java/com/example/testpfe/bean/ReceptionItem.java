package com.example.testpfe.bean;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class ReceptionItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Reception reception;
    @ManyToOne
    private Produit produit;
    private BigDecimal qte;
    private BigDecimal qteLivraison;
    @ManyToOne
    private Magasin magasin;

    public ReceptionItem() {
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reception getReception() {
        return reception;
    }

    public void setReception(Reception reception) {
        this.reception = reception;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public BigDecimal getQte() {
        return qte;
    }

    public void setQte(BigDecimal qte) {
        this.qte = qte;
    }

    public BigDecimal getQteLivraison() {
        return qteLivraison;
    }

    public void setQteLivraison(BigDecimal qteLivraison) {
        this.qteLivraison = qteLivraison;
    }
}
