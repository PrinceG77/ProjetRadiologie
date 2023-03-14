package com.example.projetradiologie.service.facade;

import com.example.projetradiologie.bean.Frequence;
import com.example.projetradiologie.bean.Prescription;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FrequenceService {

    public Frequence findByCode(String code);
    @Transactional
    public int deleteByCode(String code);

    public int save(Frequence frequence);
}
