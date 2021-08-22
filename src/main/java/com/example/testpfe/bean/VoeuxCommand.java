package com.example.testpfe.bean;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
public class VoeuxCommand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private CommandeItem commandeItem;
    @ManyToOne
    private VoeuxItem voeuxItem;
    private BigDecimal qte;
    private BigDecimal qteLivre;
    private BigDecimal qteReception;


    public VoeuxCommand() {
    }

    public VoeuxCommand(Long id, CommandeItem commandeItem, VoeuxItem voeuxItem, BigDecimal qte, BigDecimal qteLivre, BigDecimal qteReception) {
        this.id = id;
        this.commandeItem = commandeItem;
        this.voeuxItem = voeuxItem;
        this.qte = qte;
        this.qteLivre = qteLivre;
        this.qteReception = qteReception;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CommandeItem getCommandeItem() {
        return commandeItem;
    }

    public void setCommandeItem(CommandeItem commandeItem) {
        this.commandeItem = commandeItem;
    }

    public VoeuxItem getVoeuxItem() {
        return voeuxItem;
    }

    public void setVoeuxItem(VoeuxItem voeuxItem) {
        this.voeuxItem = voeuxItem;
    }

    public BigDecimal getQte() {
        return qte;
    }

    public void setQte(BigDecimal qte) {
        this.qte = qte;
    }

    public BigDecimal getQteLivre() {
        return qteLivre;
    }

    public void setQteLivre(BigDecimal qteLivre) {
        this.qteLivre = qteLivre;
    }

    public BigDecimal getQteReception() {
        return qteReception;
    }

    public void setQteReception(BigDecimal qteReception) {
        this.qteReception = qteReception;
    }
}
