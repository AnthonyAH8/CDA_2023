package org.example.recipe_jdbc.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Categorie {
    private int id_categorie;
    private String nom_categorie;
}
