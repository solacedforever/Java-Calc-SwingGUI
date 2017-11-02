package com.company;

import javax.swing.*;

public class Calculator extends JFrame {

    private static final long serialVersionUID = 192838L;

    private JMenuBar menuBar;
    private JMenu file;
    private JMenuItem close;

    public static void main(String[] args) {
        new Calculator();

    }//ends main

    public Calculator() {
        super("Calculator");
        sendMenuBar();
        sendUI(this);
    }

    private void sendMenuBar() {
        menuBar = new JMenuBar();
        close = new JMenuItem("Close");
        file = new JMenu(" File ");
        setJMenuBar(menuBar);
        menuBar.add(file);
        file.add(close);
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
