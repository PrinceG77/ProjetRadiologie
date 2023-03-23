package com.example.projetradiologie.dao;

import com.example.projetradiologie.bean.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsultationDao extends JpaRepository<Consultation, Long> {

    Consultation findByLibelle(String Libelle);

    List<Consultation> findByPrescriptionRef(String ref);
    int deleteByLibelle(String Libelle);
    int deleteByPrescriptionRef(String ref);
}
