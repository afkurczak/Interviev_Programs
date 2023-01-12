package LibraryDataBase.Frame;

import java.awt.*;

public class MainFrame {
    public static void mainFrame() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StartWindow();
            }
        });
    }
}
