package LibraryDataBase.Frame;

import javax.swing.*;
import java.awt.*;

public class StartWindow extends JFrame {
    public StartWindow() {
        super("Library Data Base");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocation(100, 100);

        //setLayout(new GridLayout(2, 1, 10, 10));
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(200,100));
        add(new JButton("Add new book"));
        add(new JButton("Get by ID"));

        setVisible(true);
    }
}
