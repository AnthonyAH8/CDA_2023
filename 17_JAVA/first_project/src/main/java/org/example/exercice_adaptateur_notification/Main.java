package org.example.exercice_adaptateur_notification;

public class Main {
    public static void main(String[] args) {
        SmsService sendEmail = new NotificationAdapter();
        sendEmail.sendSms("1234560", "nouveau moyen de paiement");

    }
}
