package com.example.testpfe.dao;

import com.example.testpfe.bean.EtatVoeux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatVoeuxDao extends JpaRepository<EtatVoeux, Long> {
    EtatVoeux findByLibelle(String libelle);

    EtatVoeux findByCode(String code);

    int deleteByCode(String code);


}
