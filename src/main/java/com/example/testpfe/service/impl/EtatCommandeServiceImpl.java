package com.example.testpfe.service.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testpfe.Vo.EtatComandeVo;
import com.example.testpfe.bean.EtatCommande;
import com.example.testpfe.dao.EtatComandeDao;
import com.example.testpfe.service.facade.EtatCommandeService;

@Service
public class EtatCommandeServiceImpl implements EtatCommandeService {
    @Autowired
    private EtatComandeDao etatComandeDao;


    @Autowired
    private EntityManager entityManager;


    @Override
    public EtatCommande save(EtatCommande etatComande) {
        if (findByLibelle(etatComande.getLibelle())==null)
            etatComandeDao.save(etatComande);
        return etatComande;
    }

    @Override
    public EtatCommande update(EtatCommande etatComande) {
        return etatComandeDao.save(etatComande);
    }

    @Override
    public List<EtatCommande> search(EtatComandeVo etatComandeVo) {
        String q = "select ec from EtatCommande ec where 1=1";
        if (etatComandeVo.getLibelle()!=null){
            q += " And ec.libelle LIKE '%" + etatComandeVo.getLibelle() + "%'";
        }
        if (etatComandeVo.getCode()!=null){
            q += " And ec.code LIKE '%" + etatComandeVo.getCode() + "%'";
        }
        return  entityManager.createQuery(q).getResultList();
    }

    @Override
    public List<EtatCommande> findAll() {
        return etatComandeDao.findAll();
    }

    @Override
    public EtatCommande findByLibelle(String libelle) {
        return etatComandeDao.findByLibelle(libelle);
    }

    @Override
    public EtatCommande findByCode(String code) {
        return etatComandeDao.findByCode(code);
    }

    @Override
    public int deleteByLibelle(String libelle) {
        return etatComandeDao.deleteByLibelle(libelle);
    }

    @Override
    public int deleteByCode(String code) {
        return etatComandeDao.deleteByCode(code);
    }
}
