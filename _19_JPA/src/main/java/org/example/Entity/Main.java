package org.example.Entity;

import org.example.Entity.Carburant;
import org.example.Entity.Cars;

import javax.persistence.*;
import java.util.List;

public class Main {
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_demo");
        EntityManager em = emf.createEntityManager();

        Carburant carburant = Carburant.builder()
                .id(1)
                .carburant("carburant")
                .build();

        Cars car2 = Cars.builder()
                .marque("Toyota")
                .modele("Supra")
                .date(2002)
                .color("Verte")
                .carburant(carburant)
                .build();

        em.getTransaction().begin();
        em.persist(car2);
        em.persist(carburant);
        em.getTransaction().commit();

        try {
            Cars carsToFind = em.find(Cars.class, car2.getId());
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

    public static void updateCarburant(EntityManager em, int id, String newCarburant) {
        em.getTransaction().begin();
        Carburant carburant = em.find(Carburant.class, id);
        if (carburant != null) {
            carburant.setCarburant(newCarburant);
            em.getTransaction().commit();
            System.out.println("Carburant modifié: " + carburant);
        } else {
            em.getTransaction().rollback();
            System.out.println("Carburant non trouvé");
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

    public static void deleteCarburant(EntityManager em, Long id) {
        em.getTransaction().begin();
        Carburant carburant = em.find(Carburant.class, id);
        if (carburant != null) {
            em.remove(carburant);
            em.getTransaction().commit();
            System.out.println("Carburant supprimé: " + carburant);
        } else {
            em.getTransaction().rollback();
            System.out.println("Carburant non trouvé");
        }
    }
}
