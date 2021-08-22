package com.example.testpfe.dao;


import com.example.testpfe.bean.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface BudgetDao extends JpaRepository<Budget, Long> {

    Budget findByBudgetDetail(String budgetDetail);

    Budget findByDescription(String description);

    List<Budget> findByAnnee(Integer annee);

    int deleteByAnnee(Integer annee);


}
