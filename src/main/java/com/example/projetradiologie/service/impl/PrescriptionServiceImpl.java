package com.example.projetradiologie.service.impl;

import com.example.projetradiologie.bean.Patient;
import com.example.projetradiologie.bean.Prescription;
import com.example.projetradiologie.dao.PrescriptionDao;
import com.example.projetradiologie.service.facade.PrescriptionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

    @Autowired
    PrescriptionDao prescriptionDao;

    public Prescription findByPatientCin(String cin) {
        return prescriptionDao.findByPatientCin(cin);
    }


    public int deleteByPatientCin(String cin) {
        return prescriptionDao.deleteByPatientCin(cin);
    }

    public  List<Prescription> findAll() {
        return prescriptionDao.findAll();
    }

    public int save(Prescription prescription) {
        if(prescriptionDao.findByPatientCin(prescription.getPatient().getCin()) != null)
        {
            return -1;
        }
        else {
            prescriptionDao.save(prescription);
            return 1;
        }

    }
}
