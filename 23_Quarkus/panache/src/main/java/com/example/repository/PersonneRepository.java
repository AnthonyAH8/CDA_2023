package com.example.repository;

import com.example.entity.Personne;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class PersonneRepository implements PanacheRepository<Personne> {

    public List<Personne> findByNom(String nom) {
        return find("nom", nom).list();
    }

    public List<Personne> findByPrenomAndNom(String prenom, String nom) {
        return find("nom = ?1 and prenom = ?2", prenom, nom).list();
    }

    public List<Personne> findByAge(int age) {
        return find("age >?1", age).list();
    }

    public List<Personne> findByAgeBetween(int minage, int maxage) {
        return find("age >= ?1 and age <= ?2", minage, maxage).list();
    }

    public List<Personne> findByNameContaining(String nom) {
        return find("nom like ?1", "%" + nom).list();
    }
}
