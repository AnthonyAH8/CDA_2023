package org.example.tableaux;

public class Tableau {
    public static void main(String[] args) {
        int[] liste;
        liste = new int[11];
        liste[0] = 5;
        liste[1] = 12;
        liste[2] = 23;
        for (int i = 0; i < liste.length; i++) {
            System.out.println(liste[i]);
        }
    }
}
