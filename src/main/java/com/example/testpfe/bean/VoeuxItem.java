package com.example.testpfe.bean;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity

public class VoeuxItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Produit produit;

    private BigDecimal qteDemande;
    private BigDecimal qteAccorde;
    private BigDecimal qteCommande;
    private BigDecimal qteReceptionne;
    private BigDecimal qteLivre;
    @ManyToOne
    private Voeux voeux;


    public VoeuxItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public BigDecimal getQteDemande() {
        return qteDemande;
    }

    public void setQteDemande(BigDecimal qteDemande) {
        this.qteDemande = qteDemande;
    }


    public BigDecimal getQteAccorde() {
        return qteAccorde;
    }

    public void setQteAccorde(BigDecimal qteAccorde) {
        this.qteAccorde = qteAccorde;
    }

    public BigDecimal getQteCommande() {
        return qteCommande;
    }

    public void setQteCommande(BigDecimal qteCommande) {
        this.qteCommande = qteCommande;
    }

    public BigDecimal getQteReceptionne() {
        return qteReceptionne;
    }

    public void setQteReceptionne(BigDecimal qteReceptionne) {
        this.qteReceptionne = qteReceptionne;
    }

    public BigDecimal getQteLivre() {
        return qteLivre;
    }

    public void setQteLivre(BigDecimal qteLivre) {
        this.qteLivre = qteLivre;
    }

    public Voeux getVoeux() {
        return voeux;
    }

    public void setVoeux(Voeux voeux) {
        this.voeux = voeux;
    }
}
