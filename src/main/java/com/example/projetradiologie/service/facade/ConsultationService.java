package com.example.projetradiologie.service.facade;

import com.example.projetradiologie.bean.Consultation;
import com.example.projetradiologie.bean.Frequence;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ConsultationService {

    public Consultation findByLibelle(String Libelle);

    @Transactional
    public int deleteByLibelle(String Libelle);

    public List<Consultation> findAll() ;

    public  int save(Consultation consultation);

}
