package org.example.tp_global_1;

public class ThermicCarFactory extends CarFactory{
    @Override
    public ThermicCarFactory createThermicCar(String name) {

        return new ThermicCarFactory();
    }
}
