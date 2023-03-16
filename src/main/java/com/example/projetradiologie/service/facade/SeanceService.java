package com.example.projetradiologie.service.facade;

import com.example.projetradiologie.bean.Consultation;
import com.example.projetradiologie.bean.Seance;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public interface SeanceService {

    public List<Seance> findByPrescriptionPatientCin(String cin);

    public Seance findByPrescriptionPatientCinAndDateDebut(String cin, LocalDateTime dateDebut) ;

    public int deleteByPrescriptionPatientCinAndDateDebut(String cin, LocalDateTime dateTime);

    public List<Seance> findAll();

    public int save(Seance seance);

    public void deleteById(Long aLong);

}
