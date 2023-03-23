package com.example.projetradiologie.ws;

import com.example.projetradiologie.bean.Frequence;
import com.example.projetradiologie.service.facade.FrequenceService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/F1/frequence")
public class FrequenceRest {

    @GetMapping("/code/{code}")
    public Frequence findByCode(@PathVariable String code) {
        return frequenceService.findByCode(code);
    }
    @DeleteMapping("/code/{code}")

    public int deleteByCode(@PathVariable String code) {
        return frequenceService.deleteByCode(code);
    }

    @GetMapping("/ref/{ref}")
    public Frequence findByPrescriptionRef(String ref) {
        return frequenceService.findByPrescriptionRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByPrescriptionRef(String ref) {
        return frequenceService.deleteByPrescriptionRef(ref);
    }

    @PostMapping("/")
    public int save(@RequestBody Frequence frequence) {
        return frequenceService.save(frequence);
    }

    @Autowired
    private FrequenceService frequenceService;
}
