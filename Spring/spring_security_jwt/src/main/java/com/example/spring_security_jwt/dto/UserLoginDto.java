package com.example.spring_security_jwt.dto;

import lombok.Data;

@Data
public class UserLoginDto {
    private String email;
    private String password;
}
