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

    @GetMapping("ref/{ref}")
    public HistoriquePrescription findByPrescriptionRef(String ref) {
        return historiquePrescriptionService.findByPrescriptionRef(ref);
    }

    @DeleteMapping("ref/{ref}")
    public int deleteByPrescriptionRef(String ref) {
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

    @Autowired
    private HistoriquePrescriptionService historiquePrescriptionService;
}
