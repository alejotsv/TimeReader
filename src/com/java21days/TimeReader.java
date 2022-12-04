package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TimeReader extends JFrame {
    Dimension dim = new Dimension(500, 125);

    TimeReader(){
        super("Time Reader");
        setSize(dim);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea(10, 5);
        String time = showTime("Something");
        textArea.setText(time);
        textArea.setEditable(false);
        add(textArea);
        setVisible(true);
    }

    String showTime(String url){
        String time = "We were unable to reach the time URL";
        try {
            URL timeURL = new URL(url);
        } catch (MalformedURLException e){
            System.out.println("Exception: " + e.getMessage());
        }

        return time;
    }

}
