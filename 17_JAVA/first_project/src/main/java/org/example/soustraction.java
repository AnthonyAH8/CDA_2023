package org.example;

public class soustraction {

    public static int subtract(int a, int b) {
        System.out.println("Je soustrais " + a + " et " + b);
        return a - b;
    }

    public static void main(String[] args) {

        int result = subtract(2, 1);
        System.out.println(result);
    }
}
