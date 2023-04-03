package com.example.projetradiologie.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
@Entity
public class Consultation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime dateConsultation;
    private String libelle;

    @JsonIgnore
    @ManyToOne
    private Prescription prescription;
    private String descriptif;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(LocalDateTime dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }
}
