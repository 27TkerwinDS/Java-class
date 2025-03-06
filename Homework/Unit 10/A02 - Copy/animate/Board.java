package animate;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Board extends JPanel {
    private final int B_WIDTH = 750;
    private final int B_HEIGHT = 550;
    private BufferedImage img;
    private int x=0;
    private int y=0;
 
    /*
     * Constructor
     */
    public Board() {
        // set background color of the board and default size.
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        x=0;
        y=B_HEIGHT/2;
 
        // attempt to load the image.
        try {
            File imageFile = new File("Midia/Andy.png");
            img = ImageIO.read(imageFile);
            setPreferredSize(new Dimension(720, 720));
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
        affineTransform.translate(x-img.getWidth(), y-img.getHeight());
        Ellipse2D ellipse =new Ellipse2D.Double(0,0,img.getWidth(),img.getHeight());
        g2d.drawImage(img, affineTransform, null );
    }
}


