package com.example.exercice_cinematheque_spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DirectorDtoPost {
    private String lastname;
    private String firstname;
    private Date dateOfBirth;
    private String nationality;
}
