package com.example.projetradiologie.service.impl;

import com.example.projetradiologie.bean.Prescription;
import com.example.projetradiologie.bean.Seance;
import com.example.projetradiologie.dao.SeanceDao;
import com.example.projetradiologie.service.facade.PrescriptionService;
import com.example.projetradiologie.service.facade.SeanceService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class SeanceServiceImpl implements SeanceService {
    @Autowired
   private SeanceDao seanceDao;


    public Seance findByReference(String reference) {
        return seanceDao.findByReference(reference);
    }


    public List<Seance> findByPrescriptionRef(String ref) {
        return seanceDao.findByPrescriptionRef(ref);
    }

    @Override
    public List<Seance> findByPrescriptionId(Long id) {
        return seanceDao.findByPrescriptionId(id);
    }

    @Transactional
    public int deleteByPrescriptionRef(String ref) {
        return seanceDao.deleteByPrescriptionRef(ref);
    }

    public Optional<Seance> findById(Long id) {
        return seanceDao.findById(id);
    }

    public void deleteById(Long id) {
        seanceDao.deleteById(id);
    }

    public List<Seance> findAll() {
        return seanceDao.findAll();
    }

    public int save(Seance seance) {



        seanceDao.save(seance);
        return 1;
    }


}
