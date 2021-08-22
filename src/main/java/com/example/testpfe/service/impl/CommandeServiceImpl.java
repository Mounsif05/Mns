/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.impl;

import com.example.testpfe.bean.Commande;
import com.example.testpfe.bean.CommandeItem;
import com.example.testpfe.dao.CommandeDao;
import com.example.testpfe.service.facade.CommandeItemService;
import com.example.testpfe.service.facade.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author admin
 */
@Service
public class CommandeServiceImpl implements CommandeService {

    @Autowired
    private CommandeDao commandeDao;

    @Autowired
    private CommandeItemService commandeItemService;

    @Override
    public int save(Commande commande) {

        Commande loadedCommande = findByReference(commande.getReference());
        if (loadedCommande != null) {
            return -1;
        } else if (commande.getTotal().compareTo(commande.getTotalPaye())  <0) {
            return -2;

        } else {
            calculerTotal(commande, commande.getCommandeItems());
            commandeDao.save(commande);
            commandeItemService.save(commande, commande.getCommandeItems());
            return 1;
        }
    }

    private void calculerTotal(Commande commande, List<CommandeItem> commandeItems) {
        BigDecimal total = BigDecimal.valueOf(0);
        for (CommandeItem commandeItem : commandeItems) {
            total = commandeItem.getPrix().multiply(commandeItem.getQteCommandee());
        }
        commande.setTotal(total);
    }

    @Override
    public Commande findByReference(String reference) {
        return commandeDao.findByReference(reference);
    }

    @Override
    public int deleteByReference(String reference) {
        return commandeDao.deleteByReference(reference);
    }

    @Override
    public List<Commande> findAll() {
        return commandeDao.findAll();
    }

}
