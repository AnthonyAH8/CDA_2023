package org.example.exercice_chaise;

public class MainChaise {

    public static void main(String[] args) {
        
        Chaise chaise1 = new Chaise(2, "Bois", "Bleue"); 

        Chaise chaise2 = new Chaise(3, "Métal", "Noir");
        
        System.out.println(chaise1);
        System.out.println(chaise2);
    }
}