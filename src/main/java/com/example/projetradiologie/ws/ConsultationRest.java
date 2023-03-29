package com.example.projetradiologie.ws;

import com.example.projetradiologie.bean.Consultation;
import com.example.projetradiologie.service.facade.ConsultationService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/api/C1/consultation")
public class ConsultationRest {
    @GetMapping("/libelle/{libelle}")
    public Consultation findByLibelle(@PathVariable String Libelle) {
        return consultationService.findByLibelle(Libelle);
    }

    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String Libelle) {
        return consultationService.deleteByLibelle(Libelle);
    }

    @GetMapping("/ref/{ref}")
    public List<Consultation> findByPrescriptionRef(String ref) {
        return consultationService.findByPrescriptionRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByPrescriptionRef(String ref) {
        return consultationService.deleteByPrescriptionRef(ref);
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
