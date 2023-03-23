package com.example.projetradiologie.service.impl;

import com.example.projetradiologie.bean.Consultation;
import com.example.projetradiologie.bean.HistoriquePrescription;
import com.example.projetradiologie.dao.ConsultationDao;
import com.example.projetradiologie.dao.HistoriquePrescriptionDao;
import com.example.projetradiologie.service.facade.ConsultationService;
import com.example.projetradiologie.service.facade.HistoriquePrescriptionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriquePrescriptionServiceImpl implements HistoriquePrescriptionService {
    @Autowired
    private HistoriquePrescriptionDao historiquePrescriptionDao;

    @Override
    public HistoriquePrescription findByPrescriptionRef(String ref) {
        return historiquePrescriptionDao.findByPrescriptionRef(ref);
    }

    @Override
    public int deleteByPrescriptionRef(String ref) {
        return historiquePrescriptionDao.deleteByPrescriptionRef(ref);
    }

    @Override
    public List<HistoriquePrescription> findAll() {
        return historiquePrescriptionDao.findAll();
    }

    public int save(HistoriquePrescription historiquePrescription) {
        if(historiquePrescriptionDao.findById(historiquePrescription.getId()) != null)
        {
            return -1;
        }
        historiquePrescriptionDao.save(historiquePrescription);
        return 1;
    }
}
