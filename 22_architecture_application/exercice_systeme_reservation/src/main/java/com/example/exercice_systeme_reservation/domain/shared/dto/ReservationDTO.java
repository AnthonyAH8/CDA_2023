package com.example.exercice_systeme_reservation.domain.shared.dto;

import java.time.LocalDate;
import java.util.Date;

public class ReservationDTO {
    private int id;
    private Date date;
    private String visitor;
    private String event;

    public ReservationDTO(int id, Date date, String visitor, String event) {
        this(date, visitor, event);
        this.id = id;
    }

    public ReservationDTO(Date date, String visitor, String event) {
        this.date = date;
        this.visitor = visitor;
        this.event = event;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
