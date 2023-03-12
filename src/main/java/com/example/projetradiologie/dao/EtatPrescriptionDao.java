package com.example.projetradiologie.dao;

import com.example.projetradiologie.bean.EtatPresciption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatPrescriptionDao extends JpaRepository<EtatPresciption, Long> {
    EtatPresciption findByCode(String Code);
    int deleteByCode(String code);
}
