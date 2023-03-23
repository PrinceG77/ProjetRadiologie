package com.example.projetradiologie.service.impl;

import com.example.projetradiologie.bean.EtatPrescription;
import com.example.projetradiologie.dao.EtatPrescriptionDao;
import com.example.projetradiologie.service.facade.EtatPrescriptionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtatPrescriptionServiceImpl implements EtatPrescriptionService {
    @Autowired
    private EtatPrescriptionDao etatPrescriptionDao;

    public EtatPrescription findByCode(Long Code) {
        return etatPrescriptionDao.findByCode(Code);
    }

    @Transactional
    public int deleteByCode(Long code) {
        return etatPrescriptionDao.deleteByCode(code);
    }

    public EtatPrescription findByPrescriptionRef(String ref) {
        return etatPrescriptionDao.findByPrescriptionRef(ref);
    }

    @Transactional
    public int deleteByPrescriptionRef(String ref) {
        return etatPrescriptionDao.deleteByPrescriptionRef(ref);
    }

    @Transactional
    public List<EtatPrescription> findAll() {
        return etatPrescriptionDao.findAll();
    }

    public  int save(EtatPrescription etatPrescription) {
        if(etatPrescriptionDao.findByCode(etatPrescription.getCode()) != null)
        {
            return -1;
        }

        etatPrescriptionDao.save(etatPrescription);
        return 1;
    }
}
