package org.example.demo_singleton;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        while (true) {
            System.out.println(RandomNumber.getInstance());
            Thread.sleep(1000);
        }
    }
}

