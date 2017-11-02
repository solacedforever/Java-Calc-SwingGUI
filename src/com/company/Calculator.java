package com.company;

import com.sun.xml.internal.rngom.dt.CachedDatatypeLibraryFactory;

import javax.swing.*;

public class Calculator extends JFrame {

    private static final long serialVersionUID = 192838L;

    public static void main(String[] args) {
        new Calculator();

    }//ends main

    public Calculator() {
        super("Calculator");
        sendUI(this);
    }

    private void sendUI(Calculator app) {
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(350, 400);
        app.setResizable(false);
        app.setLayout(null);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
    }

} // ends calc
