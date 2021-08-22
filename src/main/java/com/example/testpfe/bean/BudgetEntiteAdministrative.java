package com.example.testpfe.bean;


import javax.persistence.*;

@Entity

public class BudgetEntiteAdministrative {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Budget budget;
    @OneToOne
    private EntiteAdministrative entiteAdministrative;
    @OneToOne
    private BudgetDetail budgetDetail;

    public BudgetEntiteAdministrative() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public EntiteAdministrative getEntiteAdministrative() {
        return entiteAdministrative;
    }

    public void setEntiteAdministrative(EntiteAdministrative entiteAdministrative) {
        this.entiteAdministrative = entiteAdministrative;
    }

    public BudgetDetail getBudgetDetail() {
        return budgetDetail;
    }

    public void setBudgetDetail(BudgetDetail budgetDetail) {
        this.budgetDetail = budgetDetail;
    }
}
