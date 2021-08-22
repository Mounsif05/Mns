package com.example.testpfe.service.facade;

import java.util.List;

import com.example.testpfe.Vo.BudgetEntiteAdministrativeVo;
import com.example.testpfe.bean.BudgetEntiteAdministrative;

public interface BudgetEntiteAdministrativeService {

    BudgetEntiteAdministrative findByBudgetDetail(String budgetDetail);

    BudgetEntiteAdministrative findByBudget(String budget);

    BudgetEntiteAdministrative findByEntiteAdministrative(String entiteAdministrative);

    List<BudgetEntiteAdministrative> findByEntiteAdministrativeLibelle(String libelle);

    List<BudgetEntiteAdministrative> findByBudgetAnnee(Integer annee);

    int deleteByEntiteAdministrativeLibelle(String libelle);

    int deleteByBudgetAnnee(Integer annee);

    BudgetEntiteAdministrative save(BudgetEntiteAdministrative budgetEntiteAdministrative, String libelleEntiteAdministrative);

    BudgetEntiteAdministrative update(BudgetEntiteAdministrative budgetEntiteAdministrative);

    List<BudgetEntiteAdministrative> findAll();

    List<BudgetEntiteAdministrative> search(BudgetEntiteAdministrativeVo budgetEntiteAdministrativeVo);
}
