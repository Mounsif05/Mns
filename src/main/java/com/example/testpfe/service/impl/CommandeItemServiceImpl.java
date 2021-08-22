/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.impl;

import com.example.testpfe.bean.Commande;
import com.example.testpfe.bean.CommandeItem;
import com.example.testpfe.bean.Produit;
import com.example.testpfe.dao.CommandeItemDao;
import com.example.testpfe.service.facade.CommandeItemService;
import com.example.testpfe.service.facade.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author admin
 */
@Service
public class CommandeItemServiceImpl implements CommandeItemService {

    @Autowired
    private CommandeItemDao commandeItemDao;
    @Autowired
    private ProduitService produitService;

    @Override
    public int save(Commande commande, List<CommandeItem> commandeItems) {
        for (CommandeItem commandeItem : commandeItems) {
            Produit produit = produitService.findByRef(commandeItem.getProduit().getRef());
            commandeItem.setProduit(produit);
            if (produit != null) {
                commandeItem.setCommande(commande);
                commandeItemDao.save(commandeItem);
            }
        }
        return 1;

    }

    @Override
    public CommandeItem findByRef(String reference) {
        return commandeItemDao.findByRef(reference);
    }

    @Override
    public int deleteByRef(String reference) {
        return commandeItemDao.deleteByRef(reference);
    }

    @Override
    public int deleteByCommandeReference(String reference) {
        return commandeItemDao.deleteByCommandeReference(reference);
    }

    @Override
    public List<CommandeItem> findByCommandeReference(String reference) {
        return commandeItemDao.findByCommandeReference(reference);
    }

    @Override
    public int deleteByProduitRef(String reference) {
        return commandeItemDao.deleteByProduitRef(reference);
    }

    @Override
    public List<CommandeItem> findByProduitRef(String reference) {
        return commandeItemDao.findByProduitRef(reference);
    }

    @Override
    public List<CommandeItem> findAll() {
        return commandeItemDao.findAll();
    }

}
