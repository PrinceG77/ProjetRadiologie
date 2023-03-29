package com.example.projetradiologie.ws;

import com.example.projetradiologie.bean.EtatPrescription;
import com.example.projetradiologie.service.facade.EtatPrescriptionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/PR/etatPrescription")
public class EtatPrescriptionRest {

    @Autowired
    private EtatPrescriptionService etatPrescriptionService;


    public EtatPrescription findByLibelle(String libelle) {
        return etatPrescriptionService.findByLibelle(libelle);
    }

    @Transactional
    public int deleteByLibelle(String libelle) {
        return etatPrescriptionService.deleteByLibelle(libelle);
    }

    public List<EtatPrescription> findAll() {
        return etatPrescriptionService.findAll();
    }

    public int save(EtatPrescription etatPrescription) {
        return etatPrescriptionService.save(etatPrescription);
    }
}
