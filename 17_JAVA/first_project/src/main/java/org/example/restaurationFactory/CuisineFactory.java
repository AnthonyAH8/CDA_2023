package org.example.restaurationFactory;

public abstract class CuisineFactory {
    public abstract Ingredient createIngredient();
    public abstract CookingUstensil createUstensil();
    public abstract Dish createDish();


}
