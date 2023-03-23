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

@Service
public class SeanceServiceImpl implements SeanceService {
    @Autowired
   private SeanceDao seanceDao;
    @Autowired
    private PrescriptionService prescriptionService;

    public Seance findByRef(String ref) {
        return seanceDao.findByRef(ref);
    }

    public List<Seance> findByPrescriptionRef(String ref) {
        return seanceDao.findByPrescriptionRef(ref);
    }

    @Transactional
    public int DeleteByPrescriptionRef(String ref) {
        return seanceDao.DeleteByPrescriptionRef(ref);
    }

    public List<Seance> findAll() {
        return seanceDao.findAll();
    }

    public int save(Seance seance) {

        if(findByRef(seance.getRef())!=null)
        {
            return -1;
        }
        Prescription prescription = prescriptionService.findByRef(seance.getPrescription().getRef());
        seance.setPrescription(prescription);

        if(prescription == null)
        {
            return -2;
        }

        prescriptionService.update(prescription);
        seanceDao.save(seance);
        return 1;
    }


}
