package com.example.projetradiologie.webService;

import com.example.projetradiologie.bean.Consultation;
import com.example.projetradiologie.service.facade.ConsultationService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/C1/consultation")
public class ConsultationWebService {
    @GetMapping("/libelle/{libelle}")
    public Consultation findByLibelle(@PathVariable String Libelle) {
        return consultationService.findByLibelle(Libelle);
    }

    @DeleteMapping("/libelle/{libelle}")
    @Transactional
    public int deleteByLibelle(@PathVariable String Libelle) {
        return consultationService.deleteByLibelle(Libelle);
    }
    @GetMapping("/")
    public List<Consultation> findAll() {
        return consultationService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody Consultation consultation) {
        return consultationService.save(consultation);
    }

    @Autowired
    private ConsultationService consultationService;
}
