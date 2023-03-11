package com.example.projetradiologie.bean;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
@Entity
public class Seance {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime dateDebit;
    private LocalDateTime dateFin;
    @ManyToOne
    private Prescription prescription;
    private Boolean presence;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateDebit() {
        return dateDebit;
    }

    public void setDateDebit(LocalDateTime dateDebit) {
        this.dateDebit = dateDebit;
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
