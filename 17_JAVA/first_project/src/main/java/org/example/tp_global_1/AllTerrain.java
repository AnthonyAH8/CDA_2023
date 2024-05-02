package org.example.tp_global_1;

public abstract class AllTerrain extends Car{
    public AllTerrain(String name, int position) {
        super(name, position);
    }
    private String hybrid;

    public String getPropulsion() {
        return hybrid;
    }

    public void setPropulsion(String propulsion) {
        this.hybrid = propulsion;
    }
}
