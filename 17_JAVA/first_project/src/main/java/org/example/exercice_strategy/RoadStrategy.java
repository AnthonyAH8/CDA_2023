package org.example.exercice_strategy;

public class RoadStrategy implements NavigationStrategy{
    @Override
    public boolean navigate(String destination) {
        System.out.println("Route" + destination);
        return true;
    }
}
