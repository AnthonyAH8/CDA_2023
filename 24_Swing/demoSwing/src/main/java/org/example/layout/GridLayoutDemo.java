package org.example.layout;

import lombok.Data;

import javax.swing.*;
import java.awt.*;

@Data
public class GridLayoutDemo {
    private JPanel jpanel;

    public GridLayoutDemo() {
        jpanel = new JPanel(new GridLayout(3, 3));
        for (int i = 0; i < 3; i++) {
            JButton jbutton = new JButton("Button " + i);
            jbutton.addActionListener(e -> {
                System.out.println(((JButton)e.getSource()).getText());
            });
            jpanel.add(jbutton);
        }

    }
}
