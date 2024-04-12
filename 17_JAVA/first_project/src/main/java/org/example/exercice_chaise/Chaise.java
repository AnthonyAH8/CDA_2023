package org.example.exercice_chaise;

public class Chaise {

    private int nbPieds;
    private String materiaux;
    private String couleur;

    public Chaise(int nbPieds, String materiaux, String couleur) {
        this.nbPieds = nbPieds;
        this.materiaux = materiaux;
        this.couleur = couleur;
    }

    public int getNbPieds() {
        return nbPieds;
    }

    public String getMateriaux() {
        return materiaux;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setNbPieds(int nbPieds) {
        this.nbPieds = nbPieds;
    }

    public void setMateriaux(String materiaux) {
        this.materiaux = materiaux;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":\n" +
                "------------\n" +
                "Nombre de pieds = " + nbPieds + "\n" +
                "Matériau = " + materiaux + "\n" +
                "Mouleur = " + couleur
                + "\n";
    }

}
