package org.example.restaurationFactory;

public class ItalianCuisineFactory extends CuisineFactory {
    @Override
    public Ingredient createIngredient() {

        return new ItalianIngredient();
    }

    @Override
    public CookingUstensil createUstensil() {

        return new ItalianUstensil();
    }

    @Override
    public Dish createDish() {

        return new ItalianDish();
    }

}
