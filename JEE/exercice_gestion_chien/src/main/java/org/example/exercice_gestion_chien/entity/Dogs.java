package org.example.exercice_gestion_chien.entity;

import jakarta.servlet.http.HttpServlet;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

public class Dogs extends HttpServlet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String race;
    @Temporal(TemporalType.DATE)
    private LocalDate birthdate;

    public Dogs(String name, String race, LocalDate birthdate) {
        this.name = name;
        this.race = race;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
}
