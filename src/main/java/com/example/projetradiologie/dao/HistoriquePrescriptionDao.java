package com.example.projetradiologie.dao;

import com.example.projetradiologie.bean.HistoriquePrescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface HistoriquePrescriptionDao extends JpaRepository<HistoriquePrescription, Long> {

    HistoriquePrescription findByEtatPrescriptionCode(Long code);

    int deleteByByEtatPrescriptionCode(Long code);;
}
