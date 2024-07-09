package com.example.tp_rh_spring.dto.employee;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDtoPost {
    private String name;
    private String identificationNumber;
    private String address;
    private String email;
    private String phoneNumber;
    @Pattern(regexp = "([0-9]+(-[0-9]+)+)")
    private String dateOfBirth;
    private String contractStart;
    private String contractEnd;
    private String occupation;
    private String password;
    private boolean admin;
    private double salary;
    private String observation;
}
