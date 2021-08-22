package com.example.testpfe.dao;

import com.example.testpfe.bean.CommandeItem;
import com.example.testpfe.bean.VoeuxCommand;
import com.example.testpfe.bean.VoeuxItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface VoeuxCommandDao extends JpaRepository<VoeuxCommand, Long> {

    List<VoeuxCommand> findByCommandeItem(CommandeItem commandeItem);
    List<VoeuxCommand> findByVoeuxItem(VoeuxItem voeuxItem);
    VoeuxCommand findByQte(BigDecimal qte);
    VoeuxCommand findByQteLivre(BigDecimal qteLivre);
    VoeuxCommand findByQteReception(BigDecimal qteReception);
    int deleteByQteLivre(BigDecimal qteLivre);
    int deleteByQteReception(BigDecimal qteReception);

}
