package com.example.projetradiologie.dao;

import com.example.projetradiologie.bean.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultationDao extends JpaRepository<Consultation, Long> {

    Consultation findByLibelle(String Libelle);
    int deleteByLibelle(String Libelle);
}
