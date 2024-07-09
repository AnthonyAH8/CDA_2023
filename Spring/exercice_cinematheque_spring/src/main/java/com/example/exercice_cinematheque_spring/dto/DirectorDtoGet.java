package com.example.exercice_cinematheque_spring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DirectorDtoGet {
    private String lastname;
    private String firstname;
    private Date dateOfBirth;
    private String nationality;
}
