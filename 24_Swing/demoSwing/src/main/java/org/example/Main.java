package org.example;

import org.example.layout.BorderLayoutDemo;
import org.example.layout.FlowLayoutDemo;
import org.example.layout.GridLayoutDemo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setSize(1200, 500);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);

//        jframe.add(new BorderLayoutDemo());
//        jframe.add(new FlowLayoutDemo().getJpanel());
//        jframe.add(new GridLayoutDemo().getJpanel());

        jframe.setVisible(true);
    }
}