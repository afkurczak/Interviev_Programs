package LibraryDataBase.Frame;

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class MainFrame {

    public static void MainFrame() {
        StartWindow frame = new StartWindow();
        frame.setVisible(true);
    }

    public static void MainFrame1() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StartWindow();
            }
        });
    }
}
