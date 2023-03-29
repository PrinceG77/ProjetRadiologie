package com.example.projetradiologie.service.facade;

import com.example.projetradiologie.bean.Prescription;
import com.example.projetradiologie.bean.Seance;
import jakarta.transaction.Transactional;

import java.util.List;

public interface PrescriptionService {

    public Prescription findByPatientCin(String cin);
    @Transactional
    public int deleteByPatientCin(String cin);

    public List<Prescription> findAll();

    public Prescription save(Prescription prescription);

    Prescription findByRef(String ref);
    public int deleteByRef(String ref);
    public void update(Prescription prescription);
}
