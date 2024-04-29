package org.example.builder;

public class Voiture {
    private String marque;
    private String modele;
    private int annee;
    private Voiture(VoitureBuilder builder){
        this.marque = builder.marque;
        this.modele = builder.modele;
        this.annee = builder.annee;

    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", annee=" + annee +
                '}';
    }

    public static class VoitureBuilder{
        private String marque;
        private String modele;
        private int annee;

        public VoitureBuilder marque(String marque){
            this.marque = marque;
            return this;
        }

        public VoitureBuilder modele(String modele){
            this.modele = modele;
            return this;
        }

        public VoitureBuilder annee(int annee){
            this.annee = annee;
            return this;
        }

        public Voiture build(){
            return new Voiture(this);
        }
    }
}
