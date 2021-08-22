package com.example.testpfe.service.facade;

import java.math.BigDecimal;
import java.util.List;

import com.example.testpfe.Vo.BudgetDetailVo;
import com.example.testpfe.bean.BudgetDetail;

public interface BudgetDetailService {

    BudgetDetail findByMtInvReelAndMtInvPayeAndMtInvReserve(BigDecimal mtInvReel, BigDecimal mtInvPaye, BigDecimal mtInvReserve);

    BudgetDetail findByMtInvReserve(BigDecimal mtInvReserve);

    BudgetDetail findByMtInvReel(BigDecimal mtInvReel);

    BudgetDetail findByMtInvPaye(BigDecimal mtInvPaye);

    BudgetDetail findByMtInvReserveReliquat(BigDecimal mtInvReserveReliquat);

    BudgetDetail findByMtInvPayeReliquat(BigDecimal mtInvPayeReliquat);

    BudgetDetail findByMtFnctAffecte(BigDecimal mtFnctAffecte);

    BudgetDetail findByMtInvAffecte(BigDecimal mtInvAffecte);

    BudgetDetail findByMtCreditOuvInv(BigDecimal mtCreditOuvInv);

    BudgetDetail findByMtCreditOuvFnct(BigDecimal mtCreditOuvFnct);

    BudgetDetail findByMtInvReelAndMtInvPaye(BigDecimal mtInvReel, BigDecimal mtInvPaye);

    int deleteByMtInvReserveReliquat(BigDecimal mtInvReserveReliquat);

    int deleteByMtInvPayeReliquat(BigDecimal mtInvPayeReliquat);

    BudgetDetail save(BudgetDetail budgetDetail);

    BudgetDetail update(BudgetDetail budgetDetail);

    List<BudgetDetail> search(BudgetDetailVo budgetDetailVo);

    int calculerMtInvPayeReliquat(BigDecimal mtInvReel, BigDecimal mtInvPaye);

    int calculerMtInvReserveReliquat(BigDecimal mtInvReel, BigDecimal mtInvReserve, BigDecimal mtInvPaye);

    List<BudgetDetail> findAll();
}
