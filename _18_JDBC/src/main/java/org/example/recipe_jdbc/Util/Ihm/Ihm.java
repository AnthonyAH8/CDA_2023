package org.example.recipe_jdbc.Util.Ihm;

import org.example.recipe_jdbc.DAO.IngredientDao;

import java.util.Scanner;

public class Ihm {
    private Scanner scanner;
    private IngredientDao ingredientDao;

    public Ihm(){
        this.scanner = scanner;
        ingredientDao = new IngredientDao();
    }

    public void startIngredient(){
        int entry;
        while(true){
            System.out.println("Application de gestion de recette");

        }
    }
}
