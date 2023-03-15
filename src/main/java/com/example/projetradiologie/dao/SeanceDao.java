package com.example.projetradiologie.dao;

import com.example.projetradiologie.bean.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SeanceDao extends JpaRepository <Seance, Long> {

    List<Seance> findByPrescriptionPatientCin(String cin);
    Seance findByPrescriptionPatientCinAndDateDebut(String cin, LocalDateTime dateDebut);

    int deleteByPrescriptionPatientCinAndDateDebut(String cin, LocalDateTime dateTime);

}
