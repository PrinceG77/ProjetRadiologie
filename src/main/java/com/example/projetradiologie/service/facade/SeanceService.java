package com.example.projetradiologie.service.facade;

import com.example.projetradiologie.bean.Consultation;
import com.example.projetradiologie.bean.Seance;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public interface SeanceService {

    public Seance findByReference(String reference);

    public List<Seance> findByPrescriptionRef(String ref) ;



    public int deleteByPrescriptionRef(String ref);

    public List<Seance> findAll();

    public int save(Seance seance);

    List<Seance> findByPrescriptionId(Long id);

    public Optional<Seance> findById(Long id);

    public void deleteById(Long id);



}
