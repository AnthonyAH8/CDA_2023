package com.example.exercice_filters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class ExerciceFiltersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciceFiltersApplication.class, args);
    }

}
