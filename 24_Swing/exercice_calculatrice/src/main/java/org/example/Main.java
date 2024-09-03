package org.example;

import org.example.layout.CalculatriceLayout;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculatrice");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.add(new CalculatriceLayout().getJpanel());
    }
}