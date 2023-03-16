package com.example.projetradiologie.service.facade;

import com.example.projetradiologie.bean.Prescription;
import jakarta.transaction.Transactional;

import java.util.List;

public interface PrescriptionService {

    public Prescription findByPatientCin(String cin);
    @Transactional
    public int deleteByPatientCin(String cin);

    public List<Prescription> findAll();

    public int save(Prescription prescription);
}
