/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.facade;

import com.example.testpfe.bean.TypePaiement;

import java.util.List;

/**
 *
 * @author admin
 */
public interface TypePaiementService {

    public TypePaiement findByRef(String ref);

    public int deleteByRef(String ref);

    public int save(TypePaiement typePaiement);

    List<TypePaiement> findAll();
}
