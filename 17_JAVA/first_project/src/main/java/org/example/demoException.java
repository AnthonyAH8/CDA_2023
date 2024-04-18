package org.example;
import java.util.Scanner;
//
//public class demoException {
//    public static int calcul(int a, int b) {
//        return a / b;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Donner a: ");
//        int a = scanner.nextInt();
//        System.out.print("Donner b: ");
//        int b = scanner.nextInt();
//        int resultat = calcul(a, b);
//        System.out.println("Resultat = " + resultat);
//    }
//}

public class demoException {
    public static int calcul(int a, int b) {
        int c = a / b;
        return c;
    }

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donner a:");
        int a = clavier.nextInt();
        System.out.print("Donner b:");
        int b = clavier.nextInt();
        int resultat = 0;
        try {
            resultat = calcul(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Division par zero");
        }
        System.out.println("Resultat =" + resultat);
    }
}