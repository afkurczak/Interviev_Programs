package LibraryDataBase.Frame;


import LibraryDataBase.Book;
import LibraryDataBase.InFileDataBase;
import javax.swing.*;
import java.awt.*;


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
        idField.setBounds(100, 50, 50, 30);
        getContentPane().add(idLabel);
        getContentPane().add(idField);

        JButton button1 = new JButton("SEARCH");
        JButton button2 = new JButton("BACK");

        button1.setBounds(150, 50, 150, 30);
        button2.setBounds(200, 350, 200, 30);

        getContentPane().add(button1);
        getContentPane().add(button2);

        button1.addActionListener(e -> {

            InFileDataBase inFileDataBase = new InFileDataBase();
            Book book = inFileDataBase.getById(Long.parseLong(String.valueOf(idField.getText())));

            JLabel GetIdLabel = new JLabel("ID:");
            JLabel GetTitleLabel = new JLabel("Title:");
            JLabel GetIsbnLabel = new JLabel("ISBN:");
            JLabel GetAuthorLabel = new JLabel("Author:");
            JLabel GetReleaseLabel = new JLabel("Release Date:");

            JLabel GetIdValue = new JLabel(book.getId().toString());
            JLabel GetTitleValue = new JLabel(book.getTitle());
            JLabel GetIsbnValue = new JLabel(book.getIsbn());
            JLabel GetAuthorValue = new JLabel(book.getAuthor().toString());
            JLabel GetReleaseValue = new JLabel(book.getReleaseTime().toString());

            GetIdLabel.setBounds(50, 80, 100, 30);
            GetIdValue.setBounds(150, 80, 200, 30);

            GetTitleLabel.setBounds(50, 100, 100, 30);
            GetTitleValue.setBounds(150, 100, 200, 30);

            GetIsbnLabel.setBounds(50, 120, 100, 30);
            GetIsbnValue.setBounds(150, 120, 200, 30);

            GetAuthorLabel.setBounds(50, 140, 100, 30);
            GetAuthorValue.setBounds(150, 140, 200, 30);

            GetReleaseLabel.setBounds(50, 160, 100, 30);
            GetReleaseValue.setBounds(150, 160, 200, 30);

            getContentPane().add(GetIdLabel);
            getContentPane().add(GetIdValue);

            getContentPane().add(GetTitleLabel);
            getContentPane().add(GetTitleValue);

            getContentPane().add(GetAuthorLabel);
            getContentPane().add(GetAuthorValue);

            getContentPane().add(GetIsbnLabel);
            getContentPane().add(GetIsbnValue);

            getContentPane().add(GetReleaseLabel);
            getContentPane().add(GetReleaseValue);

            repaint();

        });

        button2.addActionListener(e -> {
            setVisible(false);
            dispose();
            new StartWindow().setVisible(true);
        });

    }
}
