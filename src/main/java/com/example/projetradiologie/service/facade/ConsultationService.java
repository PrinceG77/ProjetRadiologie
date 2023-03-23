package com.example.projetradiologie.service.facade;

import com.example.projetradiologie.bean.Consultation;
import com.example.projetradiologie.bean.Frequence;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ConsultationService {

    public Consultation findByLibelle(String Libelle);


    public int deleteByLibelle(String Libelle);

    List<Consultation> findByPrescriptionRef(String ref);

    int deleteByPrescriptionRef(String ref);

    public List<Consultation> findAll() ;

    public  int save(Consultation consultation);

}
