package com.example.projetradiologie.webService;

import com.example.projetradiologie.bean.Prescription;
import com.example.projetradiologie.service.facade.PrescriptionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
@RequestMapping("/api/PR/prescription")
public class PrescriptionWebService {
    @GetMapping("/cin/{cin}")
    public Prescription findByPatientCin(@PathVariable String cin) {
        return prescriptionService.findByPatientCin(cin);
    }

    @DeleteMapping("/cin/{cin}")
    @Transactional
    public int deleteByPatientCin(@PathVariable String cin) {
        return prescriptionService.deleteByPatientCin(cin);
    }
    @GetMapping("/")
    public List<Prescription> findAll() {
        return prescriptionService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody Prescription prescription) {
        return prescriptionService.save(prescription);
    }

    @Autowired
    private PrescriptionService prescriptionService;
}
