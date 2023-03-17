package com.example.projetradiologie.webService;

import com.example.projetradiologie.bean.HistoriquePrescription;
import com.example.projetradiologie.service.facade.HistoriquePrescriptionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/H1/historiquePrescription")
public class HistoriquePrescriptionWebService {

    @GetMapping("/code/{code}")
    public HistoriquePrescription findByEtatPrescriptionCode(@PathVariable Long code) {
        return historiquePrescriptionService.findByEtatPrescriptionCode(code);
    }
    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByByEtatPrescriptionCode(@PathVariable Long code) {
        return historiquePrescriptionService.deleteByByEtatPrescriptionCode(code);
    }
    @GetMapping("/")
    public List<HistoriquePrescription> findAll() {
        return historiquePrescriptionService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody HistoriquePrescription historiquePrescription) {
        return historiquePrescriptionService.save(historiquePrescription);
    }

    @Autowired
    private HistoriquePrescriptionService historiquePrescriptionService;
}
