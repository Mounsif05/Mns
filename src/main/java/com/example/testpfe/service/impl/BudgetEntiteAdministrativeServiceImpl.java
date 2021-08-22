package com.example.testpfe.service.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testpfe.Vo.BudgetEntiteAdministrativeVo;
import com.example.testpfe.bean.BudgetEntiteAdministrative;
import com.example.testpfe.bean.EntiteAdministrative;
import com.example.testpfe.dao.BudgetEntiteAdministrativeDao;
import com.example.testpfe.service.facade.BudgetEntiteAdministrativeService;
import com.example.testpfe.service.facade.EntiteAdministrativeService;

@SuppressWarnings("ALL")
@Service
public class BudgetEntiteAdministrativeServiceImpl implements BudgetEntiteAdministrativeService {
    @Autowired
    private BudgetEntiteAdministrativeDao budgetEntiteAdministrativeDao;
    @Autowired
    private EntiteAdministrativeService entiteAdministrativeService;
    @Autowired
    private EntityManager entityManager;

    @Override
    public BudgetEntiteAdministrative findByBudgetDetail(String budgetDetail) {
        return budgetEntiteAdministrativeDao.findByBudgetDetail(budgetDetail);
    }

    @Override
    public BudgetEntiteAdministrative findByBudget(String budget) {
        return budgetEntiteAdministrativeDao.findByBudget(budget);
    }

    @Override
    public BudgetEntiteAdministrative findByEntiteAdministrative(String entiteAdministrative) {
        return budgetEntiteAdministrativeDao.findByEntiteAdministrative(entiteAdministrative);
    }

    @Override
    public List<BudgetEntiteAdministrative> findByEntiteAdministrativeLibelle(String libelle) {
        return budgetEntiteAdministrativeDao.findByEntiteAdministrativeLibelle(libelle);
    }

    @Override
    public List<BudgetEntiteAdministrative> findByBudgetAnnee(Integer annee) {
        return budgetEntiteAdministrativeDao.findByBudgetAnnee(annee);
    }

    @Override
    public int deleteByEntiteAdministrativeLibelle(String libelle) {
        return budgetEntiteAdministrativeDao.deleteByEntiteAdministrativeLibelle(libelle);
    }

    @Override
    public int deleteByBudgetAnnee(Integer annee) {
        return budgetEntiteAdministrativeDao.deleteByBudgetAnnee(annee);
    }

    @Override
    public BudgetEntiteAdministrative save(BudgetEntiteAdministrative budgetEntiteAdministrative, String libelleEntiteAdministrative) {
        EntiteAdministrative entiteAdministrative = entiteAdministrativeService.findByLibelle(libelleEntiteAdministrative);
        if (entiteAdministrative == null)
            budgetEntiteAdministrativeDao.save(budgetEntiteAdministrative);
        return budgetEntiteAdministrative;
    }

    @Override
    public BudgetEntiteAdministrative update(BudgetEntiteAdministrative budgetEntiteAdministrative) {
        return budgetEntiteAdministrativeDao.save(budgetEntiteAdministrative);
    }

    @Override
    public List<BudgetEntiteAdministrative> search(BudgetEntiteAdministrativeVo budgetEntiteAdministrativeVo) {
        String q =  "select bea from BudgetEntiteAdministrative bea where 1=1";
        if(budgetEntiteAdministrativeVo.getBudget()!=null){
            q += " And bea.budget LIKE '%" + budgetEntiteAdministrativeVo.getBudget()+"%'";
        }
        if(budgetEntiteAdministrativeVo.getEntiteAdministrative()!=null){
            q += " And bea.entiteAdministrative = '%" + budgetEntiteAdministrativeVo.getEntiteAdministrative()+"%'";
        }
        if(budgetEntiteAdministrativeVo.getBudgetDetail()!=null){
            q += " And bea.budgetDetail = '%" + budgetEntiteAdministrativeVo.getBudgetDetail()+"%'";
        }
        return entityManager.createQuery(q).getResultList();
    }

    @Override
    public List<BudgetEntiteAdministrative> findAll() {
        return budgetEntiteAdministrativeDao.findAll();
    }


}
