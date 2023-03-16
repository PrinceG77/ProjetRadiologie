package com.example.projetradiologie.webService;

import com.example.projetradiologie.service.facade.EtatPrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/E1/etatPrescription")
public class EtatPrescriptionWebService {

    @Autowired
    private EtatPrescriptionService etatPrescriptionService;
}
