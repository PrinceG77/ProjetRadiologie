package com.example.projetradiologie.dao;

import com.example.projetradiologie.bean.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionDao extends JpaRepository<Prescription, Long> {

    Prescription findByPatientCin(String cin);

    Prescription findByRef(String ref);

    int deleteByRef(String ref);
    int deleteByPatientCin(String cin);
}
