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


    @Override
    public EtatPrescription findByLibelle(String libelle) {
        return etatPrescriptionDao.findByLibelle(libelle);
    }

    @Override
    public int deleteByLibelle(String libelle) {
        return etatPrescriptionDao.deleteByLibelle(libelle);
    }

    @Transactional
    public List<EtatPrescription> findAll() {
        return etatPrescriptionDao.findAll();
    }

    public  int save(EtatPrescription etatPrescription) {
        if(etatPrescriptionDao.findByLibelle(etatPrescription.getLibelle()) != null)
        {
            return -1;
        }

        etatPrescriptionDao.save(etatPrescription);
        return 1;
    }
}
