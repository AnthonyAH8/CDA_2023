package org.example.layout;

import lombok.Data;

import javax.swing.*;
import java.awt.*;
import java.util.EventObject;

@Data
public class CalculatriceLayout {
    private JPanel jpanel;
    private JTextField jTextField;
    private EventObject e;

    public CalculatriceLayout() {
        jpanel = new JPanel();
        jpanel.setLayout(new GridLayout(6, 5, 10, 5));
        jpanel.setBackground(Color.black);

        jTextField = new JTextField();
        jTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        jTextField.setEditable(false);
        jpanel.add(jTextField, BorderLayout.NORTH);



        String[] buttons = {
                "C", "+/-", "%", "/",
                "7", "8", "9", "X",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "0", " ", ",", "="
        };
        for (String button : buttons) {
            JButton jButton = new JButton(button);
            jButton.setBackground(Color.white);
            jButton.setForeground(Color.black);
            jButton.setBorderPainted(false);
            jpanel.add(jButton);
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.weightx = 1;
            constraints.weighty = 1;
            constraints.fill = GridBagConstraints.BOTH;
        }
    }
    public int addition(int a, int b) {
        return a + b;
    }
    public int subtraction(int a, int b) {
        return a - b;
    }
    public int multiplication(int a, int b) {
        return a * b;
    }
    public int division(int a, int b) {
        return a / b;
    }

    private void result(int a, int b){
        String operation = ((JButton) e.getSource()).getText();
        switch (operation) {
            case "0":
                jTextField.setText("0");
                break;
            case "+":
                addition(a,b);
                break;
            case "-":
                subtraction(a,b);
                break;
            case "X":
                multiplication(a,b);
                break;
            case "/":
                division(a,b);
                break;
            default:
                break;
        }
    }
}

