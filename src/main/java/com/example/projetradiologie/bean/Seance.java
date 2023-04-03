package com.example.projetradiologie.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
@Entity
public class Seance {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    @JsonIgnore
    @ManyToOne
    private Prescription prescription;
    private Boolean presence;
    private String reference;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Boolean getPresence() {
        return presence;
    }

    public void setPresence(Boolean presence) {
        this.presence = presence;
    }
}
