package com.example.projetradiologie.bean;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class HistoriquePrescription {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Prescription prescription;
    private LocalDateTime dateHistorique;
    @ManyToOne
    private EtatPresciption etatPrescription;

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

    public EtatPresciption getEtatPrescription() {
        return etatPrescription;
    }

    public void setEtatPrescription(EtatPresciption etatPrescription) {
        this.etatPrescription = etatPrescription;
    }
}
