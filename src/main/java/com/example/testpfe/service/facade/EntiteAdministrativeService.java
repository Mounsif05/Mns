package com.example.testpfe.service.facade;

import java.util.List;

import com.example.testpfe.Vo.EntiteAdministrativeVo;
import com.example.testpfe.bean.EntiteAdministrative;

public interface EntiteAdministrativeService {

    EntiteAdministrative findByCode(String code);

    EntiteAdministrative findByLibelle(String libelle);

    EntiteAdministrative findByCodeAndLibelle(String code, String libelle);

    EntiteAdministrative save(EntiteAdministrative entiteAdministrative);

    EntiteAdministrative update(EntiteAdministrative entiteAdministrative);

    int deleteByLibelle(String libelle);

    List<EntiteAdministrative> search(EntiteAdministrativeVo entiteAdministrativeVo);

    List<EntiteAdministrative> findAll();

}
