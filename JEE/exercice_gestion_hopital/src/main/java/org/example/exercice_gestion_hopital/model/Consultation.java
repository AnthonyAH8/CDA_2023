package org.example.exercice_gestion_hopital.model;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Consultation {
    @Id
    @GeneratedValue
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date consultationDate;

    private String doctor;

    @OneToMany(mappedBy = "consultation")
    private List<CareSheet> careSheet;

    @OneToMany(mappedBy = "consultation")
    private List<Prescription> prescription;

    public Consultation(Date consultationDate, String doctor, CareSheet careSheet, Prescription prescription) {
        this.consultationDate = consultationDate;
        this.doctor = doctor;
    }

    public Consultation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(Date consultationDate) {
        this.consultationDate = consultationDate;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

}
