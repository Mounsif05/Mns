/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.ws.provided;

import com.example.testpfe.bean.Paiement;
import com.example.testpfe.service.facade.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author admin
 */
@RestController
@RequestMapping("/testpfe/paiement")
public class PaiementProvidedRest {

    @Autowired
    private PaiementService paiementService;

    @DeleteMapping("/commande/reference/{reference}")
    public int deleteByCommandeReference(@PathVariable String reference) {
        return paiementService.deleteByCommandeReference(reference);
    }

    @GetMapping("/commande/reference/{reference}")
    public List<Paiement> findByCommandeReference(@PathVariable String reference) {
        return paiementService.findByCommandeReference(reference);
    }

    @DeleteMapping("/type-paiement/ref/{reference}")
    public int deleteByTypePaiementRef(@PathVariable String reference) {
        return paiementService.deleteByTypePaiementRef(reference);
    }

    @GetMapping("/type-paiement/ref/{reference}")
    public List<Paiement> findByTypePaiementRef(@PathVariable String reference) {
        return paiementService.findByTypePaiementRef(reference);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String refPaiement) {
        return paiementService.deleteByReference(refPaiement);
    }

    @GetMapping("/reference/{reference}")
    public Paiement findByReference(@PathVariable String refPaiement) {
        return paiementService.findByReference(refPaiement);
    }

    @GetMapping("/")
    public List<Paiement> findAll() {
        return paiementService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Paiement paiement) {
        return paiementService.save(paiement);
    }

}
