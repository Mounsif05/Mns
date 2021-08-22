package com.example.testpfe.service.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testpfe.Vo.BudgetVo;
import com.example.testpfe.bean.Budget;
import com.example.testpfe.dao.BudgetDao;
import com.example.testpfe.service.facade.BudgetService;

@Service
public class BudgetServiceImpl implements BudgetService {
    @Autowired
    private BudgetDao budgetDao;
    @Autowired
    private EntityManager entityManager;

    @Override
    public Budget save(Budget budget) {
        if (findByAnnee(budget.getAnnee())==null)
        budgetDao.save(budget);
        return budget;
    }

    @Override
    public Budget update(Budget budget) {
        return budgetDao.save(budget);
    }

    @Override
    public int deleteByAnnee(Integer annee) {
        return budgetDao.deleteByAnnee(annee);
    }


    @Override
    public Budget findByBudgetDetail(String budgetDetail) {
        return budgetDao.findByBudgetDetail(budgetDetail);
    }

    @Override
    public Budget findByDescription(String description) {
        return budgetDao.findByDescription(description);
    }

    @Override
    public List<Budget> findByAnnee(Integer annee) {
        return budgetDao.findByAnnee(annee);
    }


    @Override
    public List<Budget> search(BudgetVo budgetVo) {
        String q =  "select b from Budget b where 1=1";
        if(budgetVo.getDescription()!=null){
            q += " And b.description LIKE '%" + budgetVo.getDescription()+"%'";
        }
        if(budgetVo.getAnneeMin()!=null){
            q += " And b.annee >= '%" + budgetVo.getAnneeMin()+"%'";
        }
        if(budgetVo.getAnneeMax()!=null){
            q += " And b.annee <= '%" + budgetVo.getAnneeMax()+"%'";
        }
        if(budgetVo.getBudgetDetail()!=null){
            q += " And b.budgetDetail = '%" + budgetVo.getBudgetDetail()+"%'";
        }
        return entityManager.createQuery(q).getResultList();
    }

    @Override
    public List<Budget> findAll() {
        return budgetDao.findAll();
    }

}
