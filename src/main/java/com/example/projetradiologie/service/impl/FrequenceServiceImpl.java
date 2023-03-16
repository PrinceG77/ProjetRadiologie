package com.example.projetradiologie.service.impl;

import com.example.projetradiologie.bean.Frequence;
import com.example.projetradiologie.bean.Prescription;
import com.example.projetradiologie.dao.FrequenceDao;
import com.example.projetradiologie.service.facade.FrequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrequenceServiceImpl implements FrequenceService {
    @Autowired
    FrequenceDao frequenceDao;

    public Frequence findByCode(String code) {
        return frequenceDao.findByCode(code);
    }

    public int deleteByCode(String code) {
        return frequenceDao.deleteByCode(code);
    }

    public int save(Frequence frequence) {

        frequenceDao.save(frequence);
        return 1;
    }


}
