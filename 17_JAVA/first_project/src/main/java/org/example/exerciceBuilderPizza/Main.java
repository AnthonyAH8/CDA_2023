package org.example.exerciceBuilderPizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.PizzaBuilder().height(Pizza.Height.GRANDE).build();
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza.PizzaBuilder().height(Pizza.Height.GRANDE).paste(Pizza.Paste.FINE).cheese(Pizza.Cheese.CHEDDAR).garniture(Pizza.Garniture.CHAMPIGNON).sauce(Pizza.Sauce.CREMEFRAICHE).build();
        System.out.println(pizza2);

        Pizza pizza3 = new Pizza.PizzaBuilder().height(Pizza.Height.MOYENNE).paste(Pizza.Paste.EPAISSE).cheese(Pizza.Cheese.SANSFROMAGE).garniture(Pizza.Garniture.POIVRONS).sauce(Pizza.Sauce.BARBECUE).build();
        System.out.println(pizza3);
    }
}
