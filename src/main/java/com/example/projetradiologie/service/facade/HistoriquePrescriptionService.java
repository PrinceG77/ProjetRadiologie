package com.example.projetradiologie.service.facade;

import com.example.projetradiologie.bean.HistoriquePrescription;
import com.example.projetradiologie.bean.Seance;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public interface HistoriquePrescriptionService {

    public List<HistoriquePrescription> findByPrescriptionRef(String ref);

    int deleteByPrescriptionRef(String ref);

    public List<HistoriquePrescription> findAll();

    public int save(HistoriquePrescription historiquePrescription) ;

    public HistoriquePrescription update(HistoriquePrescription historiquePrescription);

}
