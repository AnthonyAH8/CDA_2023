package com.example.service;

import com.example.entity.Personne;
import com.example.repository.PersonneRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class PersonneService {

    @Inject
    PersonneRepository personneRepository;

    @Transactional
    public Personne createPersonne(String nom, String prenom, int age){
        Personne personne = new Personne();
        personne.setNom(nom);
        personne.setPrenom(prenom);
        personne.setAge(age);
        personneRepository.persist(personne);
        return personne;
    }

    public List<Personne> getAllPersonne(){
        return personneRepository.listAll();
    }

    public Optional<Personne> getPersonneById(Long id){
        return personneRepository.findByIdOptional(id);
    }

    public List<Personne> getPersonne(String nom){
        return personneRepository.findByNom(nom);
    }

    @Transactional
    public void deletePersonne(Long id){
        personneRepository.deleteById(id);
    }

    @Transactional
    public Personne addPerson(Personne personne){
        personneRepository.persist(personne);
        return personne;
    }

}
