package org.example.exercice_gestion_hopital.model;

import jakarta.persistence.*;

@Entity
public class Prescription {

    @Id
    @GeneratedValue
    private Long id;

    private String medication;

    private int duration;

    @ManyToOne
    @JoinColumn(name = "consultation_id")
    private Consultation consultation;

    public Prescription() {

    }

    public Prescription(String medication, int duration, Consultation consultation) {
        this.medication = medication;
        this.duration = duration;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }
}
