package com.example.testpfe.dao;

import com.example.testpfe.bean.EtatCommande;
import com.example.testpfe.bean.EtatCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatComandeDao extends JpaRepository<EtatCommande, Long> {
    EtatCommande findByLibelle(String libelle);

    EtatCommande findByCode(String code);

    int deleteByLibelle(String libelle);

    int deleteByCode(String code);
}
