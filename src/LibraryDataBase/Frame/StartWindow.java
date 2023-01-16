package LibraryDataBase.Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindow extends JFrame {
    public StartWindow() {
        super("Library Data Base");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocation(100, 100);
        JPanel imagePanel = new BackgroundImage();
        add(imagePanel);

        //setLayout(new GridLayout(2, 1, 10, 10));
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(200,100));
        add(new JButton("Add new book"));
        add(new JButton("Get by ID"));
        add(new JButton("Find by ISBN"));
        add(new JButton("Find by Author"));
        add(new JButton("Find by Title"));

        setVisible(true);
    }

    class ButtonAddNewBook extends JButton implements ActionListener{
        ButtonAddNewBook(){
            addActionListener(this);
        }
        @Override
        public void actionPerformed(ActionEvent e){
           // StartWindow.setBackground(Color.GREEN);
        }
    }
}
