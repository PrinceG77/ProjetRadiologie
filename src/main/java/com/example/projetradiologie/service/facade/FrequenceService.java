package com.example.projetradiologie.service.facade;

import com.example.projetradiologie.bean.Frequence;
import com.example.projetradiologie.bean.Prescription;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FrequenceService {


    public Frequence findByLibelle(String Libelle);

    public int deleteByLibelle(String Libelle);

    public int save(Frequence frequence);
}
