package com.example.tp_rh_spring.dto.candidate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CandidateDtoGet {
    private int id;
    private String name;
    private String identificationNumber;
    private String address;
    private String phoneNumber;
    private String email;
    private LocalDate birthDate;
    private int rating;
    private String observation;
    private String skill;
    private String technicalArea;
    private LocalDate jobInterviewDate;
}
