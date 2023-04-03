package com.example.projetradiologie.ws;


import com.example.projetradiologie.bean.Patient;
import com.example.projetradiologie.service.facade.PatientService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/PR/patient")
public class PatientRest {
    @GetMapping("/cin/{cin}")
    public Patient findByCin(@PathVariable String cin) {
        return patientService.findByCin(cin);
    }

    @DeleteMapping("/cin/{cin}")
    @Transactional
    public int deleteByCin(@PathVariable String cin) {
        return patientService.deleteByCin(cin);
    }

    @GetMapping("/")
    public List<Patient> findAll() {
        return patientService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Patient patient) {
        return patientService.save(patient);
    }

    @Autowired
    private PatientService patientService;
}
