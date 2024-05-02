package org.example.exercice_strategy;

public class EconomicStrategy implements NavigationStrategy{
    @Override
    public boolean navigate(String destination) {
        System.out.println("Economique" + destination);
        return true;
    }
}
