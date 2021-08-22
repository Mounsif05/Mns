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

import com.example.testpfe.Vo.EtatVoeuxVo;
import com.example.testpfe.bean.EtatVoeux;
import com.example.testpfe.service.facade.EtatVoeuxService;

@RestController
@RequestMapping("/testpfe/etat-voeux")

public class EtatVoeuxProvided {
    @Autowired
    private EtatVoeuxService etatVoeuxService;

    @PostMapping("/")
    public EtatVoeux save(@RequestBody EtatVoeux etatVoeux) {
        return etatVoeuxService.save(etatVoeux);
    }

    @PutMapping("/")
    public EtatVoeux update(@RequestBody EtatVoeux etatVoeux) {
        return etatVoeuxService.update(etatVoeux);
    }

    @GetMapping("/libelle/{libelle}")
    public EtatVoeux findByLibelle(@PathVariable String libelle) {
        return etatVoeuxService.findByLibelle(libelle);
    }

    @GetMapping("/code/{code}")
    public EtatVoeux findByCode(@PathVariable String code) {
        return etatVoeuxService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return etatVoeuxService.deleteByCode(code);
    }

    @PostMapping("/search")
    public List<EtatVoeux> search(@RequestBody EtatVoeuxVo etatVoeuxVo) {
        return etatVoeuxService.search(etatVoeuxVo);
    }

    @GetMapping("/")
    public List<EtatVoeux> findAll() {
        return etatVoeuxService.findAll();
    }
}
