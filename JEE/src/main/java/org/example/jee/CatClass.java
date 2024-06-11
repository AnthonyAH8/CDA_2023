package org.example.jee;

import java.time.LocalDate;
import java.util.Date;

public class CatClass {
    private String name;
    private String race;
    private String favouriteMeal;
    private LocalDate birthdate;

    public CatClass(String name, String race, String favouriteMeal, LocalDate birthdate) {
        this.name = name;
        this.race = race;
        this.favouriteMeal = favouriteMeal;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getFavouriteMeal() {
        return favouriteMeal;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
}
