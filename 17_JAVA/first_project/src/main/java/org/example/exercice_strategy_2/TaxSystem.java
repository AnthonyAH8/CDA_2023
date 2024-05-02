package org.example.exercice_strategy_2;

public class TaxSystem {
    private TaxStrategy strategy;

    public void setStrategy(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    public double taxNavigation(double income) {
        if (strategy == null) {
            throw new IllegalStateException("Tax strategy is not set");
        }

        return strategy.taxCalcul(income);
    }
}