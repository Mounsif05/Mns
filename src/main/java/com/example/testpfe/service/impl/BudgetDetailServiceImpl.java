package com.example.testpfe.service.impl;


import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testpfe.Vo.BudgetDetailVo;
import com.example.testpfe.bean.BudgetDetail;
import com.example.testpfe.dao.BudgetDetailDao;
import com.example.testpfe.service.facade.BudgetDetailService;

@Service
public class BudgetDetailServiceImpl implements BudgetDetailService {
    @Autowired
    private BudgetDetailDao budgetDetailDao;
    @Autowired
    private EntityManager entityManager;


    @Override
    public BudgetDetail findByMtInvReserve(BigDecimal mtInvReserve) {
        return budgetDetailDao.findByMtInvReserve(mtInvReserve);
    }

    @Override
    public BudgetDetail findByMtInvReel(BigDecimal mtInvReel) {
        return budgetDetailDao.findByMtInvReel(mtInvReel);
    }

    @Override
    public BudgetDetail findByMtInvPaye(BigDecimal mtInvPaye) {
        return budgetDetailDao.findByMtInvPaye(mtInvPaye);
    }

    @Override
    public BudgetDetail findByMtInvReserveReliquat(BigDecimal mtInvReserveReliquat) {
        return budgetDetailDao.findByMtInvReserveReliquat(mtInvReserveReliquat);
    }

    @Override
    public BudgetDetail findByMtInvPayeReliquat(BigDecimal mtInvPayeReliquat) {
        return budgetDetailDao.findByMtInvPayeReliquat(mtInvPayeReliquat);
    }

    @Override
    public BudgetDetail findByMtFnctAffecte(BigDecimal mtFnctAffecte) {
        return budgetDetailDao.findByMtFnctAffecte(mtFnctAffecte);
    }

    @Override
    public BudgetDetail findByMtInvAffecte(BigDecimal mtInvAffecte) {
        return budgetDetailDao.findByMtInvAffecte(mtInvAffecte);
    }

    @Override
    public BudgetDetail findByMtCreditOuvInv(BigDecimal mtCreditOuvInv) {
        return budgetDetailDao.findByMtCreditOuvInv(mtCreditOuvInv);
    }

    @Override
    public BudgetDetail findByMtCreditOuvFnct(BigDecimal mtCreditOuvFnct) {
        return budgetDetailDao.findByMtCreditOuvFnct(mtCreditOuvFnct);
    }

    @Override
    public BudgetDetail findByMtInvReelAndMtInvPaye(BigDecimal mtInvReel, BigDecimal mtInvPaye) {
        return budgetDetailDao.findByMtInvReelAndMtInvPaye(mtInvReel, mtInvPaye);
    }

    @Override
    public int deleteByMtInvReserveReliquat(BigDecimal mtInvReserveReliquat) {
        return budgetDetailDao.deleteByMtInvReserveReliquat(mtInvReserveReliquat);
    }

    @Override
    public int deleteByMtInvPayeReliquat(BigDecimal mtInvPayeReliquat) {
        return budgetDetailDao.deleteByMtInvPayeReliquat(mtInvPayeReliquat);
    }

    @Override
    public BudgetDetail save(BudgetDetail budgetDetail) {
        if (findByMtInvPayeReliquat(budgetDetail.getMtInvPayeReliquat()) == null)
            budgetDetailDao.save(budgetDetail);
        return budgetDetail;
    }

    @Override
    public BudgetDetail update(BudgetDetail budgetDetail) {
        return budgetDetailDao.save(budgetDetail);
    }

    @Override
    public List<BudgetDetail> search(BudgetDetailVo budgetDetailVo) {
        String q = "select bd from BudgetDetail bd where 1=1";
        if (budgetDetailVo.getId() != null) {
            q += " And bd.id LIKE '%" + budgetDetailVo.getId() + "%'";
        }
        if (budgetDetailVo.getMtInvPayeReliquatMin() != null) {
            q += " And bd.mtInvPayeReliquat >= " + budgetDetailVo.getMtInvPayeReliquatMin();
        }
        if (budgetDetailVo.getMtInvPayeReliquatMax() != null) {
            q += " And bd.mtInvPayeReliquat <= " + budgetDetailVo.getMtInvPayeReliquatMax();
        }
        if (budgetDetailVo.getMtInvReserveReliquatMin() != null) {
            q += " And bd.mtInvReserveReliquat >= " + budgetDetailVo.getMtInvReserveReliquatMin();
        }
        if (budgetDetailVo.getMtInvReserveReliquatMax() != null) {
            q += " And bd.mtInvReserveReliquat <= " + budgetDetailVo.getMtInvReserveReliquatMax();
        }
        return entityManager.createQuery(q).getResultList();
    }

    @Override
    public int calculerMtInvPayeReliquat(BigDecimal mtInvReel, BigDecimal mtInvPaye) {
        BudgetDetail budgetDetail = budgetDetailDao.findByMtInvReelAndMtInvPaye(mtInvReel, mtInvPaye);
        if (budgetDetail == null) {
            return -1;
        } else if (budgetDetail.getMtInvPayeReliquat() .compareTo (mtInvReel.subtract(mtInvPaye)) <0) {
            return -2;
        } else {
            BigDecimal nvMtInvPayeReliquat = budgetDetail.getMtInvPayeReliquat();
            nvMtInvPayeReliquat = (mtInvReel.subtract(mtInvPaye));
            budgetDetail.setMtInvPayeReliquat(nvMtInvPayeReliquat);
            return 1;
        }
    }


    @Override
    public int calculerMtInvReserveReliquat(BigDecimal mtInvReel, BigDecimal mtInvReserve, BigDecimal mtInvPaye) {
        BudgetDetail budgetDetail = budgetDetailDao.findByMtInvReelAndMtInvPayeAndMtInvReserve(mtInvReel, mtInvPaye, mtInvReserve);
        if (budgetDetail == null) {
            return -1;
        } else if (budgetDetail.getMtInvReserveReliquat().compareTo (mtInvReel.subtract(mtInvReserve).subtract(mtInvPaye)) <0) {
            return -2;
        } else {
            BigDecimal nvMtInvReserveReliquat = budgetDetail.getMtInvReserveReliquat();
            nvMtInvReserveReliquat = (mtInvReel.subtract(mtInvReserve).subtract(mtInvPaye));
            budgetDetail.setMtInvReserveReliquat(nvMtInvReserveReliquat);
            return 1;
        }
    }

    @Override
    public BudgetDetail findByMtInvReelAndMtInvPayeAndMtInvReserve(BigDecimal mtInvReel, BigDecimal mtInvPaye, BigDecimal mtInvReserve) {
        return budgetDetailDao.findByMtInvReelAndMtInvPayeAndMtInvReserve(mtInvReel, mtInvPaye, mtInvReserve);
    }

    @Override
    public List<BudgetDetail> findAll() {
        return budgetDetailDao.findAll();
    }
}
