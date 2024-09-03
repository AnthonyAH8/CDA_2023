package org.example;

import lombok.Data;

import javax.swing.*;
import java.awt.*;

@Data
public class Form {
    private JPanel jpanel;
    private JTextField jTextField;
    private JButton jButton;
    private GridBagLayout gridBagLayout;
    private GridBagConstraints constraints;

    public Form() {
        jpanel = new JPanel();
        gridBagLayout = new GridBagLayout();

        jpanel.setLayout(gridBagLayout);
        jTextField = new JTextField();

        jButton = new JButton();
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;

    }
}
