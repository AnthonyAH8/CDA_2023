package com.example.todolist_spring_security;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

@SpringBootApplication
public class TodolistSpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodolistSpringSecurityApplication.class, args);

//        SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS512);
//        String key = Encoders.BASE64.encode(secretKey.getEncoded());
//        System.out.println(key);
    }
}
