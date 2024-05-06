package org.example.exercice_adaptateur_service;

class PaymentAdapter implements NewPaymentProcessor {
    @Override
    public void authenticate(String apiKey) {

        System.out.println("Authentifié avec: " + apiKey);
    }

    @Override
    public void sendPayment(double amount) {
        System.out.println("Envoi de " + amount + " euros.");
    }

    @Override
    public String getPayment() {
        return null;
    }

    @Override
    public void makePayment(String number, double v) {

    }
}
