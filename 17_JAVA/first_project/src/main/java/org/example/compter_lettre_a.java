package org.example;

public class compter_lettre_a {

    public static int foundLetterA(String word) {
        int counter = 0;
        for (char letter : word.toLowerCase().toCharArray()) {
            if (letter == 'a') {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        System.out.println(foundLetterA("C'est le b-a ba"));
        System.out.println(foundLetterA("C'est le b-A bA"));
        System.out.println(foundLetterA("Mixer"));
    }
}