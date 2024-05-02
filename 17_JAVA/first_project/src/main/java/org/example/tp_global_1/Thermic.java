package org.example.tp_global_1;

public class Thermic extends Car{
    public Thermic(String name, int position) {
        super(name, position);
    }
    private String gas;

    public String getPropulsion() {

        return gas;
    }

    public void setPropulsion(String propulsion) {

        this.gas = propulsion;
    }
}
