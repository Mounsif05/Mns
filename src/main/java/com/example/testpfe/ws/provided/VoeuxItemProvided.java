package com.example.testpfe.ws.provided;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testpfe.Vo.VoeuxItemVo;
import com.example.testpfe.bean.Produit;
import com.example.testpfe.bean.VoeuxItem;
import com.example.testpfe.service.facade.VoeuxItemService;

@RestController
@RequestMapping("/testpfe/voeux-item")

public class VoeuxItemProvided {
    @Autowired
    private VoeuxItemService voeuxItemService;

    @PostMapping("/")
    public VoeuxItem save(@RequestBody VoeuxItem voeuxItem) {
        return voeuxItemService.save(voeuxItem);
    }

    @PutMapping("/")
    public VoeuxItem update(@RequestBody VoeuxItem voeuxItem) {
        return voeuxItemService.update(voeuxItem);
    }

    @GetMapping("/produit/{produit}")
    public List<VoeuxItem> findByProduit(@PathVariable Produit produit) {
        return voeuxItemService.findByProduit(produit);
    }

    @GetMapping("/qteDemande/{qteDemande}")
    public VoeuxItem findByQteDemande(@PathVariable BigDecimal qteDemande) {
        return voeuxItemService.findByQteDemande(qteDemande);
    }

    @GetMapping("/qteAccorde/{qteAccorde}")
    public VoeuxItem findByQteAccorde(@PathVariable BigDecimal qteAccorde) {
        return voeuxItemService.findByQteAccorde(qteAccorde);
    }

    @GetMapping("/qteCommande/{qteCommande}")
    public VoeuxItem findByQteCommande(@PathVariable BigDecimal qteCommande) {
        return voeuxItemService.findByQteCommande(qteCommande);
    }

    @GetMapping("/qteReceptionne/{qteReceptionne}")
    public VoeuxItem findByQteReceptionne(@PathVariable BigDecimal qteReceptionne) {
        return voeuxItemService.findByQteReceptionne(qteReceptionne);
    }

    @GetMapping("/qteLivre/{qteLivre}")
    public VoeuxItem findByQteLivre(@PathVariable BigDecimal qteLivre) {
        return voeuxItemService.findByQteLivre(qteLivre);
    }

    @GetMapping("/Voeux/reference/{reference}")
    public List<VoeuxItem> findByVoeuxReference(@PathVariable String reference) {
        return voeuxItemService.findByVoeuxReference(reference);
    }

    @DeleteMapping("/qteCommande/{qteCommande}")
    public int deleteByQteCommande(@PathVariable BigDecimal qteCommande) {
        return voeuxItemService.deleteByQteCommande(qteCommande);
    }

    @DeleteMapping("/qteLivre/{qteLivre}")
    public int deleteByQteLivre(@PathVariable BigDecimal qteLivre) {
        return voeuxItemService.deleteByQteLivre(qteLivre);
    }

    @PostMapping("/search")
    public List<VoeuxItem> search(@RequestBody VoeuxItemVo voeuxItemVo) {
        return voeuxItemService.search(voeuxItemVo);
    }

    @GetMapping("/")
    public List<VoeuxItem> findAll() {
        return voeuxItemService.findAll();
    }

    @PutMapping("/qteCommande/{qteCommande}/qteLivre/{qteLivre}")
    public int qteExpd(@PathVariable BigDecimal qteCommande, BigDecimal qteLivre) {
        return voeuxItemService.qteExpd(qteCommande, qteLivre);
    }
}
