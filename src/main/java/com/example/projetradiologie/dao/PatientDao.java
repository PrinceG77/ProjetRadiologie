package com.example.projetradiologie.dao;

import com.example.projetradiologie.bean.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDao extends JpaRepository<Patient, Long> {
    Patient findByCin(String cin);

    int deleteByCin(String cin);
}
