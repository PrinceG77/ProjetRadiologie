package com.example.projetradiologie.bean;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Prescription {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private Date datePrescription;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Frequence frequence;
    @ManyToOne
    private Seance seance;
    private Date dateDebut;
    @ManyToOne
    private EtatPresci etatPresci;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatePrescription() {
        return datePrescription;
    }

    public void setDatePrescription(Date datePrescription) {
        this.datePrescription = datePrescription;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Frequence getFrequence() {
        return frequence;
    }

    public void setFrequence(Frequence frequence) {
        this.frequence = frequence;
    }

    public Seance getSeance() {
        return seance;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public EtatPresci getEtatPresci() {
        return etatPresci;
    }

    public void setEtatPresci(EtatPresci etatPresci) {
        this.etatPresci = etatPresci;
    }
}
