/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.facade;

import com.example.testpfe.bean.Commande;

import java.util.List;

/**
 *
 * @author admin
 */
public interface CommandeService {

    public Commande findByReference(String reference);

    public int deleteByReference(String reference);

    public int save(Commande commande);

    List<Commande> findAll();
}
