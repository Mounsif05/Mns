/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.facade;

import com.example.testpfe.bean.ProduitCategorie;

import java.util.List;

/**
 *
 * @author admin
 */
public interface ProduitCategorieService {

    public ProduitCategorie findByReference(String ref);

    public int deleteByReference(String ref);

    public int save(ProduitCategorie produitCategorie);

    List<ProduitCategorie> findAll();
}
