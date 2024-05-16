package org.example.zoo_jdbc.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Enclos {
    private int id;
    private String nom;
    private String endroit;
    private Animaux animaux;
}
