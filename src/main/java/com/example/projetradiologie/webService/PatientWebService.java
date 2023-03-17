package com.example.projetradiologie.webService;


import com.example.projetradiologie.bean.Patient;
import com.example.projetradiologie.service.facade.PatientService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/P1/patient")
public class PatientWebService {
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
