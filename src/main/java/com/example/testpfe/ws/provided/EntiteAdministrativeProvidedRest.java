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

import com.example.testpfe.Vo.EntiteAdministrativeVo;
import com.example.testpfe.bean.EntiteAdministrative;
import com.example.testpfe.service.facade.EntiteAdministrativeService;

@RestController
@RequestMapping("/pfe/entite-administrative")
public class EntiteAdministrativeProvidedRest {
    @Autowired
    private EntiteAdministrativeService entiteAdministrativeService;

    @GetMapping("/code/{code}")
    public EntiteAdministrative findByCode(@PathVariable String code) {
        return entiteAdministrativeService.findByCode(code);
    }

    @GetMapping("/libelle/{libelle}")
    public EntiteAdministrative findByLibelle(@PathVariable String libelle) {
        return entiteAdministrativeService.findByLibelle(libelle);
    }

    @GetMapping("/code/{code}/libelle/{libelle}")
    public EntiteAdministrative findByCodeAndLibelle(@PathVariable String code, @PathVariable String libelle) {
        return entiteAdministrativeService.findByCodeAndLibelle(code, libelle);
    }

    @PostMapping("/")
    public EntiteAdministrative save(@RequestBody EntiteAdministrative entiteAdministrative) {
        return entiteAdministrativeService.save(entiteAdministrative);
    }

    @PutMapping("/")
    public EntiteAdministrative update(@RequestBody EntiteAdministrative entiteAdministrative) {
        return entiteAdministrativeService.update(entiteAdministrative);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return entiteAdministrativeService.deleteByLibelle(libelle);
    }


    @PostMapping("/search")
    public List<EntiteAdministrative> search(@RequestBody EntiteAdministrativeVo entiteAdministrativeVo) {
        return entiteAdministrativeService.search(entiteAdministrativeVo);
    }

    @GetMapping("/")
    public List<EntiteAdministrative> findAll() {
        return entiteAdministrativeService.findAll();
    }
}
