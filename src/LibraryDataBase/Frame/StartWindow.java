package LibraryDataBase.Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindow extends JFrame {
    public StartWindow() {
        setTitle("Library Data Base");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocation(100, 100);
        setLayout(null);

        ImageIcon background = new ImageIcon("background.jpg");
        JLabel label = new JLabel(background);
        label.setBounds(0, 0, 800, 600);
        getContentPane().add(label);

        JButton button1 = new JButton("Add new Book");
        JButton button2 = new JButton("Get by ID");
        JButton button3 = new JButton("Find by ISBN");
        JButton button4 = new JButton("Find by Author");
        JButton button5 = new JButton("Find by Title");
        JButton button6 = new JButton("Delete by ID");
        JButton button7 = new JButton("Update by ID");

        button1.setBounds(50, 50, 200, 30);
        button2.setBounds(50, 90, 200, 30);
        button3.setBounds(50, 130, 200, 30);
        button4.setBounds(50, 170, 200, 30);
        button5.setBounds(50, 210, 200, 30);
        button6.setBounds(50, 250, 200, 30);
        button7.setBounds(50, 290, 100, 20);

        getContentPane().add(button1);
        getContentPane().add(button2);
        getContentPane().add(button3);
        getContentPane().add(button4);
        getContentPane().add(button5);
        getContentPane().add(button6);
        getContentPane().add(button7);

        //((JPanel) getContentPane()).setOpaque(false);
        getContentPane().setBackground(new Color(255, 255, 255, 0));
    }
    }
