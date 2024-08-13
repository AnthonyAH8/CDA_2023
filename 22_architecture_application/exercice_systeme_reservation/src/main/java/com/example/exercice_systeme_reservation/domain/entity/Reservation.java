package com.example.exercice_systeme_reservation.domain.entity;

import java.util.Date;

public class Reservation {
    private int id;
    private Date date;
    private String eventType;
    private double price;

    public Reservation(double price, String eventType, Date date, int id) {
        this.price = price;
        this.eventType = eventType;
        this.date = date;
        this.id = id;
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

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
