package org.example.tp_global_1;

public class Electric extends Car{

    public Electric(String name, int position) {
        super(name, position);
    }
    private String electricity;

    public String getPropulsion() {

        return electricity;
    }

    public void setPropulsion(String propulsion) {

        this.electricity = propulsion;
    }
}
