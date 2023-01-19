package LibraryDataBase.Frame;

import LibraryDataBase.Author;
import LibraryDataBase.Book;
import LibraryDataBase.InFileDataBase;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicReference;

public class AddNewBookWindow extends JFrame {
    private JTextField titleField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField isbnField;
    private JTextField releaseDateField;

    public AddNewBookWindow() {
        setTitle("Add New Book");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 480);
        setLocation(100, 100);
        setLayout(null);

        ImageIcon background = new ImageIcon("background.jpg");
        JLabel label = new JLabel(background);
        label.setBounds(140, -50, 600, 480);
        getContentPane().add(label);

        getContentPane().setBackground(new Color(0, 0, 0, 0));

        JLabel titleLabel = new JLabel("Title:");
        titleLabel.setBounds(50, 50, 100, 30);
        titleField = new JTextField();
        titleField.setBounds(150, 50, 150, 30);

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(50, 90, 100, 30);
        firstNameField = new JTextField();
        firstNameField.setBounds(150, 90, 150, 30);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(50, 130, 100, 30);
        lastNameField = new JTextField();
        lastNameField.setBounds(150, 130, 150, 30);

        JLabel isbnLabel = new JLabel("ISBN:");
        isbnLabel.setBounds(50, 170, 100, 30);
        isbnField = new JTextField();
        isbnField.setBounds(150, 170, 150, 30);

        JLabel releaseDateLabel = new JLabel("Release Date:");
        releaseDateLabel.setBounds(50, 210, 100, 30);
        releaseDateField = new JTextField();
        releaseDateField.setBounds(150, 210, 150, 30);

        JLabel errorLabel = new JLabel("Write Error: Double ISBN ");
        errorLabel.setBounds(230, 300, 200, 30);

        getContentPane().add(titleLabel);
        getContentPane().add(titleField);
        getContentPane().add(firstNameLabel);
        getContentPane().add(firstNameField);
        getContentPane().add(lastNameLabel);
        getContentPane().add(lastNameField);
        getContentPane().add(isbnLabel);
        getContentPane().add(isbnField);
        getContentPane().add(releaseDateLabel);
        getContentPane().add(releaseDateField);

        JButton button1 = new JButton("SAVE DATA");
        JButton button2 = new JButton("BACK");

        button1.setBounds(70, 250, 200, 30);
        button2.setBounds(200, 350, 200, 30);

        getContentPane().add(button1);
        getContentPane().add(button2);

        Book test = null;

        button1.addActionListener(e -> {

            String releaseDateString = releaseDateField.getText();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate releaseDate = LocalDate.parse(releaseDateString, formatter);

            Book book = new Book(titleField.getText(), isbnField.getText(), releaseDate, new Author(firstNameField.getText(), lastNameField.getText()));
            InFileDataBase inFileDataBase = new InFileDataBase();

            if (test != null) {
                System.out.println(test);
                getContentPane().add(errorLabel);
            }

            inFileDataBase.add(book);
        });



            button2.addActionListener(e -> {
                setVisible(false);
                dispose();
                new StartWindow().setVisible(true);
            });
    }
}
