package com.example.projetradiologie.bean;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class HistoriquePresci {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Prescription prescription;
    private Date dateHistorique;
    @ManyToOne
    private EtatPresci etatPresci;

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

    public Date getDateHistorique() {
        return dateHistorique;
    }

    public void setDateHistorique(Date dateHistorique) {
        this.dateHistorique = dateHistorique;
    }

    public EtatPresci getEtatPresci() {
        return etatPresci;
    }

    public void setEtatPresci(EtatPresci etatPresci) {
        this.etatPresci = etatPresci;
    }
}
