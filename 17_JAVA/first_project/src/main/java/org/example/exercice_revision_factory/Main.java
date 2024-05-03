package org.example.exercice_revision_factory;

public class Main {
    public static void main(String[] args) {
        MobileApplication android = new MobileApplication(new AndroidUIFactory());
        android.renderApplication();

        System.out.println("=======================");

        MobileApplication ios = new MobileApplication(new IOSUIFactory());
        ios.renderApplication();
    }
}
