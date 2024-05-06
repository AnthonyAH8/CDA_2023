package org.example.exercice_adaptateur_service;

public class Main {
    public static void main(String[] args) {
        String apiKey = "clé_api";
        PaymentAdapter paymentAdapter = new PaymentAdapter();
        System.out.println(apiKey);
        paymentAdapter.makePayment("1234567890", 100.0);
    }
}

