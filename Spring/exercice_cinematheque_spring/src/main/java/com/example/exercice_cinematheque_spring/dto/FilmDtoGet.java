package com.example.exercice_cinematheque_spring.dto;

import com.example.exercice_cinematheque_spring.entity.Director;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmDtoGet {
    private String name;
    private LocalDate releaseDate;
    private String description;
    private int duration;
    private String genre;

    private List<Director> directors = new ArrayList<>();
}
