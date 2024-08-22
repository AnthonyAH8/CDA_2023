package com.example.service;

import com.example.entity.Client;
import com.example.repository.ClientRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class ClientService {

    @Inject
    private ClientRepository clientRepository;

    @Transactional
    public Client createClient(String name, String email, String phoneNumber) {
        Client client = new Client();
        client.setName(name);
        client.setEmail(email);
        client.setPhoneNumber(phoneNumber);
        clientRepository.persist(client);
        return client;
    }

    public Client getClientById(int id) {
        return clientRepository.findById((long) id);
    }

    public List<Client> getAllClients() {
        return clientRepository.listAll();
    }

    @Transactional
    public Client updateClient(int id, String name, String email, String phoneNumber) {
        Client client = clientRepository.findById((long) id);
        client.setName(name);
        client.setEmail(email);
        client.setPhoneNumber(phoneNumber);
        clientRepository.persist(client);
        return client;
    }

    @Transactional
    public void deleteClient(int id) {
        clientRepository.deleteById((long) id);
    }

}
