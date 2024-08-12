package com.example.todolist_spring_security.dto;

import lombok.Data;

@Data
public class UserLoginDto {
    private String email;
    private String password;
}
