/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.dao;


import com.example.testpfe.bean.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
@Repository
public interface CommandeDao extends JpaRepository<Commande, Long> {

    public Commande findByReference(String reference);

    public int deleteByReference(String reference);

}
