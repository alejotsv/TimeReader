package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
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
        String time = showTime("http://www.whattimeisit.com/");
        textArea.setText(time);
        textArea.setEditable(false);
        add(textArea);
        setVisible(true);
    }

    String showTime(String url){
        String time = "We were unable to reach the time URL";
        try {
            URL timeURL = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) timeURL.openConnection();
            connection.connect();
            InputStreamReader in = new InputStreamReader((InputStream) connection.getContent());
            BufferedReader buffer = new BufferedReader(in);
            String text;
            do {
                text= buffer.readLine();
                if(text.contains("US/Eastern Time")){
                    int index = text.indexOf("<td align=right width=\"15%\">") + 30;
                    System.out.println(text.substring(index, index +8));
                }
            } while(buffer.readLine() != null);

            buffer.close();
        } catch (MalformedURLException e){
            System.out.println("Malformed URL Exception: " + e.getMessage());
        } catch (IOException e){
            System.out.println("I/O Exception: " + e.getMessage());
        }

        return time;
    }

}
