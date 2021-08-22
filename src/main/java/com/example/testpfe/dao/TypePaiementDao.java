/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.dao;


import com.example.testpfe.bean.TypePaiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author admin
 */
@Repository
public interface TypePaiementDao extends JpaRepository<TypePaiement, Long> {

    public TypePaiement findByRef(String ref);

    public int deleteByRef(String ref);

  


}
