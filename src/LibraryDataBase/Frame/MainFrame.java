package LibraryDataBase.Frame;

import java.awt.*;

public class MainFrame {
    public static void MainFrame() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StartWindow();
            }
        });
    }
}
