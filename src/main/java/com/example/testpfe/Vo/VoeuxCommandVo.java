package com.example.testpfe.Vo;

import com.example.testpfe.bean.CommandeItem;
import com.example.testpfe.bean.VoeuxItem;

import java.math.BigDecimal;

public class VoeuxCommandVo {
    private  Long id;
    private CommandeItem commandeItem;
    private VoeuxItem voeuxItem;
    private BigDecimal qte;
    private BigDecimal qteMin;
    private BigDecimal qteMax;
    private BigDecimal qteLivre;
    private BigDecimal qteLivreMin;
    private BigDecimal qteLivreMax;
    private BigDecimal qteReception;
    private BigDecimal qteReceptionMin;
    private BigDecimal qteReceptionMax;

    public VoeuxCommandVo() {
    }

    public VoeuxCommandVo(Long id, CommandeItem commandeItem, VoeuxItem voeuxItem, BigDecimal qte, BigDecimal qteMin, BigDecimal qteMax, BigDecimal qteLivre, BigDecimal qteLivreMin, BigDecimal qteLivreMax, BigDecimal qteReception, BigDecimal qteReceptionMin, BigDecimal qteReceptionMax) {
        this.id = id;
        this.commandeItem = commandeItem;
        this.voeuxItem = voeuxItem;
        this.qte = qte;
        this.qteMin = qteMin;
        this.qteMax = qteMax;
        this.qteLivre = qteLivre;
        this.qteLivreMin = qteLivreMin;
        this.qteLivreMax = qteLivreMax;
        this.qteReception = qteReception;
        this.qteReceptionMin = qteReceptionMin;
        this.qteReceptionMax = qteReceptionMax;
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

    public BigDecimal getQteMin() {
        return qteMin;
    }

    public void setQteMin(BigDecimal qteMin) {
        this.qteMin = qteMin;
    }

    public BigDecimal getQteMax() {
        return qteMax;
    }

    public void setQteMax(BigDecimal qteMax) {
        this.qteMax = qteMax;
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

    public BigDecimal getQteReception() {
        return qteReception;
    }

    public void setQteReception(BigDecimal qteReception) {
        this.qteReception = qteReception;
    }

    public BigDecimal getQteReceptionMin() {
        return qteReceptionMin;
    }

    public void setQteReceptionMin(BigDecimal qteReceptionMin) {
        this.qteReceptionMin = qteReceptionMin;
    }

    public BigDecimal getQteReceptionMax() {
        return qteReceptionMax;
    }

    public void setQteReceptionMax(BigDecimal qteReceptionMax) {
        this.qteReceptionMax = qteReceptionMax;
    }
}
