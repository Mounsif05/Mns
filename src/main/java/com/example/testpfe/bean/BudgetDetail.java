package com.example.testpfe.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity

public class BudgetDetail {
    /* mtInvAffecte = 80 , mtFnctAffecte = 20 , mtCreditOuvInv = 5 , mtCreditOuvFct = 30 (creditOuv = 35 )
    <<<<<<< HEAD
    // mtInvReel = 107 , mtFnctReel = 28 , mtInvPaye = 70 , mtInvReserve = 35 , mtInvReserveReliquat = 2 ( reel - reserve -paye)
        // mtInvPayeReliquat = 37 ( reel - paye )
    =======
    // mtInvReel = 107 , mtFnctReel = 28 , mtInvPaye = 70 , mtInvReserve = 35 , mtInvReserveReliquat = 2 ( mtInvReel - mtInvReserve - mtInvPaye)
        // mtInvPayeReliquat = 37 ( mtInvReel - mtInvPaye )
    >>>>>>> branch 'master' of https://github.com/oussamagoumih1/pfe6v2/ */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private BigDecimal mtInvReel;
    private BigDecimal mtInvAffecte;
    private BigDecimal mtInvReserve;
    private BigDecimal mtInvPaye;
    private BigDecimal mtInvReserveReliquat;
    private BigDecimal mtInvPayeReliquat;

    private BigDecimal mtFnctReel;
    private BigDecimal mtFnctAffecte;
    private BigDecimal mtFnctReserve;
    private BigDecimal mtFnctPaye;
    private BigDecimal mtFnctReserveReliquat;
    private BigDecimal mtFnctPayeReliquat;

    private BigDecimal mtCreditOuvInv;
    private BigDecimal mtCreditOuvFnct;


    public BudgetDetail() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getMtInvReel() {
        return mtInvReel;
    }

    public void setMtInvReel(BigDecimal mtInvReel) {
        this.mtInvReel = mtInvReel;
    }

    public BigDecimal getMtInvAffecte() {
        return mtInvAffecte;
    }

    public void setMtInvAffecte(BigDecimal mtInvAffecte) {
        this.mtInvAffecte = mtInvAffecte;
    }

    public BigDecimal getMtInvReserve() {
        return mtInvReserve;
    }

    public void setMtInvReserve(BigDecimal mtInvReserve) {
        this.mtInvReserve = mtInvReserve;
    }

    public BigDecimal getMtInvPaye() {
        return mtInvPaye;
    }

    public void setMtInvPaye(BigDecimal mtInvPaye) {
        this.mtInvPaye = mtInvPaye;
    }

    public BigDecimal getMtInvReserveReliquat() {
        return mtInvReserveReliquat;
    }

    public void setMtInvReserveReliquat(BigDecimal mtInvReserveReliquat) {
        this.mtInvReserveReliquat = mtInvReserveReliquat;
    }

    public BigDecimal getMtInvPayeReliquat() {
        return mtInvPayeReliquat;
    }

    public void setMtInvPayeReliquat(BigDecimal mtInvPayeReliquat) {
        this.mtInvPayeReliquat = mtInvPayeReliquat;
    }

    public BigDecimal getMtFnctReel() {
        return mtFnctReel;
    }

    public void setMtFnctReel(BigDecimal mtFnctReel) {
        this.mtFnctReel = mtFnctReel;
    }

    public BigDecimal getMtFnctAffecte() {
        return mtFnctAffecte;
    }

    public void setMtFnctAffecte(BigDecimal mtFnctAffecte) {
        this.mtFnctAffecte = mtFnctAffecte;
    }

    public BigDecimal getMtFnctReserve() {
        return mtFnctReserve;
    }

    public void setMtFnctReserve(BigDecimal mtFnctReserve) {
        this.mtFnctReserve = mtFnctReserve;
    }

    public BigDecimal getMtFnctPaye() {
        return mtFnctPaye;
    }

    public void setMtFnctPaye(BigDecimal mtFnctPaye) {
        this.mtFnctPaye = mtFnctPaye;
    }

    public BigDecimal getMtFnctReserveReliquat() {
        return mtFnctReserveReliquat;
    }

    public void setMtFnctReserveReliquat(BigDecimal mtFnctReserveReliquat) {
        this.mtFnctReserveReliquat = mtFnctReserveReliquat;
    }

    public BigDecimal getMtFnctPayeReliquat() {
        return mtFnctPayeReliquat;
    }

    public void setMtFnctPayeReliquat(BigDecimal mtFnctPayeReliquat) {
        this.mtFnctPayeReliquat = mtFnctPayeReliquat;
    }

    public BigDecimal getMtCreditOuvInv() {
        return mtCreditOuvInv;
    }

    public void setMtCreditOuvInv(BigDecimal mtCreditOuvInv) {
        this.mtCreditOuvInv = mtCreditOuvInv;
    }

    public BigDecimal getMtCreditOuvFnct() {
        return mtCreditOuvFnct;
    }

    public void setMtCreditOuvFnct(BigDecimal mtCreditOuvFnct) {
        this.mtCreditOuvFnct = mtCreditOuvFnct;
    }
}
