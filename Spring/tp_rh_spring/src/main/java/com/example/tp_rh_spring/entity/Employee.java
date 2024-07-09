package com.example.tp_rh_spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String identificationNumber;
    private String adress;
    private String email;
    private String phoneNumber;

    @Temporal(TemporalType.DATE)
    private LocalDate dateOfBirth;

    @Temporal(TemporalType.DATE)
    private LocalDate contractStart;

    @Temporal(TemporalType.DATE)
    private LocalDate contractEnd;

    private String occupation;
    private String password;
    private boolean admin;
    private double salary;
    private String observation;
}
