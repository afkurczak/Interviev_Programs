package LibraryDataBase.Frame;

import LibraryDataBase.Author;
import LibraryDataBase.Book;
import LibraryDataBase.InFileDataBase;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MakeWindow extends JFrame {
    private JTextField titleField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField isbnField;
    private JTextField releaseDateField;

    public MakeWindow(String windows, boolean nextPrevButtons){
        displayBookWindow(windows, nextPrevButtons);
    }

    public void displayBookWindow(String windowTitle, boolean nextPrevButtons){
        setTitle(windowTitle);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 480);
        setLocation(100, 100);
        setLayout(null);

        ImageIcon background = new ImageIcon("background.jpg");
        JLabel label = new JLabel(background);
        label.setBounds(140, -50, 600, 480);
        getContentPane().add(label);

        getContentPane().setBackground(new Color(0, 0, 0, 0));

    }
}
