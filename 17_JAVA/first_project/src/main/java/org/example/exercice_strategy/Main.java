package org.example.exercice_strategy;

public class Main {
    public static void main(String[] args) {

        NavigationSystem navigationSystem = new NavigationSystem();


        navigationSystem.setStrategy(new RoadStrategy());
        navigationSystem.navigate(" vers Paris.");


        navigationSystem.setStrategy(new OffRoadStrategy());
        navigationSystem.navigate(" dans les montagnes.");

        navigationSystem.setStrategy(new EconomicStrategy());
        navigationSystem.navigate(" vers la plage.");
    }
}
