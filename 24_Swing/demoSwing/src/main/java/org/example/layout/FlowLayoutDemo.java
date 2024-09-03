package org.example.layout;

import lombok.Data;

import javax.swing.*;
import java.awt.*;

@Data
public class FlowLayoutDemo {
    private JPanel jpanel;
    private JLabel jlabel;
    private JComboBox<String> jcomboBox;

    public FlowLayoutDemo() {
        jpanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 20));

        JButton jbutton = new JButton("BUTTON1");
        jbutton.setBackground(Color.black);
        jbutton.setForeground(Color.white);
        jbutton.addActionListener(e -> System.out.println("Button clicked"));

        jpanel.add(jbutton);
        jpanel.add(new JButton("Bouton2"));
        jpanel.add(new JButton("Bouton3"));

        JTextField jtextField = new JTextField(20);
        jpanel.add(jtextField);

        jcomboBox = new JComboBox<>(new String[]{"1", "2", "3", "4"});
        jpanel.add(jcomboBox);

        jlabel = new JLabel("Label");
        jpanel.add(jlabel);

        JButton validateButton = new JButton("Valider");
        validateButton.addActionListener(e -> {
            String selectedItem = (String) jcomboBox.getSelectedItem();
            String text = jtextField.getText();

            jlabel.setText("Input data: " + text + " : " + selectedItem);
        });

        jpanel.add(validateButton);
    }
}
