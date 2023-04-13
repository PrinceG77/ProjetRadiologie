package com.example.projetradiologie.ws;

import com.example.projetradiologie.bean.HistoriquePrescription;
import com.example.projetradiologie.service.facade.HistoriquePrescriptionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/PR/historiquePrescription")
public class HistoriquePrescriptionRest {

    @GetMapping("/prescription/ref/{ref}")
    public List<HistoriquePrescription> findByPrescriptionRef(@PathVariable String ref) {
        return historiquePrescriptionService.findByPrescriptionRef(ref);
    }

    @DeleteMapping("/prescription/ref/{ref}")
    public int deleteByPrescriptionRef(@PathVariable String ref) {
        return historiquePrescriptionService.deleteByPrescriptionRef(ref);
    }

    @GetMapping("/")
    public List<HistoriquePrescription> findAll() {
        return historiquePrescriptionService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody HistoriquePrescription historiquePrescription) {
        return historiquePrescriptionService.save(historiquePrescription);
    }

    @PutMapping("/")
    public HistoriquePrescription update(HistoriquePrescription historiquePrescription) {
        return historiquePrescriptionService.update(historiquePrescription);
    }

    @Autowired
    private HistoriquePrescriptionService historiquePrescriptionService;
}
