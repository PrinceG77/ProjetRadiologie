package com.example.projetradiologie.ws;

import com.example.projetradiologie.bean.Seance;
import com.example.projetradiologie.service.facade.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/api/PR/seance")
public class SeanceRest {


    @GetMapping("/reference/{reference}")
    public Seance findByRef(@PathVariable String reference) {
        return seanceService.findByReference(reference);
    }

    @GetMapping("/prescription/id/{id}")
    public List<Seance> findByPrescriptionId(Long id) {
        return seanceService.findByPrescriptionId(id);
    }

    @GetMapping("/prescription/ref/{ref}")
    public List<Seance> findByPrescriptionRef(@PathVariable String ref) {
        return seanceService.findByPrescriptionRef(ref);


    }

    @DeleteMapping("/prescription/ref/{ref}")
    public int DeleteByPrescriptionRef(@PathVariable String ref) {
        return seanceService.deleteByPrescriptionRef(ref);
    }

    @GetMapping("/")
    public List<Seance> findAll() {
        return seanceService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Seance seance) {
        return seanceService.save(seance);
    }

    @GetMapping("/id/{id}")
    public Optional<Seance> findById(@PathVariable Long id) {
        return seanceService.findById(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        seanceService.deleteById(id);
    }

    @Autowired
    private SeanceService seanceService;
}
