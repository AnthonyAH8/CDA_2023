package org.example.recipe_jdbc.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Ingredient {
    private int id;
    private String nom;
}
