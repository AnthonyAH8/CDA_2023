package org.example.tp_computer.Entity;

import org.example.tp_computer.Entity.Computer;
import org.example.tp_computer.Entity.Identifiant;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IHM {
    EntityManagerFactory emf =  Persistence.createEntityManagerFactory("jpa_demo");
    EntityManager em = emf.createEntityManager();

    Scanner sc = new Scanner(System.in);


    public void start (){
        while (true){
            System.out.println("Menu : ");
            System.out.println("1/ cree");
            System.out.println("2/ afficher tout");
            System.out.println("3/ afficher par id");
            System.out.println("4/ supprimer");
            System.out.println("5/ editer");
            int entry = sc.nextInt();
            sc.nextLine();
            switch (entry){
                case 1:
                    createComputer();
                    break;
                case 2:
                    getAllComputer();
                    break;
                case 3:
                    getComputerById();
                    break;
                case 4:
                    deleteComputer();
                    break;
                case 5:
                    editComputer();
                    break;
                default:
                    return;
            }
        }

    }

    private void createComputer (){

        Identifiant identifiant = Identifiant.builder().iMac("Mon adresse imac").ip("mon adress ip").build();
        Processor processor = Processor.builder().name("Intel").build();
        OperatingSystem operatingSystem = OperatingSystem.builder().name("Windows").build();
        Computer computer = Computer.builder().name("MyComputer").price(1200.50f).identifiant(identifiant).operatingSystem(operatingSystem).build();
        OperatingSystem os = OperatingSystem.builder()
                .name("Windows 10")
                .build();

        em.getTransaction().begin();
        em.persist(os);
        em.getTransaction().commit();


        em.getTransaction().begin();
        em.persist(computer);
        em.persist(processor);
        em.persist(operatingSystem);
        em.getTransaction().commit();
    }

    private void getAllComputer (){
        Query query = em.createQuery("select c from Computer c");
        List computerList = query.getResultList();

        for (Object computer : computerList){
            System.out.println(computer);
        }
    }

    private Computer getComputerById (){
        System.out.println("id computer :");
        int id = sc.nextInt();
        sc.nextLine();

        Computer computer = em.find(Computer.class,id);
        if(computer != null){
            System.out.println(computer);
        }else {
            System.out.println("Computer not found");
        }
        return computer;
    }

    private void deleteComputer (){
        Computer computer = getComputerById();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        if(computer != null){
            em.remove(computer);
        }
        transaction.commit();
    }

    private void editComputer (){
        Computer computer = getComputerById();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        if(computer != null){
            computer.setName("myComputer2");
            computer.setPrice(1000.99f);
        }
        transaction.commit();
    }
}
