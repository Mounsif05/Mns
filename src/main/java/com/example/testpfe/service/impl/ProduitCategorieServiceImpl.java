package com.example.testpfe.service.impl;

import com.example.testpfe.bean.ProduitCategorie;
import com.example.testpfe.dao.ProduitCategorieDao;
import com.example.testpfe.service.facade.ProduitCategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProduitCategorieServiceImpl implements ProduitCategorieService {

   @Autowired
   private ProduitCategorieDao produitCategorieDao;


    @Override
    public int save(ProduitCategorie produitCategorie) {
        ProduitCategorie loadedCategorieProduit = findByReference(produitCategorie.getReference());
        if (loadedCategorieProduit != null) {
            return -1;
        } else {
            produitCategorieDao.save(produitCategorie);
            return 1;
        }

    }

    @Override
    public ProduitCategorie findByReference(String ref) {
        return produitCategorieDao.findByReference(ref);
    }

    @Override
    public int deleteByReference(String ref) {
        return produitCategorieDao.deleteByReference(ref);
    }

    @Override
    public List<ProduitCategorie> findAll() {
        return produitCategorieDao.findAll();
    }

}
