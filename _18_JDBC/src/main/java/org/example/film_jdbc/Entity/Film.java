package org.example.film_jdbc.Entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Film {
    private int id_film;
    private String titre;
    private String realisateur;
    private String dateSortie;
    private String genre;

    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", realisateur='" + realisateur + '\'' +
                ", dateSortie=" + dateSortie +
                ", genre='" + genre + '\'' +
                '}';
    }

    public void afficher() {
        System.out.println(this);
    }
}
