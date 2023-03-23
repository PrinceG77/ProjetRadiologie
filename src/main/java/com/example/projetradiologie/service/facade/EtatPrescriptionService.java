package com.example.projetradiologie.service.facade;

import com.example.projetradiologie.bean.EtatPrescription;
import com.example.projetradiologie.bean.HistoriquePrescription;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EtatPrescriptionService {

    public EtatPrescription findByCode(Long Code);

    EtatPrescription findByPrescriptionRef(String ref);

    public int deleteByCode(Long code);
    int deleteByPrescriptionRef(String ref);

    public List<EtatPrescription> findAll();

    public  int save(EtatPrescription etatPrescription);

}
