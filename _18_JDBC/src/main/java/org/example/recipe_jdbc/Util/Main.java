package org.example.recipe_jdbc.Util;

import org.example.recipe_jdbc.Util.Ihm.Ihm;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Ihm ihm = new Ihm();
        ihm.startIngredient();
    }
}
