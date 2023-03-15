package com.example.projetradiologie.service.impl;

import com.example.projetradiologie.bean.Seance;
import com.example.projetradiologie.dao.SeanceDao;
import com.example.projetradiologie.service.facade.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SeanceServiceImpl implements SeanceService {
    @Autowired
   private SeanceDao seanceDao;

    public List<Seance> findByPrescriptionPatientCin(String cin) {
        return seanceDao.findByPrescriptionPatientCin(cin);
    }

    public Seance findByPrescriptionPatientCinAndDateDebut(String cin, LocalDateTime dateDebut) {
        return seanceDao.findByPrescriptionPatientCinAndDateDebut(cin, dateDebut);
    }

    public int deleteByPrescriptionPatientCinAndDateDebut(String cin, LocalDateTime dateTime) {
        return seanceDao.deleteByPrescriptionPatientCinAndDateDebut(cin, dateTime);
    }

    public List<Seance> findAll() {
        return seanceDao.findAll();
    }

    public int save(Seance seance) {

        if(seanceDao.findById(seance.getId()) != null)
        {
            return -1;
        }
        seanceDao.save(seance);
        return 1;
    }

    public void deleteById(Long aLong) {
        seanceDao.deleteById(aLong);
    }
}
