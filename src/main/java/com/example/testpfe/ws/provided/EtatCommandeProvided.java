package com.example.testpfe.ws.provided;

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

import com.example.testpfe.Vo.EtatComandeVo;
import com.example.testpfe.bean.EtatCommande;
import com.example.testpfe.service.facade.EtatCommandeService;

@RestController
@RequestMapping("/testpfe/etat-commande")

public class EtatCommandeProvided {
    @Autowired
    private EtatCommandeService etatCommandeService;

    @PostMapping("/")
    public EtatCommande save(@RequestBody EtatCommande etatCommande) {
        return etatCommandeService.save(etatCommande);
    }

    @PutMapping("/")
    public EtatCommande update(@RequestBody EtatCommande etatCommande) {
        return etatCommandeService.update(etatCommande);
    }

    @PostMapping("/search")
    public List<EtatCommande> search(@RequestBody EtatComandeVo etatComandeVo) {
        return etatCommandeService.search(etatComandeVo);
    }

    @GetMapping("/")
    public List<EtatCommande> findAll() {
        return etatCommandeService.findAll();
    }

    @GetMapping("/libelle/{libelle}")
    public EtatCommande findByLibelle(@PathVariable String libelle) {
        return etatCommandeService.findByLibelle(libelle);
    }

    @GetMapping("/code/{code}")
    public EtatCommande findByCode(@PathVariable String code) {
        return etatCommandeService.findByCode(code);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return etatCommandeService.deleteByLibelle(libelle);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return etatCommandeService.deleteByCode(code);
    }
}
