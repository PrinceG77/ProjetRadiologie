package com.example.projetradiologie.service.facade;

import com.example.projetradiologie.bean.Patient;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService{
    Patient findByCin(String cin);
    @Transactional
    int deleteByCin(String cin);

    public List<Patient> findAll();

    public Patient save(Patient patient);


}
