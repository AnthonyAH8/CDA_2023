package com.example.todolist_spring_security.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoDtoPost {
    private String title;
    private String description;
    private boolean isCompleted;

}
