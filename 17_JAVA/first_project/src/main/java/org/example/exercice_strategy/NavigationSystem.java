package org.example.exercice_strategy;

public class NavigationSystem {
    private NavigationStrategy strategy;

    public void setStrategy(NavigationStrategy strategy) {
        this.strategy = strategy;
    }

    public void navigate(String destination) {
        if (strategy == null) {
            System.out.println("Veuillez définir une stratégie de navigation.");
            return;
        }
        strategy.navigate(destination);
    }
}
