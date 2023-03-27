package com.example.projetradiologie.service.impl;

import com.example.projetradiologie.bean.Consultation;
import com.example.projetradiologie.bean.Patient;
import com.example.projetradiologie.bean.Prescription;
import com.example.projetradiologie.dao.ConsultationDao;
import com.example.projetradiologie.service.facade.ConsultationService;
import com.example.projetradiologie.service.facade.PrescriptionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationServiceImpl implements ConsultationService {
    @Autowired
    private ConsultationDao consultationDao;

    private PrescriptionService prescriptionService;

    public List<Consultation> findByPrescriptionRef(String ref) {
        return consultationDao.findByPrescriptionRef(ref);
    }

    @Transactional
    public int deleteByPrescriptionRef(String ref) {
        return consultationDao.deleteByPrescriptionRef(ref);
    }

    public Consultation findByLibelle(String Libelle) {
        return consultationDao.findByLibelle(Libelle);
    }

    @Transactional
    public int deleteByLibelle(String Libelle) {
        return consultationDao.deleteByLibelle(Libelle);
    }

    public List<Consultation> findAll() {
        return consultationDao.findAll();
    }

    public  int save(Consultation consultation) {
        if(consultationDao.findByLibelle(consultation.getLibelle()) != null)
        {
            return -1;
        }
        Prescription prescription = prescriptionService.findByRef(consultation.getPrescription().getRef());
        consultation.setPrescription(prescription);

        if(prescription == null)
        {
            return -2;
        }

        prescriptionService.update(prescription);
        consultationDao.save(consultation);
        return 1;
    }
}
