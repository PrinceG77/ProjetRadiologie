package com.example.projetradiologie.dao;

import com.example.projetradiologie.bean.EtatPrescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatPrescriptionDao extends JpaRepository<EtatPrescription, Long> {
    EtatPrescription findByCode(Long Code);
    EtatPrescription findByPrescriptionRef(String ref);
    int deleteByCode(Long code);
    int deleteByPrescriptionRef(String ref);
}
