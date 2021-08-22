package com.example.testpfe.Vo;

import com.example.testpfe.bean.Produit;
import com.example.testpfe.bean.Voeux;

import java.math.BigDecimal;

public class VoeuxItemVo {

    private Long id;
    private Produit produit;
    private BigDecimal qteDemande;
    private BigDecimal qteDemandeMin;
    private BigDecimal qteDemandeMax;
    private BigDecimal qteAccorde;
    private BigDecimal qteAccordeMin;
    private BigDecimal qteAccordeMax;
    private BigDecimal qteCommande;
    private BigDecimal qteCommandeMin;
    private BigDecimal qteCommandeMax;
    private BigDecimal qteReceptionne;
    private BigDecimal qteReceptionneMin;
    private BigDecimal qteReceptionneMax;
    private BigDecimal qteLivre;
    private BigDecimal qteLivreMin;
    private BigDecimal qteLivreMax;
    private Voeux voeux;

    public VoeuxItemVo() {
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

    public BigDecimal getQteDemandeMin() {
        return qteDemandeMin;
    }

    public void setQteDemandeMin(BigDecimal qteDemandeMin) {
        this.qteDemandeMin = qteDemandeMin;
    }

    public BigDecimal getQteDemandeMax() {
        return qteDemandeMax;
    }

    public void setQteDemandeMax(BigDecimal qteDemandeMax) {
        this.qteDemandeMax = qteDemandeMax;
    }

    public BigDecimal getQteAccorde() {
        return qteAccorde;
    }

    public void setQteAccorde(BigDecimal qteAccorde) {
        this.qteAccorde = qteAccorde;
    }

    public BigDecimal getQteAccordeMin() {
        return qteAccordeMin;
    }

    public void setQteAccordeMin(BigDecimal qteAccordeMin) {
        this.qteAccordeMin = qteAccordeMin;
    }

    public BigDecimal getQteAccordeMax() {
        return qteAccordeMax;
    }

    public void setQteAccordeMax(BigDecimal qteAccordeMax) {
        this.qteAccordeMax = qteAccordeMax;
    }

    public BigDecimal getQteCommande() {
        return qteCommande;
    }

    public void setQteCommande(BigDecimal qteCommande) {
        this.qteCommande = qteCommande;
    }

    public BigDecimal getQteCommandeMin() {
        return qteCommandeMin;
    }

    public void setQteCommandeMin(BigDecimal qteCommandeMin) {
        this.qteCommandeMin = qteCommandeMin;
    }

    public BigDecimal getQteCommandeMax() {
        return qteCommandeMax;
    }

    public void setQteCommandeMax(BigDecimal qteCommandeMax) {
        this.qteCommandeMax = qteCommandeMax;
    }

    public BigDecimal getQteReceptionne() {
        return qteReceptionne;
    }

    public void setQteReceptionne(BigDecimal qteReceptionne) {
        this.qteReceptionne = qteReceptionne;
    }

    public BigDecimal getQteReceptionneMin() {
        return qteReceptionneMin;
    }

    public void setQteReceptionneMin(BigDecimal qteReceptionneMin) {
        this.qteReceptionneMin = qteReceptionneMin;
    }

    public BigDecimal getQteReceptionneMax() {
        return qteReceptionneMax;
    }

    public void setQteReceptionneMax(BigDecimal qteReceptionneMax) {
        this.qteReceptionneMax = qteReceptionneMax;
    }

    public BigDecimal getQteLivre() {
        return qteLivre;
    }

    public void setQteLivre(BigDecimal qteLivre) {
        this.qteLivre = qteLivre;
    }

    public BigDecimal getQteLivreMin() {
        return qteLivreMin;
    }

    public void setQteLivreMin(BigDecimal qteLivreMin) {
        this.qteLivreMin = qteLivreMin;
    }

    public BigDecimal getQteLivreMax() {
        return qteLivreMax;
    }

    public void setQteLivreMax(BigDecimal qteLivreMax) {
        this.qteLivreMax = qteLivreMax;
    }

    public Voeux getVoeux() {
        return voeux;
    }

    public void setVoeux(Voeux voeux) {
        this.voeux = voeux;
    }
}
