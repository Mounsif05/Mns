package com.example.testpfe.ws.provided;

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

import com.example.testpfe.Vo.BudgetVo;
import com.example.testpfe.bean.Budget;
import com.example.testpfe.service.facade.BudgetService;

@RestController
@RequestMapping("/pfe/budget")
public class BudgetProvidedRest {
    @Autowired
    private BudgetService budgetService;

    @PostMapping("/")
    public Budget save(@RequestBody Budget budget) {
        return budgetService.save(budget);
    }

    @PutMapping("/")
    public Budget update(@RequestBody Budget budget) {
        return budgetService.update(budget);
    }

    @DeleteMapping("/annee/{annee}")
    public int deleteByAnnee(@PathVariable Integer annee) {
        return budgetService.deleteByAnnee(annee);
    }


    @GetMapping("/budgetDetail/{budgetDetail}")
    public Budget findByBudgetDetail(@PathVariable String budgetDetail) {
        return budgetService.findByBudgetDetail(budgetDetail);
    }

    @GetMapping("/description/{description}")
    public Budget findByDescription(@PathVariable String description) {
        return budgetService.findByDescription(description);
    }

    @GetMapping("/annee/{annee}")
    public List<Budget> findByAnnee(@PathVariable Integer annee) {
        return budgetService.findByAnnee(annee);
    }


    @GetMapping("/")
    public List<Budget> findAll() {
        return budgetService.findAll();
    }

    @PostMapping("/search")
    public List<Budget> search(@RequestBody BudgetVo budgetVo) {
        return budgetService.search(budgetVo);

    }
}
