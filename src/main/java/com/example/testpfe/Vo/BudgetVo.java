package com.example.testpfe.Vo;

public class BudgetVo {
    private Long id;
    private Integer annee;
    private Integer anneeMin;
    private Integer anneeMax;
    private String description;
    private BudgetDetailVo budgetDetail;

    public BudgetVo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Integer getAnneeMin() {
        return anneeMin;
    }

    public void setAnneeMin(Integer anneeMin) {
        this.anneeMin = anneeMin;
    }

    public Integer getAnneeMax() {
        return anneeMax;
    }

    public void setAnneeMax(Integer anneeMax) {
        this.anneeMax = anneeMax;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BudgetDetailVo getBudgetDetail() {
        return budgetDetail;
    }

    public void setBudgetDetail(BudgetDetailVo budgetDetail) {
        this.budgetDetail = budgetDetail;
    }
}
