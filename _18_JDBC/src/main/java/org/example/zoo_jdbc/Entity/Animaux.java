package org.example.zoo_jdbc.Entity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Animaux {
    private int id_animal;
    private String nom;
    private String race;
    private String description;
    private int age;

    @Override
    public String toString() {
        return "Animaux{" +
                "id_animal=" + id_animal +
                ", nom='" + nom + '\'' +
                ", race='" + race + '\'' +
                ", description='" + description + '\'' +
                ", age=" + age +
                '}';
    }
}
