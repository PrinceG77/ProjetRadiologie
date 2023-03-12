package com.example.projetradiologie.dao;

import com.example.projetradiologie.bean.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface SeanceDao extends JpaRepository <Seance, Long> {

    Seance findByPrescriptionDatePrescription(LocalDateTime datePrescription);

}