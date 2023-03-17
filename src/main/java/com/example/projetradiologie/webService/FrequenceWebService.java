package com.example.projetradiologie.webService;

import com.example.projetradiologie.bean.Frequence;
import com.example.projetradiologie.service.facade.FrequenceService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/F1/frequence")
public class FrequenceWebService {

    @GetMapping("/code/{code}")
    public Frequence findByCode(@PathVariable String code) {
        return frequenceService.findByCode(code);
    }
    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return frequenceService.deleteByCode(code);
    }

    @PostMapping("/")
    public int save(@RequestBody Frequence frequence) {
        return frequenceService.save(frequence);
    }

    @Autowired
    private FrequenceService frequenceService;
}
