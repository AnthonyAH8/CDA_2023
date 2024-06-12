package org.example.exercice_gestion_chien.entity;

import jakarta.servlet.http.HttpServlet;

import java.time.LocalDate;
import java.util.UUID;

public class Dogs extends HttpServlet {
    private UUID uuid;

    private String name;

    private String race;

    private LocalDate birthdate;

    public Dogs(UUID uuid, String name, String race, LocalDate birthdate) {
        this.uuid = uuid;
        this.name = name;
        this.race = race;
        this.birthdate = birthdate;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
