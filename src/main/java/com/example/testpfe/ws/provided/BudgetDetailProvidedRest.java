package com.example.testpfe.ws.provided;


import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testpfe.Vo.BudgetDetailVo;
import com.example.testpfe.bean.BudgetDetail;
import com.example.testpfe.service.facade.BudgetDetailService;

@RestController
@RequestMapping("/testpfe/budget-detail")
public class BudgetDetailProvidedRest {
    @Autowired
    private BudgetDetailService budgetDetailService;

    @GetMapping("/mtInvReel/{mtInvReel}/mtInvPaye/{mtInvPaye}/mtInvReserve/{mtInvReserve}")
    public BudgetDetail findByMtInvReelAndMtInvPayeAndMtInvReserve(@PathVariable BigDecimal mtInvReel, @PathVariable BigDecimal mtInvPaye, @PathVariable BigDecimal mtInvReserve) {
        return budgetDetailService.findByMtInvReelAndMtInvPayeAndMtInvReserve(mtInvReel, mtInvPaye, mtInvReserve);
    }

    @GetMapping("/mtInvReserve/{mtInvReserve}")
    public BudgetDetail findByMtInvReserve(@PathVariable BigDecimal mtInvReserve) {
        return budgetDetailService.findByMtInvReserve(mtInvReserve);
    }

    @GetMapping("/mtInvReel/{mtInvReel}")
    public BudgetDetail findByMtInvReel(@PathVariable BigDecimal mtInvReel) {
        return budgetDetailService.findByMtInvReel(mtInvReel);
    }

    @GetMapping("/mtInvPaye/{mtInvPaye}")
    public BudgetDetail findByMtInvPaye(@PathVariable BigDecimal mtInvPaye) {
        return budgetDetailService.findByMtInvPaye(mtInvPaye);
    }

    @GetMapping("/mtInvReserveReliquat/{mtInvReserveReliquat}")
    public BudgetDetail findByMtInvReserveReliquat(@PathVariable BigDecimal mtInvReserveReliquat) {
        return budgetDetailService.findByMtInvReserveReliquat(mtInvReserveReliquat);
    }

    @GetMapping("/mtInvPayeReliquat/{mtInvPayeReliquat}")
    public BudgetDetail findByMtInvPayeReliquat(@PathVariable BigDecimal mtInvPayeReliquat) {
        return budgetDetailService.findByMtInvPayeReliquat(mtInvPayeReliquat);
    }

    @GetMapping("/mtFnctAffecte/{mtFnctAffecte}")
    public BudgetDetail findByMtFnctAffecte(@PathVariable BigDecimal mtFnctAffecte) {
        return budgetDetailService.findByMtFnctAffecte(mtFnctAffecte);
    }

    @GetMapping("/mtInvAffecte/{mtInvAffecte}")
    public BudgetDetail findByMtInvAffecte(@PathVariable BigDecimal mtInvAffecte) {
        return budgetDetailService.findByMtInvAffecte(mtInvAffecte);
    }

    @GetMapping("/mtCreditOuvInv/{mtCreditOuvInv}")
    public BudgetDetail findByMtCreditOuvInv(@PathVariable BigDecimal mtCreditOuvInv) {
        return budgetDetailService.findByMtCreditOuvInv(mtCreditOuvInv);
    }

    @GetMapping("/mtCreditOuvFnct/{mtCreditOuvFnct}")
    public BudgetDetail findByMtCreditOuvFnct(@PathVariable BigDecimal mtCreditOuvFnct) {
        return budgetDetailService.findByMtCreditOuvFnct(mtCreditOuvFnct);
    }

    @GetMapping("/mtInvReel/{mtInvReel}/mtInvPaye/{mtInvPaye}")
    public BudgetDetail findByMtInvReelAndMtInvPaye(@PathVariable BigDecimal mtInvReel, @PathVariable BigDecimal mtInvPaye) {
        return budgetDetailService.findByMtInvReelAndMtInvPaye(mtInvReel, mtInvPaye);
    }

    @DeleteMapping("/mtInvReserveReliquat/{mtInvReserveReliquat}")
    public int deleteByMtInvReserveReliquat(@PathVariable BigDecimal mtInvReserveReliquat) {
        return budgetDetailService.deleteByMtInvReserveReliquat(mtInvReserveReliquat);
    }

    @DeleteMapping("/mtInvPayeReliquat/{mtInvPayeReliquat}")
    public int deleteByMtInvPayeReliquat(@PathVariable BigDecimal mtInvPayeReliquat) {
        return budgetDetailService.deleteByMtInvPayeReliquat(mtInvPayeReliquat);
    }

    @PostMapping("/")
    public BudgetDetail save(@RequestBody BudgetDetail budgetDetail) {
        return budgetDetailService.save(budgetDetail);
    }

    @PutMapping("/")
    public BudgetDetail update(@RequestBody BudgetDetail budgetDetail) {
        return budgetDetailService.update(budgetDetail);
    }

    @PostMapping("/search")
    public List<BudgetDetail> search(@RequestBody BudgetDetailVo budgetDetailVo) {
        return budgetDetailService.search(budgetDetailVo);
    }

    @GetMapping("/")
    public List<BudgetDetail> findAll() {
        return budgetDetailService.findAll();
    }

    @PutMapping("/mtInvReel/{mtInvReel}/mtInvPaye/{mtInvPaye}")
    public int calculerMtInvPayeReliquat(@PathVariable BigDecimal mtInvReel, @PathVariable BigDecimal mtInvPaye) {
        return budgetDetailService.calculerMtInvPayeReliquat(mtInvReel, mtInvPaye);
    }

    @PutMapping("/mtInvReel/{mtInvReel}/mtInvReserve/{mtInvReserve}/mtInvPaye/{mtInvPaye}")
    public int calculerMtInvReserveReliquat(@PathVariable BigDecimal mtInvReel, @PathVariable BigDecimal mtInvReserve, @PathVariable BigDecimal mtInvPaye) {
        return budgetDetailService.calculerMtInvReserveReliquat(mtInvReel, mtInvReserve, mtInvPaye);
    }
}
