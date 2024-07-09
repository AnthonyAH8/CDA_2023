package com.example.tp_rh_spring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String identificationNumber;
    private String address;
    private String phoneNumber;
    private String email;
    @Temporal(TemporalType.DATE)
    private LocalDate birthDate;
    private int rating;
    private String observation;
    private String skill;
    private String technicalArea;
    @Temporal(TemporalType.DATE)
    private LocalDate jobInterviewDate;
}
