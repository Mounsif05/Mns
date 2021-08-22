/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.facade;

import com.example.testpfe.bean.Paiement;

import java.util.List;

/**
 *
 * @author admin
 */
public interface PaiementService {

    public int deleteByCommandeReference(String reference);

    public List<Paiement> findByCommandeReference(String reference);

    public int deleteByTypePaiementRef(String reference);

    public List<Paiement> findByTypePaiementRef(String reference);

    public int deleteByReference(String refPaiement);

    public Paiement findByReference(String refPaiement);

    List<Paiement> findAll();

    public int save(Paiement paiement);
}
