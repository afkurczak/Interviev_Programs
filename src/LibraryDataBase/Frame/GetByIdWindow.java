package LibraryDataBase.Frame;

import LibraryDataBase.Author;
import LibraryDataBase.Book;
import LibraryDataBase.InFileDataBase;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GetByIdWindow extends JFrame {
    private JTextField idField;

    public GetByIdWindow() {

        setTitle("Get by ID");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 480);
        setLocation(100, 100);
        setLayout(null);

        ImageIcon background = new ImageIcon("background.jpg");
        JLabel label = new JLabel(background);
        label.setBounds(140, -50, 600, 480);
        getContentPane().add(label);

        getContentPane().setBackground(new Color(0, 0, 0, 0));

        JLabel idLabel = new JLabel("Enter ID");
        idLabel.setBounds(50, 50, 100, 30);
        idField = new JTextField();
        idField.setBounds(150, 50, 150, 30);
        getContentPane().add(idLabel);
        getContentPane().add(idField);

        JButton button1 = new JButton("SEARCH");
        button1.setBounds(70, 250, 200, 30);

        button1.addActionListener(e -> {


        });

    }
}
