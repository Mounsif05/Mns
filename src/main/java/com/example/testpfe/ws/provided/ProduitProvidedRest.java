/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.ws.provided;

import com.example.testpfe.bean.Produit;
import com.example.testpfe.service.facade.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author admin
 */

@RestController
@RequestMapping("/testpfe/produit")
public class ProduitProvidedRest {
    
    @Autowired
    private ProduitService produitService;

    @GetMapping("/ref/{ref}")
    public Produit findByRef(@PathVariable String ref) {
        return produitService.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return produitService.deleteByRef(ref);
    }

    @PostMapping("/")
    public int save(@RequestBody Produit produit) {
        return produitService.save(produit);
    }

    @GetMapping("/")
    public List<Produit> findAll() {
        return produitService.findAll();
    }
    
}
