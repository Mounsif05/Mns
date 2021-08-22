package com.example.testpfe.service.facade;

import com.example.testpfe.Vo.VoeuxCommandVo;
import com.example.testpfe.bean.CommandeItem;
import com.example.testpfe.bean.VoeuxCommand;
import com.example.testpfe.bean.VoeuxItem;

import java.math.BigDecimal;
import java.util.List;

public interface VoeuxCommandService {

    List<VoeuxCommand> findByCommandeItem(CommandeItem commandeItem);
    List<VoeuxCommand> findByVoeuxItem(VoeuxItem voeuxItem);
    VoeuxCommand findByQte(BigDecimal qte);
    VoeuxCommand findByQteLivre(BigDecimal qteLivre);
    VoeuxCommand findByQteReception(BigDecimal qteReception);
    int deleteByQteLivre(BigDecimal qteLivre);
    int deleteByQteReception(BigDecimal qteReception);
    VoeuxCommand update(VoeuxCommand voeuxCommand);
    int save(VoeuxCommand voeuxCommand, BigDecimal qteLivre, BigDecimal qteReception, BigDecimal qte);
    List<VoeuxCommand> search(VoeuxCommandVo voeuxCommandVo);
    List<VoeuxCommand> findAll();
}
