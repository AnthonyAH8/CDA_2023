package org.example.recipe_jdbc.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RecetteIngredient {
    private int id_recette_ingredient;
    private int recette_id;
    private int ingredient_id;
}
