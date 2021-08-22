/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.ws.provided;

import com.example.testpfe.bean.TypePaiement;
import com.example.testpfe.service.facade.TypePaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author admin
 */
@RestController
@RequestMapping("/testpfe/type-paiement")
public class TypePaiementProvidedRest {
    
    @Autowired
    private TypePaiementService typePaiementService;

    @GetMapping("/ref/{ref}")
    public TypePaiement findByRef(@PathVariable String ref) {
        return typePaiementService.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return typePaiementService.deleteByRef(ref);
    }

    @PostMapping("/")
    public int save(@RequestBody TypePaiement typePaiement) {
        return typePaiementService.save(typePaiement);
    }

    @GetMapping("/")
    public List<TypePaiement> findAll() {
        return typePaiementService.findAll();
    }
    
}
