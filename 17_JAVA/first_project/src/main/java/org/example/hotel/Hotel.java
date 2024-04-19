package org.example.hotel;

import java.util.List;


public class Hotel {
    private String name;
    private List<Chambre> chambres;
    private List<Reservation> reservations;
    private List<Client> clients;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Chambre> getChambres() {
        return chambres;
    }
    public void setChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }
    public List<Reservation> getReservations() {
        return reservations;
    }
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
    public List<Client> getClients() {
        return clients;
    }
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
    
}
