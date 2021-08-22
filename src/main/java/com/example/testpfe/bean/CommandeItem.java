/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author admin
 */
@Entity
public class CommandeItem implements Serializable {
@Id 
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String ref;
	private BigDecimal qteCommandee;
	private BigDecimal prix;
	private BigDecimal qteLivree;
@ManyToOne
private Commande commande;

@ManyToOne
private Produit produit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public BigDecimal getQteCommandee() {
        return qteCommandee;
    }

    public void setQteCommandee(BigDecimal qteCommandee) {
        this.qteCommandee = qteCommandee;
    }

    public BigDecimal getPrix() {
        return prix;
    }

    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }

    public BigDecimal getQteLivree() {
        return qteLivree;
    }

    public void setQteLivree(BigDecimal qteLivree) {
        this.qteLivree = qteLivree;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    





    

}

