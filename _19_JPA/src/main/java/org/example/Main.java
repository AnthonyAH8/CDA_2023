package org.example;

import org.example.Entity.Cars;

import javax.persistence.*;
import java.util.List;

public class Main {
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("jpa_demo");
        EntityManager em = emf.createEntityManager();

        Cars car2 = Cars.builder()
                .marque("Toyota")
                .modele("Supra")
                .date(2002)
                .color("Verte")
                .build();

        em.getTransaction().begin();
        em.persist(car2);
        em.getTransaction().commit();

        try {
            Cars carsToFind = em.getReference(Cars.class, 1);
            System.out.println(carsToFind);
        } catch (EntityNotFoundException e) {
            System.out.println("Voiture non trouvée");
            throw new RuntimeException(e);
        }

        Query query = em.createQuery("SELECT car FROM Cars car");
        List<Cars> carQuery = query.getResultList();
        for (Cars c : carQuery) {
            System.out.println(c);
        }

        updateCar(em, car2.getId(), "Peugeot", "208", 2015, "Bleue");

        deleteCar(em, car2.getId());

        em.close();
        emf.close();
    }

    public static void updateCar(EntityManager em, int id, String marque, String modele, int date, String color) {
        em.getTransaction().begin();
        Cars car = em.find(Cars.class, id);
        if (car != null) {
            car.setMarque(marque);
            car.setModele(modele);
            car.setDate(date);
            car.setColor(color);
            em.getTransaction().commit();
            System.out.println("Voiture modifiée: " + car);
        } else {
            em.getTransaction().rollback();
            System.out.println("Voiture non trouvée");
        }
    }

    public static void deleteCar(EntityManager em, int id) {
        em.getTransaction().begin();
        Cars car = em.find(Cars.class, id);
        if (car != null) {
            em.remove(car);
            em.getTransaction().commit();
            System.out.println("Voiture supprimée: " + car);
        } else {
            em.getTransaction().rollback();
            System.out.println("Voiture non trouvée");
        }
    }
}
