package com.example.testpfe.service.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import com.example.testpfe.bean.*;
import com.example.testpfe.service.facade.VoeuxItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testpfe.Vo.VoeuxVo;
import com.example.testpfe.dao.VoeuxDao;
import com.example.testpfe.service.facade.VoeuxService;

@Service
public class VoeuxServiceImpl implements VoeuxService {

    @Autowired
    private VoeuxDao voeuxDao;
    @Autowired
    private EntityManager entityManager;
@Autowired
private VoeuxItemService voeuxItemService;


    @Override
    public int save(Voeux voeux) {

        if (findByReference(voeux.getReference()) ==null)
            return -1;
        else {
          //  calculerlivre(voeux, voeux.getVoeuxItems());
            voeuxDao.save(voeux);
            voeuxItemService.save(voeux, voeux.getVoeuxItems());
            return 1;
        }
    }



    private void calculerlivre(Voeux voeux, List<VoeuxItem> voeuxItems) {
        BigDecimal livre = BigDecimal.valueOf(0);
        for (VoeuxItem voeuxItem : voeuxItems) {
            livre = voeuxItem.getQteReceptionne().subtract(voeuxItem.getQteLivre());
        }
    }

    @Override
    public Voeux update(Voeux voeux) {
        return voeuxDao.save(voeux);
    }

    @Override
    public int deleteByReference(String reference) {
        return voeuxDao.deleteByReference(reference);
    }


    @Override
    public Voeux findByDescription(String description) {
        return voeuxDao.findByDescription(description);
    }

    @Override
    public Voeux findByReference(String reference) {
        return voeuxDao.findByReference(reference);
    }

    @Override
    public List<Voeux> findByBudgetAnneeAndDescription(Integer annee, String description) {
        return voeuxDao.findByBudgetAnneeAndDescription(annee, description);
    }

    @Override
    public List<Voeux> findByEntiteAdministrative(String entiteAdministrative) {
        return voeuxDao.findByEntiteAdministrative(entiteAdministrative);
    }

    @Override
    public List<Voeux> findByEntiteAdministrativeCode(String code) {
        return voeuxDao.findByEntiteAdministrativeCode(code);
    }


    @Override
    public List<Voeux> findByEtatVoeuxLibelle(String libelle) {
        return voeuxDao.findByEtatVoeuxLibelle(libelle);
    }



    @Override
    public List<Voeux> findByVoeuxItemsProduit(Produit produit) {
        return voeuxDao.findByVoeuxItemsProduit(produit);
    }

    @Override
    public List<Voeux> search(VoeuxVo voeuxVo) {
        String q = "select v from Voeux v where 1=1";
        if (voeuxVo.getReference() != null){
            q += " And v.reference LIKE '%" + voeuxVo.getReference() + "%'";
        }
        if (voeuxVo.getDescription() != null){
            q += " And v.description LIKE '%" + voeuxVo.getDescription() + "%'";
        }
return entityManager.createQuery(q).getResultList();
    }

    @Override
    public List<Voeux> findAll() {
        return voeuxDao.findAll();
    }
}
