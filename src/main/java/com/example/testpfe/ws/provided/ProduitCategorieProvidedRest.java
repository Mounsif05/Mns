/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.ws.provided;

import com.example.testpfe.bean.ProduitCategorie;
import com.example.testpfe.service.facade.ProduitCategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author admin
 */

@RestController
@RequestMapping("/testpfe/produit-categorie")
public class ProduitCategorieProvidedRest {
    
    @Autowired 
    private ProduitCategorieService produitCategorieService;

    @GetMapping("/reference/{reference}")
    public ProduitCategorie findByReference(@PathVariable String reference) {
        return produitCategorieService.findByReference(reference);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference( @PathVariable String reference) {
        return produitCategorieService.deleteByReference(reference);
    }

    @PostMapping("/")
    public int save(@RequestBody ProduitCategorie produitCategorie) {
        return produitCategorieService.save(produitCategorie);
    }

    @GetMapping("/")
    public List<ProduitCategorie> findAll() {
        return produitCategorieService.findAll();
    }
    
}
