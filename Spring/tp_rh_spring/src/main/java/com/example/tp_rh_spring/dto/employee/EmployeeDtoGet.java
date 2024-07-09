package com.example.tp_rh_spring.dto.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDtoGet {
    private int id;
    private String name;
    private String identificationNumber;
    private String address;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private LocalDate contractStart;
    private LocalDate contractEnd;
    private String occupation;
    private boolean admin;
    private double salary;
    private String observation;
}
