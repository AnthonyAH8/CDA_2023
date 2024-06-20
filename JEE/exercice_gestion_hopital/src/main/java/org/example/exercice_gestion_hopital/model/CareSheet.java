package org.example.exercice_gestion_hopital.model;

import jakarta.persistence.*;

@Entity
public class CareSheet {
    @Id
    @GeneratedValue
    private Long id;

    private String careType;

    private int duration;

    @ManyToOne
    @JoinColumn(name = "consultation_id")
    private Consultation consultation;

    public CareSheet() {
    }

    public CareSheet(String careType, int duration) {
        this.careType = careType;
        this.duration = duration;
    }

    public String getCareType() {
        return careType;
    }

    public void setCareType(String careType) {
        this.careType = careType;
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
