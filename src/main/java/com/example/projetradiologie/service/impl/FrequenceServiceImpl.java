package com.example.projetradiologie.service.impl;

import com.example.projetradiologie.bean.Frequence;
import com.example.projetradiologie.bean.Prescription;
import com.example.projetradiologie.dao.FrequenceDao;
import com.example.projetradiologie.service.facade.FrequenceService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrequenceServiceImpl implements FrequenceService {
    @Autowired
    FrequenceDao frequenceDao;

    public Frequence findByLibelle(String Libelle) {
        return frequenceDao.findByLibelle(Libelle);
    }

    @Transactional
    public int deleteByLibelle(String Libelle) {
        return frequenceDao.deleteByLibelle(Libelle);
    }

    public int save(Frequence frequence) {

        if(findByLibelle(frequence.getLibelle()) != null)
        {
            return -1;
        }

        frequenceDao.save(frequence);
        return 1;
    }


}
