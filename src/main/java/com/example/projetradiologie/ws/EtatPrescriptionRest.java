package com.example.projetradiologie.ws;

import com.example.projetradiologie.bean.EtatPrescription;
import com.example.projetradiologie.service.facade.EtatPrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/E1/etatPrescription")
public class EtatPrescriptionRest {

    @Autowired
    private EtatPrescriptionService etatPrescriptionService;

    @GetMapping("/code/{code}")
    public EtatPrescription findByCode(Long Code) {
        return etatPrescriptionService.findByCode(Code);
    }

    @GetMapping("/ref/{ref}")
    public EtatPrescription findByPrescriptionRef(String ref) {
        return etatPrescriptionService.findByPrescriptionRef(ref);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(Long code) {
        return etatPrescriptionService.deleteByCode(code);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByPrescriptionRef(String ref) {
        return etatPrescriptionService.deleteByPrescriptionRef(ref);
    }

    public List<EtatPrescription> findAll() {
        return etatPrescriptionService.findAll();
    }

    public int save(EtatPrescription etatPrescription) {
        return etatPrescriptionService.save(etatPrescription);
    }
}
