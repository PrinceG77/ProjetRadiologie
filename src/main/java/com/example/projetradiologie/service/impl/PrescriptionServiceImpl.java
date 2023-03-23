package com.example.projetradiologie.service.impl;

import com.example.projetradiologie.bean.Patient;
import com.example.projetradiologie.bean.Prescription;
import com.example.projetradiologie.bean.Seance;
import com.example.projetradiologie.dao.PrescriptionDao;
import com.example.projetradiologie.dao.SeanceDao;
import com.example.projetradiologie.service.facade.PrescriptionService;
import com.example.projetradiologie.service.facade.SeanceService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.List;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

    @Autowired
    private PrescriptionDao prescriptionDao;
    private SeanceService seanceService;

    public void update(Prescription prescription)
    {
        prescriptionDao.save(prescription);
    }

    public Prescription findByRef(String ref) {

        Prescription prescription = prescriptionDao.findByRef(ref);
        List<Seance> seances = seanceService.findByPrescriptionRef(ref);

        prescription.setSeances(seances);

        return prescription;
    }

    @Transactional
    public int deleteByRef(String ref) {
        int resultSeance = seanceService.DeleteByPrescriptionRef(ref);
        int resultPrescription = prescriptionDao.deleteByRef(ref);

        return resultPrescription + resultSeance;
    }

    public Prescription findByPatientCin(String cin) {
        return prescriptionDao.findByPatientCin(cin);
    }


    public int deleteByPatientCin(String cin) {
        return prescriptionDao.deleteByPatientCin(cin);
    }

    public  List<Prescription> findAll() {
        return prescriptionDao.findAll();
    }





    public int save(Prescription prescription, List<Seance> seances) {



        //prescription.getNbrTotalSeance(), prescription.getDateDebut()
        if(findByRef(prescription.getRef()) != null)
        {
            return -1;
        }
        for(int i=1; i < prescription.getNbrTotalSeance() ; i++)
        {
            Seance seance = new Seance();
            seance.setDateDebut(prescription.getDateDebut().plusWeeks(i));
            seances.add(seance);
        }

        prescription.setSeances(seances);
        prescriptionDao.save(prescription);

            return 1;


    }
}
