package com.example.exercice_todolist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoDtoPost {
    private String title;
    private String description;
    private String date;
    private boolean done = false;

}
