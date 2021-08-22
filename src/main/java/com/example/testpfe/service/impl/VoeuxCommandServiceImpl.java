package com.example.testpfe.service.impl;

import com.example.testpfe.Vo.VoeuxCommandVo;
import com.example.testpfe.bean.CommandeItem;
import com.example.testpfe.bean.VoeuxCommand;
import com.example.testpfe.bean.VoeuxItem;
import com.example.testpfe.service.facade.VoeuxCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.testpfe.dao.VoeuxCommandDao;
import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

@Service
public class VoeuxCommandServiceImpl implements VoeuxCommandService {

    @Autowired
    private VoeuxCommandDao voeuxCommandDao;
@Autowired
private EntityManager entityManager;



    @Override
    public List<VoeuxCommand> findByCommandeItem(CommandeItem commandeItem) {
        return voeuxCommandDao.findByCommandeItem(commandeItem);
    }

    @Override
    public List<VoeuxCommand> findByVoeuxItem(VoeuxItem voeuxItem) {
        return voeuxCommandDao.findByVoeuxItem(voeuxItem);
    }

    @Override
    public VoeuxCommand findByQte(BigDecimal qte) {
        return voeuxCommandDao.findByQte(qte);
    }

    @Override
    public VoeuxCommand findByQteLivre(BigDecimal qteLivre) {
        return voeuxCommandDao.findByQteLivre(qteLivre);
    }

    @Override
    public VoeuxCommand findByQteReception(BigDecimal qteReception) {
        return voeuxCommandDao.findByQteReception(qteReception);
    }

    @Override
    public int deleteByQteLivre(BigDecimal qteLivre) {
        return voeuxCommandDao.deleteByQteLivre(qteLivre);
    }

    @Override
    public int deleteByQteReception(BigDecimal qteReception) {
        return voeuxCommandDao.deleteByQteReception(qteReception);
    }

    @Override
    public VoeuxCommand update(VoeuxCommand voeuxCommand) {
        return voeuxCommandDao.save(voeuxCommand);
    }

    @Override
    public int save(VoeuxCommand voeuxCommand, BigDecimal qteLivre, BigDecimal qteReception, BigDecimal qte) {
        if (findByQteReception(voeuxCommand.getQteReception()) == null)  {
            return -1;
        }

         else {
            BigDecimal nQte = voeuxCommand.getQteReception();
            nQte = (qteReception.subtract(qteLivre));
            voeuxCommand.setQte(nQte);
            voeuxCommandDao.save(voeuxCommand);
            return 1;
        }

    }

    @Override
    public List<VoeuxCommand> search(VoeuxCommandVo voeuxCommandVo) {
        String q = "select vc from VoeuxCommand vc where 1=1";
        if (voeuxCommandVo.getId() != null) {
            q += " And vc.id LIKE '%" + voeuxCommandVo.getId() + "%'";

        }
        if (voeuxCommandVo.getQteMin() != null){
            q += " And vc.qte >= " + voeuxCommandVo.getQteMin();
        }
        if (voeuxCommandVo.getQteMax() != null){
            q += " And vc.qte <= " + voeuxCommandVo.getQteMax();
        }
        if (voeuxCommandVo.getQteLivreMin() != null) {
            q += " And vc.qteLivre >= " + voeuxCommandVo.getQteLivreMin();
        }
        if (voeuxCommandVo.getQteLivreMax() != null) {
            q += " And vc.qteLivre <= " + voeuxCommandVo.getQteLivreMax();
        }
        if (voeuxCommandVo.getQteReceptionMin() != null) {
            q += " And vc.qteReception >= " + voeuxCommandVo.getQteReceptionMin();
        }
        if (voeuxCommandVo.getQteReceptionMax() != null) {
            q += " And vc.qteReception <= " + voeuxCommandVo.getQteReceptionMax();
        }
        return entityManager.createQuery(q).getResultList();
    }

    @Override
    public List<VoeuxCommand> findAll() {
        return voeuxCommandDao.findAll();
    }
}
