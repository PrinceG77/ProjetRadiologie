package com.example.projetradiologie.service.impl;

import com.example.projetradiologie.bean.EtatPrescription;
import com.example.projetradiologie.dao.EtatPrescriptionDao;
import com.example.projetradiologie.service.facade.EtatPrescriptionService;
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

    public int deleteByCode(Long code) {
        return etatPrescriptionDao.deleteByCode(code);
    }

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
