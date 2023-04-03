package com.example.projetradiologie.dao;

import com.example.projetradiologie.bean.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface SeanceDao extends JpaRepository <Seance, Long> {

    Seance findByReference(String reference);

    List<Seance> findByPrescriptionRef(String ref);

    public Optional<Seance> findById(Long aLong);
    public void deleteById(Long aLong);


    List<Seance> findByPrescriptionId(Long id);
    int deleteByPrescriptionRef(String ref);

}
