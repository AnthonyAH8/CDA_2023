package org.example.restaurationFactory;

public class Restaurant{
    private CuisineFactory cuisineFactory;

    public void setCuisineFactory(CuisineFactory cuisineFactory) {
        this.cuisineFactory = cuisineFactory;
    }

    public CuisineFactory getCuisineFactory() {
        return cuisineFactory;
    }

    public void prepareDish() {
        Ingredient ingredient = cuisineFactory.createIngredient();
        CookingUstensil cookingUstensil = cuisineFactory.createUstensil();
        Dish dish = cuisineFactory.createDish();

        ingredient.prepare();
        cookingUstensil.use();
        dish.serve();
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "cuisineFactory=" + cuisineFactory +
                '}';
    }
}
