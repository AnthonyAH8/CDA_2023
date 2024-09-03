package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            JFrame jFrame = new JFrame();
            jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            jFrame.add(new Form().getClass());
            jFrame.pack();
            jFrame.setVisible(true);
    }
}