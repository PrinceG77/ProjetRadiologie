package com.example.projetradiologie.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Prescription  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime datePrescription;
    private  int nbrTotalSeance;
    private  String ref ;
    @JsonIgnore
    @ManyToOne
    private Patient patient ;
    @JsonIgnore
    @ManyToOne
    private Frequence frequence ;
    @JsonIgnore
    @OneToMany(mappedBy = "prescription")
    private List<Seance> seances = new ArrayList<Seance>();

    @JsonIgnore
    @OneToMany(mappedBy = "prescription")
    private List<Consultation> consultations;
    private LocalDateTime dateDebut;
    @JsonIgnore
    @ManyToOne
    private EtatPrescription etatPresci ;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDatePrescription() {
        return datePrescription;
    }

    public void setDatePrescription(LocalDateTime datePrescription) {
        this.datePrescription = datePrescription;
    }

    public int getNbrTotalSeance() {
        return nbrTotalSeance;
    }

    public void setNbrTotalSeance(int nbrTotalSeance) {
        this.nbrTotalSeance = nbrTotalSeance;
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

    public List<Consultation> getConsultations() {
        return consultations;
    }

    public void setConsultations(List<Consultation> consultations) {
        this.consultations = consultations;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public EtatPrescription getEtatPresci() {
        return etatPresci;
    }

    public void setEtatPresci(EtatPrescription etatPresci) {
        this.etatPresci = etatPresci;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
