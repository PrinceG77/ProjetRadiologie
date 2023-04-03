package com.example.projetradiologie.ws;

import com.example.projetradiologie.bean.Frequence;
import com.example.projetradiologie.service.facade.FrequenceService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/PR/frequence")
public class FrequenceRest {


    @GetMapping("/libelle/{libelle}")
    public Frequence findByLibelle(String Libelle) {
        return frequenceService.findByLibelle(Libelle);
    }
    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(String Libelle) {
        return frequenceService.deleteByLibelle(Libelle);
    }

    @PostMapping("/")
    public int save(@RequestBody Frequence frequence) {
        return frequenceService.save(frequence);
    }

    @Autowired
    private FrequenceService frequenceService;
}
