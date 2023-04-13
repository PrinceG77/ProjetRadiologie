package com.example.projetradiologie.service.impl;

import com.example.projetradiologie.bean.HistoriquePrescription;
import com.example.projetradiologie.bean.Patient;
import com.example.projetradiologie.bean.Prescription;
import com.example.projetradiologie.bean.Seance;
import com.example.projetradiologie.dao.PrescriptionDao;

import com.example.projetradiologie.service.facade.HistoriquePrescriptionService;
import com.example.projetradiologie.service.facade.PrescriptionService;
import com.example.projetradiologie.service.facade.SeanceService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

    @Autowired
    private PrescriptionDao prescriptionDao;
    @Autowired
    private SeanceService seanceService;
    @Autowired
    private HistoriquePrescriptionService historiquePrescriptionService;



    @Override
    public Prescription findByRef(String ref) {
        return prescriptionDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref) {
        int resultSeance = seanceService.deleteByPrescriptionRef(ref);
        int resultHistoriquePrescription = historiquePrescriptionService.deleteByPrescriptionRef(ref);
        int resultPrescription = prescriptionDao.deleteByRef(ref);


        return resultPrescription + resultSeance + resultHistoriquePrescription;
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



    public Prescription update(Prescription prescription)
    {
        seanceService.deleteByPrescriptionRef(prescription.getRef());
        for(int i=1; i <= prescription.getNbrTotalSeance() ; i++)
        {
            Seance seance = new Seance();
            seance.setDateDebut(prescription.getDateDebut().plusWeeks(i));

            if(seance.getDateDebut().get(ChronoField.DAY_OF_WEEK) == 6 )
            {
                seance.setDateDebut(seance.getDateDebut().plusDays(2));
            }

            else if(seance.getDateDebut().get(ChronoField.DAY_OF_WEEK) == 7 )

            {
                seance.setDateDebut(seance.getDateDebut().plusDays(1));
            }
            seance.setPrescription(prescription);
            seanceService.update(seance);
        }

        HistoriquePrescription historiquePrescription = new HistoriquePrescription();
        historiquePrescription.setDateHistorique(LocalDateTime.now());
        historiquePrescription.setPrescription(prescription);
        historiquePrescriptionService.update(historiquePrescription);

        return prescriptionDao.save(prescription);
    }


    public Prescription save(Prescription prescription) {

        Prescription res = null;
        if(prescriptionDao.findByRef(prescription.getRef()) != null)
        {
            return res;
        }
        res = prescriptionDao.save(prescription);
        for(int i=1; i <= prescription.getNbrTotalSeance() ; i++)
        {
            Seance seance = new Seance();
            seance.setDateDebut(prescription.getDateDebut().plusWeeks(i));

            if(seance.getDateDebut().get(ChronoField.DAY_OF_WEEK) == 6 )
            {
                       seance.setDateDebut(seance.getDateDebut().plusDays(2));
            }

            else if(seance.getDateDebut().get(ChronoField.DAY_OF_WEEK) == 7 )

            {
                seance.setDateDebut(seance.getDateDebut().plusDays(1));
            }
             seance.setPrescription(prescription);
             seanceService.save(seance);
        }

        HistoriquePrescription historiquePrescription = new HistoriquePrescription();
        historiquePrescription.setDateHistorique(LocalDateTime.now());
        historiquePrescription.setPrescription(prescription);
        historiquePrescriptionService.save(historiquePrescription);




            return res;


    }
}
