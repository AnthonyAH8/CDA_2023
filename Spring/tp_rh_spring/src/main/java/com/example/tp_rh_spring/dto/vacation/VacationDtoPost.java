package com.example.tp_rh_spring.dto.vacation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VacationDtoPost {
    private int employee;
    private String startVacation;
    private String endVacation;
}
