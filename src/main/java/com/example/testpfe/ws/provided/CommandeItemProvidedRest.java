/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.ws.provided;

import com.example.testpfe.bean.CommandeItem;
import com.example.testpfe.service.facade.CommandeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author admin
 */
@RestController
@RequestMapping("/testpfe/commande-item")
public class CommandeItemProvidedRest {

    @Autowired
    private CommandeItemService commandeItemService;

    @GetMapping("/")
    public List<CommandeItem> findAll() {
        return commandeItemService.findAll();
    }
/*
    public CommandeItem findByRef(String reference) {
        return commandeItemService.findByRef(reference);
    }

    public int deleteByRef(String reference) {
        return commandeItemService.deleteByRef(reference);
    }

    public int deleteByCommandeReference(String reference) {
        return commandeItemService.deleteByCommandeReference(reference);
    }

    public List<CommandeItem> findByCommandeReference(String reference) {
        return commandeItemService.findByCommandeReference(reference);
    }

    public int deleteByProduitRef(String reference) {
        return commandeItemService.deleteByProduitRef(reference);
    }

    public List<CommandeItem> findByProduitRef(String reference) {
        return commandeItemService.findByProduitRef(reference);
    }

    public int save(Commande commande, List<CommandeItem> commandeItems) {
        return commandeItemService.save(commande, commandeItems);
    }
*/

}
