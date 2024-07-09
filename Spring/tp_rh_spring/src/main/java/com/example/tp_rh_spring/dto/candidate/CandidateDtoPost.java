package com.example.tp_rh_spring.dto.candidate;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateDtoPost {
    private int id;
    private String name;
    private String identificationNumber;
    private String address;
    private String phoneNumber;
    private String email;
    @Pattern(regexp = "([0-9]+(-[0-9]+)+)")
    private String birthDate;
    private int rating;
    private String observation;
    private String skill;
    private String technicalArea;
    @Pattern(regexp = "([0-9]+(-[0-9]+)+)")
    private String jobInterviewDate;
}
