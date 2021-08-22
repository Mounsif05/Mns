package com.example.testpfe.Vo;

public class BudgetEntiteAdministrativeVo {

    private Long id;
    private BudgetVo budget;
    private EntiteAdministrativeVo entiteAdministrative;
    private BudgetDetailVo budgetDetail;

    public BudgetEntiteAdministrativeVo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BudgetVo getBudget() {
        return budget;
    }

    public void setBudget(BudgetVo budget) {
        this.budget = budget;
    }

    public EntiteAdministrativeVo getEntiteAdministrative() {
        return entiteAdministrative;
    }

    public void setEntiteAdministrative(EntiteAdministrativeVo entiteAdministrative) {
        this.entiteAdministrative = entiteAdministrative;
    }

    public BudgetDetailVo getBudgetDetail() {
        return budgetDetail;
    }

    public void setBudgetDetail(BudgetDetailVo budgetDetail) {
        this.budgetDetail = budgetDetail;
    }
}
