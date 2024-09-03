package org.example.layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JPanel {
    public BorderLayoutDemo() {
        setLayout(new BorderLayout());
        JButton jbuttonNorth = new JButton("NORTH");
        JButton jbuttonSouth = new JButton("SOUTH");
        JButton jbuttonWest = new JButton("WEST");
        JButton jbuttonEast = new JButton("EAST");
        JButton jbuttonCenter = new JButton("CENTER");

        jbuttonNorth.setForeground(Color.red);
        jbuttonSouth.setForeground(Color.blue);
        jbuttonWest.setForeground(Color.yellow);
        jbuttonEast.setForeground(Color.green);
        jbuttonCenter.setForeground(Color.lightGray);

        add(jbuttonNorth, BorderLayout.NORTH);
        add(jbuttonSouth, BorderLayout.SOUTH);
        add(jbuttonWest, BorderLayout.WEST);
        add(jbuttonEast, BorderLayout.EAST);
        add(jbuttonCenter, BorderLayout.CENTER);

    }
}
