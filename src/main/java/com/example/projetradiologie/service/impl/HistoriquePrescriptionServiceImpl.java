package com.example.projetradiologie.service.impl;

import com.example.projetradiologie.bean.Consultation;
import com.example.projetradiologie.bean.HistoriquePrescription;
import com.example.projetradiologie.dao.ConsultationDao;
import com.example.projetradiologie.dao.HistoriquePrescriptionDao;
import com.example.projetradiologie.service.facade.ConsultationService;
import com.example.projetradiologie.service.facade.HistoriquePrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriquePrescriptionServiceImpl implements HistoriquePrescriptionService {
    @Autowired
    private HistoriquePrescriptionDao historiquePrescriptionDao;

    public HistoriquePrescription findByEtatPrescriptionCode(Long code) {
        return historiquePrescriptionDao.findByEtatPrescriptionCode(code);
    }

    public int deleteByByEtatPrescriptionCode(Long code) {
        return historiquePrescriptionDao.deleteByByEtatPrescriptionCode(code);
    }

    public List<HistoriquePrescription> findAll() {
        return historiquePrescriptionDao.findAll();
    }

    public  int save(HistoriquePrescription historiquePrescription) {
        if(historiquePrescriptionDao.findByEtatPrescriptionCode(historiquePrescription.getEtatPrescription().getCode()) != null)
        {
            return -1;
        }

        historiquePrescriptionDao.save(historiquePrescription);
        return 1;
    }
}
