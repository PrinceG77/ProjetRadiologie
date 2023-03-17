package com.example.projetradiologie.service.facade;

import com.example.projetradiologie.bean.EtatPrescription;
import com.example.projetradiologie.bean.HistoriquePrescription;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EtatPrescriptionService {

    public EtatPrescription findByCode(Long Code);

    public int deleteByCode(Long code);

    public List<EtatPrescription> findAll();

    public  int save(EtatPrescription etatPrescription);

}
