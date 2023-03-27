package com.example.projetradiologie.ws;

import com.example.projetradiologie.bean.Prescription;
import com.example.projetradiologie.bean.Seance;
import com.example.projetradiologie.service.facade.PrescriptionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
@RequestMapping("/api/PR/prescription")
public class PrescriptionRest {


    @PostMapping("/")
    public Prescription save(@RequestBody Prescription prescription, @RequestBody List<Seance> seances) {
        return prescriptionService.save(prescription, seances);
    }

    @GetMapping("/ref/{ref}")
    public Prescription findByRef(@PathVariable String ref) {
        return prescriptionService.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return prescriptionService.deleteByRef(ref);
    }

    @PutMapping("/")
    public void update(@RequestBody Prescription prescription) {
        prescriptionService.update(prescription);
    }

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

    @Autowired
    private PrescriptionService prescriptionService;
}
