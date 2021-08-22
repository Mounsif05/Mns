/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.impl;

import com.example.testpfe.bean.Commande;
import com.example.testpfe.bean.Paiement;
import com.example.testpfe.bean.TypePaiement;
import com.example.testpfe.dao.PaiementDao;
import com.example.testpfe.service.facade.CommandeService;
import com.example.testpfe.service.facade.PaiementService;
import com.example.testpfe.service.facade.TypePaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author admin
 */
@Service
public class PaiementServiceImpl implements PaiementService {

    @Autowired
    private PaiementDao paiementDao;

    @Autowired
    private CommandeService commandeService;

    @Autowired
    private TypePaiementService typePaiementService;

    @Override
    public int save(Paiement paiement) {
        if (paiementDao.findByReference(paiement.getReference()) != null) {
            return -1;
        }
        Commande commande = commandeService.findByReference(paiement.getCommande().getReference());
        paiement.setCommande(commande);

        TypePaiement typePaiement = typePaiementService.findByRef(paiement.getTypePaiement().getRef());
        paiement.setTypePaiement(typePaiement);

        if (commande == null) {
            return -2;
        }
        if (typePaiement == null) {
            return -3;
        } else if (commande.getTotal().compareTo(commande.getTotalPaye().add(paiement.getMontant())) < 0) {
            return -4;
        } else {
            BigDecimal nvTotalPaye = commande.getTotalPaye().add(paiement.getMontant()) ;
            String type = typePaiement.getRef();
            paiement.setType(type);
            commande.setTotalPaye(nvTotalPaye);
            paiementDao.save(paiement);
            return 1;
        }

    }

    @Override
    public int deleteByCommandeReference(String reference) {
        return paiementDao.deleteByCommandeReference(reference);

    }

    @Override
    public List<Paiement> findByCommandeReference(String reference) {
        return paiementDao.findByCommandeReference(reference);
    }

    @Override
    public int deleteByTypePaiementRef(String reference) {
        return paiementDao.deleteByTypePaiementRef(reference);
    }

    @Override
    public List<Paiement> findByTypePaiementRef(String reference) {
        return paiementDao.findByTypePaiementRef(reference);
    }

    @Override
    public int deleteByReference(String refPaiement) {
        return paiementDao.deleteByReference(refPaiement);
    }

    @Override
    public Paiement findByReference(String refPaiement) {
        return paiementDao.findByReference(refPaiement);
    }

    @Override
    public List<Paiement> findAll() {
        return paiementDao.findAll();
    }

}
