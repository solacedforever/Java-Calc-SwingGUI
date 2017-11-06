package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    
    private JTextArea display;
    
    
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    


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
        sendDisplay();
        sendButtons();
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
                String tempDisplay = display.getText();
                StringSelection string = new StringSelection(tempDisplay);
                Clipboard system = Toolkit.getDefaultToolkit().getSystemClipboard();
                system.setContents(string, string);
                
            }
        });

        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "There are no help topics","Calculator",JOptionPane.OK_OPTION);
            
            }
        });

        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "SampleCalc","Calculator",JOptionPane.OK_OPTION);
    
            }
        });

        
        file.add(close);
        edit.add(copy);
        help.add(view);
        help.add(about);
    }
    
    private void sendDisplay(){
        display = new JTextArea("0");
        display.setBounds(10,10,325,40);
        display.setEditable(false);
        display.setFont(new Font("Arial",Font.PLAIN,32));
        add(display);
    }
    
    private void sendButtons() {
        
        one = new JButton ("1");
        one.setBounds(10,194,65,55);
        one.addActionListener(new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().length() > 13)
                    return;
            
                if (display.getText().equalsIgnoreCase("0")){
                    display.setText("1");
                    return;
                }
                display.append("1");
            }
        });
        add(one);
        
        two = new JButton ("2");
        two.setBounds(82,194,65,55);
        two.addActionListener(new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().length() > 13)
                    return;
            
                if (display.getText().equalsIgnoreCase("0")){
                    display.setText("2");
                    return;
                }
                display.append("2");
            }
        });
        add(two);
        
        three = new JButton ("3");
        three.setBounds(154,194,65,55);
        three.addActionListener(new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().length() > 13)
                    return;
            
                if (display.getText().equalsIgnoreCase("0")){
                    display.setText("3");
                    return;
                }
                display.append("3");
            }
        });
        add(three);
        
        
        
        four = new JButton ("4");
        four.setBounds(10,132,65,55);
        four.addActionListener(new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().length() > 13)
                    return;
            
                if (display.getText().equalsIgnoreCase("0")){
                    display.setText("4");
                    return;
                }
                display.append("4");
            }
        });
        add(four);
        
        five = new JButton("5");
        five.setBounds(82,132, 65,55);
        five.addActionListener(new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().length() > 13)
                    return;
            
                if (display.getText().equalsIgnoreCase("0")){
                    display.setText("5");
                    return;
                }
                display.append("5");
            }
        });
        add(five);
        
        six = new JButton ("6");
        six.setBounds(154,132,65,55);
        six.addActionListener(new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().length() > 13)
                    return;
            
                if (display.getText().equalsIgnoreCase("0")){
                    display.setText("6");
                    return;
                }
                display.append("6");
            }
        });
        add(six);
        
        seven = new JButton("7");
        seven.setBounds(10,70,65,55);
        seven.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().length() > 13)
                    return;
                
                if (display.getText().equalsIgnoreCase("0")){
                    display.setText("7");
                    return;
                }
                display.append("7");
            }
        });
        add(seven);
        
        eight = new JButton("8");
        eight.setBounds(82,70,65,55);
        eight.addActionListener(new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().length() > 13)
                    return;
            
                if (display.getText().equalsIgnoreCase("0")){
                    display.setText("8");
                    return;
                
                }
                display.append("8");
            }
        });
        add(eight);
        
        nine = new JButton("9");
        nine.setBounds(154,70,65,55);
        nine.addActionListener(new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if (display.getText().length() > 13)
                    return;
            
                if (display.getText().equalsIgnoreCase("0")){
                    display.setText("9");
                    return;
                }
                display.append("9");
            }
        });
        add(nine);
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
