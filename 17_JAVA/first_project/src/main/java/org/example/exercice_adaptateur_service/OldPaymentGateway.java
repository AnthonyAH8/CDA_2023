package org.example.exercice_adaptateur_service;

public interface OldPaymentGateway {

    void makePayment(String accountNumber, double amount);

    String getPayment();

    }

