package com.example.testpfe.service.facade;

import java.util.List;

import com.example.testpfe.Vo.EtatVoeuxVo;
import com.example.testpfe.bean.EtatVoeux;

public interface EtatVoeuxService {

    EtatVoeux save(EtatVoeux etatVoeux);

    EtatVoeux update(EtatVoeux etatVoeux);

    EtatVoeux findByLibelle(String libelle);

    EtatVoeux findByCode(String code);

    int deleteByCode(String code);

    List<EtatVoeux> search(EtatVoeuxVo etatVoeuxVo);

    List<EtatVoeux> findAll();
}
