package com.example.projetradiologie.service.impl;

import com.example.projetradiologie.bean.Patient;
import com.example.projetradiologie.bean.Prescription;
import com.example.projetradiologie.dao.PatientDao;
import com.example.projetradiologie.service.facade.PatientService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientDao patientDao;

    @Override
    public Patient findByCin(String cin) {
        return patientDao.findByCin(cin);
    }

    @Transactional
    @Override
    public int deleteByCin(String cin) {
        return patientDao.deleteByCin(cin);
    }

    public  List<Patient> findAll() {
        return patientDao.findAll();
    }

    public Patient update(Patient patient)
    {
        return patientDao.save(patient);
    }

    public Patient save(Patient patient) {

        Patient res;
        if(patientDao.findByCin(patient.getCin()) != null)
        {
            res = null;
            return res;
        }
        else {
            res = patientDao.save(patient);
            return res;

        }

    }
}
