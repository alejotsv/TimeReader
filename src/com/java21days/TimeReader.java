package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class TimeReader extends JFrame {
    URL time;
    Dimension dim = new Dimension(500, 125);

    TimeReader(){
        super("Time Reader");
        setSize(dim);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea(10, 5);
        textArea.setText("This is my text area here");
        textArea.setEditable(false);
        add(textArea);
        setVisible(true);
    }

}
