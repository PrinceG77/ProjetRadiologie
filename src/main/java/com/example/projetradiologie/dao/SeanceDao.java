package com.example.projetradiologie.dao;

import com.example.projetradiologie.bean.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SeanceDao extends JpaRepository <Seance, Long> {

    Seance findByReference(String reference);
    List<Seance> findByPrescriptionRef(String ref);
    int deleteByPrescriptionRef(String ref);

}
