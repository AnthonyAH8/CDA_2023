package com.example.tp_rh_spring.dto.vacation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VacationDtoGet {
    private int id;
    private LocalDate startVacation;
    private String endVacation;
}
