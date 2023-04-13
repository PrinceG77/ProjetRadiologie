package com.example.projetradiologie.dao;

import com.example.projetradiologie.bean.HistoriquePrescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface HistoriquePrescriptionDao extends JpaRepository<HistoriquePrescription, Long> {

   List<HistoriquePrescription> findByPrescriptionRef(String ref);
   int deleteByPrescriptionRef(String ref);
}
