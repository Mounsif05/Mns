/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.dao;


import com.example.testpfe.bean.ProduitCategorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
@Repository
public interface ProduitCategorieDao extends JpaRepository<ProduitCategorie, Long> {

    public ProduitCategorie findByReference(String ref);

    public int deleteByReference(String ref);
    
    

}
