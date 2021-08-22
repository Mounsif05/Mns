package com.example.testpfe.dao;


import com.example.testpfe.bean.Produit;
import com.example.testpfe.bean.Voeux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoeuxDao extends JpaRepository<Voeux, Long> {

    Voeux findByDescription(String description);

    Voeux findByReference(String reference);

    List<Voeux> findByBudgetAnneeAndDescription(Integer annee, String description);

    List<Voeux> findByEtatVoeuxLibelle(String libelle);

    List<Voeux> findByEntiteAdministrative(String entiteAdministrative);

    List<Voeux> findByEntiteAdministrativeCode(String code);

    List<Voeux> findByVoeuxItemsProduit(Produit produit);

    int deleteByReference(String reference);


}
