package org.example.recipe_jdbc.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Recette {
    private int id_recette;
    private String nom;
    private int tempsPrep;
    private int tempsCuisson;
    private int difficulte;
    private int categorieId;
}
