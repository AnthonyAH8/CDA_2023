package org.example.hotel;

//Une classe réservation (numéro, statut (validée, annulée), client, une chambre)
public class Reservation {
    private int numero;
    private boolean statut;
    private String client;
    private int chambre;

    public Reservation(int numero, boolean statut, String client, int chambre) {
        this.numero = numero;
        this.statut = statut;
        this.client = client;
        this.chambre = chambre;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isStatut() {
        return statut;
    }

    public String getClient() {
        return client;
    }

    public int getChambre() {
        return chambre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setChambre(int chambre) {
        this.chambre = chambre;
    }
}
