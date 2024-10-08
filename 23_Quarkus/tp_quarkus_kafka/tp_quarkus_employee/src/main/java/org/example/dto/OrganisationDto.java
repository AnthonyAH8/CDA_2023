package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganisationDto {
    private int id;
    private String name;
    private int numberofEmployees;
    private LocalDate startDate;
}
