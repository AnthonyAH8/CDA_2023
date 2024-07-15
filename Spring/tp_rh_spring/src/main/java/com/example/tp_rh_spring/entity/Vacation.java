package com.example.tp_rh_spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate startVacation;
    private LocalDate endVacation;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_employee")
    @JsonIgnore
    private Employee employee;
}
