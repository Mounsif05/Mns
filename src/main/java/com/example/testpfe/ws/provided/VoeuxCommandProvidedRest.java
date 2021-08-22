package com.example.testpfe.ws.provided;

import com.example.testpfe.Vo.VoeuxCommandVo;
import com.example.testpfe.bean.CommandeItem;
import com.example.testpfe.bean.VoeuxCommand;
import com.example.testpfe.bean.VoeuxItem;
import com.example.testpfe.service.facade.VoeuxCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/testpfe/voeux-command")
public class VoeuxCommandProvidedRest {
    @Autowired
    private VoeuxCommandService voeuxCommandService;

    @PostMapping("/")
    public int save(@RequestBody VoeuxCommand voeuxCommand, @PathVariable BigDecimal qteLivre, @PathVariable BigDecimal qteReception, @PathVariable BigDecimal qte){
        return voeuxCommandService.save(voeuxCommand, qteLivre, qteReception,qte);
    }
    @PutMapping("/")
    public VoeuxCommand update(@RequestBody VoeuxCommand voeuxCommand){
        return  voeuxCommandService.update(voeuxCommand);
    }
    @GetMapping("/commandItem/{commandItem}")
    public List<VoeuxCommand> findByCommandItem(@PathVariable CommandeItem commandeItem){
        return voeuxCommandService.findByCommandeItem(commandeItem);
    }
    @GetMapping("/voeuxItem/{voeuxItem}")
    public List<VoeuxCommand> findByVoeuxItem(@PathVariable VoeuxItem voeuxItem){
        return voeuxCommandService.findByVoeuxItem(voeuxItem);
    }
    @GetMapping("/qte/{qte}")
    public VoeuxCommand findByQte(@PathVariable BigDecimal qte){
        return voeuxCommandService.findByQte(qte);
    }
    @GetMapping("/qteLivrer/{qteLivrer}")
    public VoeuxCommand findByQteLivrer(@PathVariable BigDecimal qteLivrer){
        return  voeuxCommandService.findByQteLivre(qteLivrer);
    }
    @GetMapping("/qteReception/{qteReception}")
    public VoeuxCommand findByQteReception(@PathVariable BigDecimal qteReception){
        return voeuxCommandService.findByQteReception(qteReception);
    }
    @DeleteMapping("/qteLivrer/{qteLivrer}")
    public int deleteByQteLivrer(@PathVariable BigDecimal qteLivrer){
        return voeuxCommandService.deleteByQteLivre(qteLivrer);
    }
    @DeleteMapping("/qteReception/{qteReception}")
    public int deleteByQteReception(@PathVariable BigDecimal qteReception){
        return voeuxCommandService.deleteByQteReception(qteReception);
    }
    @PostMapping("/search")
    public List<VoeuxCommand> search(@RequestBody VoeuxCommandVo voeuxCommandVo){
        return voeuxCommandService.search(voeuxCommandVo);
    }
    @GetMapping("/")
    public List<VoeuxCommand> findAll(){
        return voeuxCommandService.findAll();
    }
}
