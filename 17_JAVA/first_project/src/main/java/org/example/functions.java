package org.example;

public class functions {
    public static int add(int a, int b){
        return a + b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        var sum = add(174,2);
        System.out.println(sum);
        var multiply = multiply(174, 2);
        System.out.println(multiply);
    }
}
