package org.example.exercice_heritage;

public class Arbre extends Plante{

    public Arbre(String name, double height, String color) {
        super(name, height, color);
        this.circonference = circonference;

        public int getCirconference(){
            return circonference;
        }

        public void setCirconference(int circonference) {
            this.circonference = circonference;
        }
    }
}
