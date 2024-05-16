package org.example.recipe_jdbc.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Etape {
    private int id;
    private String description;
}
