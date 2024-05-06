package org.example.exercice_adaptateur_notification;

public class NotificationAdapter implements SmsService{

    private EmailService emailService;

    public void EmailService(){
        emailService = new EmailService();
    }

    @Override
    public void sendSms(String number, String message) {
        System.out.println("Nouveau système de paiement pour :"+ number);
    }
}
