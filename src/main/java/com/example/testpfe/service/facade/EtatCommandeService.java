package com.example.testpfe.service.facade;

import java.util.List;

import com.example.testpfe.Vo.EtatComandeVo;
import com.example.testpfe.bean.EtatCommande;

public interface EtatCommandeService {
    EtatCommande save(EtatCommande etatComande);

    EtatCommande update(EtatCommande etatComande);

    List<EtatCommande> search(EtatComandeVo etatComandeVo);

    List<EtatCommande> findAll();

    EtatCommande findByLibelle(String libelle);

    EtatCommande findByCode(String code);

    int deleteByLibelle(String libelle);

    int deleteByCode(String code);
}
