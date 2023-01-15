package LibraryDataBase.Frame;

import java.awt.*;
import java.io.File;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;


public class BackgroundImage extends JPanel {
    private BufferedImage image;

    public void ImagePanel(){
        //super();

        File imageFile = new File("image-background.jpg");
        try {
            image = ImageIO.read(imageFile);
        } catch (IOException e){
            System.err.println("Read imgage error");
            e.printStackTrace();
        }
        Dimension dimension = new Dimension(image.getWidth(), image.getHeight());
        setPreferredSize(dimension);
    }
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image, 0 ,0, this);
    }
}
