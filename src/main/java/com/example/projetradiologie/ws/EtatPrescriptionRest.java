package com.example.projetradiologie.ws;

import com.example.projetradiologie.bean.EtatPrescription;
import com.example.projetradiologie.service.facade.EtatPrescriptionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/api/E1/etatPrescription")
public class EtatPrescriptionRest {

    @Autowired
    private EtatPrescriptionService etatPrescriptionService;


    @GetMapping("/libelle/{libelle}")
    public EtatPrescription findByLibelle(String libelle) {
        return etatPrescriptionService.findByLibelle(libelle);
    }

    @DeleteMapping("/libelle/{libelle}")
    @Transactional
    public int deleteByLibelle(String libelle) {
        return etatPrescriptionService.deleteByLibelle(libelle);
    }

    @GetMapping("/")
    public List<EtatPrescription> findAll() {
        return etatPrescriptionService.findAll();
    }

    @PostMapping("/")
    public int save(EtatPrescription etatPrescription) {
        return etatPrescriptionService.save(etatPrescription);
    }
}
