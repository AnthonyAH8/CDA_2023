package org.example.exercice_strategy;

public class OffRoadStrategy implements NavigationStrategy{
    @Override
    public boolean navigate(String destination) {
        System.out.println("Sentiers" + destination);
        return true;
    }
}
