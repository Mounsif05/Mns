package com.example.testpfe.service.facade;

import java.math.BigDecimal;
import java.util.List;

import com.example.testpfe.Vo.VoeuxItemVo;
import com.example.testpfe.bean.Produit;
import com.example.testpfe.bean.Voeux;
import com.example.testpfe.bean.VoeuxItem;

public interface VoeuxItemService {
    VoeuxItem save(VoeuxItem voeuxItem);

    VoeuxItem update(VoeuxItem voeuxItem);

    List<VoeuxItem> findByProduit(Produit produit);

    VoeuxItem findByQteDemande(BigDecimal qteDemande);

    VoeuxItem findByQteAccorde(BigDecimal qteAccorde);

    VoeuxItem findByQteCommande(BigDecimal qteCommande);

    VoeuxItem findByQteReceptionne(BigDecimal qteReceptionne);

    VoeuxItem findByQteLivre(BigDecimal qteLivre);

    List<VoeuxItem> findByVoeuxReference(String reference);

    int deleteByQteCommande(BigDecimal qteCommande);

    int deleteByQteLivre(BigDecimal qteLivre);

    List<VoeuxItem> search(VoeuxItemVo voeuxItemVo);

    List<VoeuxItem> findAll();

    int qteExpd(BigDecimal qteCommande, BigDecimal qteLivre);

    int save(Voeux voeux, List<VoeuxItem> voeuxItems);
}
