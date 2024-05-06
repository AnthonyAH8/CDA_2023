package org.example.exercice_adaptateur_service;

public interface NewPaymentProcessor {
    void authenticate(String apiKey);
    void sendPayment(double amount);

    public String getPayment();

    void makePayment(String number, double v);
}
