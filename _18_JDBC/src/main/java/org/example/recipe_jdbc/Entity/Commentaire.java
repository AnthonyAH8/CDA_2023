package org.example.recipe_jdbc.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Commentaire {
    private int id_commentaire;
    private String description;

}
