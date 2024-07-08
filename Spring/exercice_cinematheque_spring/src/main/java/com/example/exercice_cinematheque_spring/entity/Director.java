package com.example.exercice_cinematheque_spring.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String lastname;
    private String firstname;
    private Date dateOfBirth;
    private String nationality;

    @ManyToOne
    @JoinColumn(name = "film_id", nullable = false)
    private Film film;
}
