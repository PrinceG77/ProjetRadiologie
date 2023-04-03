package com.example.projetradiologie.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class HistoriquePrescription {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonIgnore
    @ManyToOne
    private Prescription prescription;
    private LocalDateTime dateHistorique;
    @JsonIgnore
    @ManyToOne
    private EtatPrescription etatPrescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public LocalDateTime getDateHistorique() {
        return dateHistorique;
    }

    public void setDateHistorique(LocalDateTime dateHistorique) {
        this.dateHistorique = dateHistorique;
    }

    public EtatPrescription getEtatPrescription() {
        return etatPrescription;
    }

    public void setEtatPrescription(EtatPrescription etatPrescription) {
        this.etatPrescription = etatPrescription;
    }
}
