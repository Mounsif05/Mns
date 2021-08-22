/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.service.impl;

import com.example.testpfe.bean.TypePaiement;
import com.example.testpfe.dao.TypePaiementDao;
import com.example.testpfe.service.facade.TypePaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author admin
 */
@Service
public class TypePaiementServiceImpl implements TypePaiementService {

    @Autowired
    private TypePaiementDao typePaiementDao;


    @Override
    public int save(TypePaiement typePaiement) {
        TypePaiement loadedTypePaiement = findByRef(typePaiement.getRef());
        if (loadedTypePaiement != null) {
            return -1;
        } else {
            typePaiementDao.save(typePaiement);
            return 1;
        }

    }

    @Override
    public TypePaiement findByRef(String ref) {
        return typePaiementDao.findByRef(ref);
    }

    @Override
    public int deleteByRef(String ref) {
        return typePaiementDao.deleteByRef(ref);
    }

    @Override
    public List<TypePaiement> findAll() {
        return typePaiementDao.findAll();
    }

}
