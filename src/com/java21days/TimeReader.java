package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class TimeReader extends JFrame {
    URL time;
    Dimension dim = new Dimension(300, 300);

    TimeReader(){
        super("Time Reader");
        setSize(dim);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }

}
