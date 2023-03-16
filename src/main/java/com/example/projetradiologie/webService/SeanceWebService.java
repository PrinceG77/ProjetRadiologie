package com.example.projetradiologie.webService;

import com.example.projetradiologie.bean.Seance;
import com.example.projetradiologie.service.facade.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController()
@RequestMapping("/api/S1/seance")
public class SeanceWebService {

    @GetMapping("/")
    public List<Seance> findByPrescriptionPatientCin(String cin) {
        return seanceService.findByPrescriptionPatientCin(cin);
    }

    @GetMapping("/cin/{cin}")
    public Seance findByPrescriptionPatientCinAndDateDebut(@PathVariable String cin, LocalDateTime dateDebut) {
        return seanceService.findByPrescriptionPatientCinAndDateDebut(cin, dateDebut);
    }

    @DeleteMapping("/cin/{cin}")
    public int deleteByPrescriptionPatientCinAndDateDebut(String cin, LocalDateTime dateTime) {
        return seanceService.deleteByPrescriptionPatientCinAndDateDebut(cin, dateTime);
    }

    @GetMapping("/")
    public List<Seance> findAll() {
        return seanceService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Seance seance) {
        return seanceService.save(seance);
    }

    @DeleteMapping("/aLong/{aLong}")
    public void deleteById(Long aLong) {
        seanceService.deleteById(aLong);
    }

    @Autowired
    private SeanceService seanceService;
}
