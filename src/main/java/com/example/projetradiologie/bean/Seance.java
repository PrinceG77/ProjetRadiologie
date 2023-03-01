package com.example.projetradiologie.bean;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Seance {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date dateDebit;
    private Date dateFin;
    @ManyToOne
    private Prescription prescription;
    private Boolean presence;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDebit() {
        return dateDebit;
    }

    public void setDateDebit(Date dateDebit) {
        this.dateDebit = dateDebit;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
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
