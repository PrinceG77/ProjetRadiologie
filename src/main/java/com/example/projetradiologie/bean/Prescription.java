package com.example.projetradiologie.bean;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date datePrescription;
    private  int nbrTotalScance;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Frequence frequence;
    @OneToMany(mappedBy = "prescription")
    private List<Seance> seances;
    private LocalDateTime dateDebut;
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

    public List<Seance> getSeances() {
        return seances;
    }

    public void setSeances(List<Seance> seances) {
        this.seances = seances;
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

    public int getNbrTotalScance() {
        return nbrTotalScance;
    }

    public void setNbrTotalScance(int nbrTotalScance) {
        this.nbrTotalScance = nbrTotalScance;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }
}
