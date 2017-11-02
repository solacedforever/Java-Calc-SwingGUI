package com.company;

import javax.swing.*;
import javax.swing.text.EditorKit;
import java.awt.event.*;

public class Calculator extends JFrame {

    private static final long serialVersionUID = 192838L;

    private JMenuBar menuBar;
    private JMenu file;
    private JMenu edit;
    private JMenu help;
    private JMenuItem close;
    private JMenuItem copy;
    private JMenuItem view;
    private JMenuItem about;


    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Could not load Sys themed buttons");
        }

        new Calculator();

    }//ends main

    public Calculator() {
        super("Calculator");
        sendMenuBar();
        sendUI(this);
    }

    private void sendMenuBar() {
        menuBar = new JMenuBar();
        file = new JMenu(" File ");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        close = new JMenuItem("Close");
        copy = new JMenuItem("Copy");
        view = new JMenuItem("View Help");
        about = new JMenuItem("About");
        setJMenuBar(menuBar);
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);


        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        file.add(close);
        edit.add(copy);
        help.add(view);
        help.add(about);
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
