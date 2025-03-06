package animate;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Board extends JPanel {
    private final int B_WIDTH = 750;
    private final int B_HEIGHT = 550;
    private int SIDE_LEN=150;
    private BufferedImage img;
 
    /*
     * Constructor
     */
    public Board() {
        // set background color of the board and default size.
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        // attempt to load the image.
        try {
            File imageFile = new File("Midia/stormtrooper-main_011e064e.jpeg");
            img = ImageIO.read(imageFile);
            setPreferredSize(new Dimension(img.getWidth()/2, img.getHeight()/2));
            if (img != null) {
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    } 
    public void paintComponent(Graphics g) {
        // call the parent class method.
        super.paintComponent(g);

        // cast our Graphics object to a Graphics2D object.
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform affineTransform = new AffineTransform();
        int x_t = 0, y_t = 0;
        int x_scaled = 0, y_scaled = 0;
        double scale = 0.25;

        if (img != null) {
            x_t = this.getWidth() / 2;
            x_scaled = (int) ((img.getWidth() * scale));
            y_t = this.getHeight() / 2;
            y_scaled = (int) ((img.getHeight() * scale));
            affineTransform.translate(img.getWidth()/2-x_scaled, img.getHeight()/2-y_scaled);
            affineTransform.scale(scale, scale);
            g2d.drawImage(img, affineTransform, null);

        } else {
            g2d.setColor(Color.BLUE);
            g2d.drawString("Unable to load image!", 25, 25);
        }
    }
    // public static void main(String[] args) {
    //     EventQueue.invokeLater(() -> {
    //         Animate myApp = new Animate("Title");
    //         myApp.setVisible(true);
    //     });
    // }

}


