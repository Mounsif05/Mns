package com.example.testpfe.service.facade;

import java.util.List;

import com.example.testpfe.Vo.BudgetVo;
import com.example.testpfe.bean.Budget;

public interface BudgetService {

    Budget save(Budget budget);

    Budget update(Budget budget);

    int deleteByAnnee(Integer annee);

    Budget findByBudgetDetail(String budgetDetail);

    Budget findByDescription(String description);

    List<Budget> findByAnnee(Integer annee);

    List<Budget> search(BudgetVo budgetVo);

    List<Budget> findAll();

}
