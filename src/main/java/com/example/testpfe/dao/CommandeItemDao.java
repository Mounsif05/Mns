/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.dao;

import com.example.testpfe.bean.CommandeItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author admin
 */
@Repository
public interface CommandeItemDao extends JpaRepository<CommandeItem, Long> {

    public CommandeItem findByRef(String reference);

    public int deleteByRef(String reference);

    public int deleteByCommandeReference(String reference);

    public List<CommandeItem> findByCommandeReference(String reference);

    public int deleteByProduitRef(String reference);

    public List<CommandeItem> findByProduitRef(String reference);

}
