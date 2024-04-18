package org.example.hotel;

//Une classe chambre (numéro, statut (Libre ou occupée), tarif, capacité)
public class Chambre {
    private int numero;
    private boolean statut;
    private double tarif;
    private int capacite;

    public Chambre(int numero, boolean statut, double tarif, int capacite) {
        this.numero = numero;
        this.statut = statut;
        this.tarif = tarif;
        this.capacite = capacite;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isStatut() {
        return statut;
    }

    public double getTarif() {
        return tarif;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
