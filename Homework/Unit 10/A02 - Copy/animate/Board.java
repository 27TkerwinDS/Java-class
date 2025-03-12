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
import soundStuff.*;
import soundStuff.sound.PlayFile;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
public class Board extends JPanel {
    private final int B_WIDTH = 720;
    private final int B_HEIGHT = 720;
    private BufferedImage img;
    private int x=B_WIDTH/2;
    private int y=B_HEIGHT/2;
    private double angle=0; // radians
    private Timer timer;
    private final int INITIAL_DELAY = 100;
    private final int PERIOD_INTERVAL = 25;
    private int xSpeed = (int)(Math.random()*5)+1;
    private int ySpeed = (int)(Math.random()*5)+1;
    private double angleSpeed=Math.PI/32;
    PlayFile p=new PlayFile("soundStuff/sitar.wav", true);
    PlayFile o=new PlayFile("soundStuff/ow.wav");

    private class ScheduledUpdate extends TimerTask {
        /*
         * Override the run() method.
         * Update the position of our ball here.
         */
        
        public void run() {
            x += xSpeed;
            if (x > B_WIDTH||x<0) {
                xSpeed=xSpeed*-1;
                o.play();
            }
            repaint();
            y += ySpeed;
            if (y > B_HEIGHT||y<0) {
                ySpeed=ySpeed*-1;
                o.play();
            }
            angle=angle+angleSpeed;
            if(angle>2*Math.PI){
                angle=angle-2*Math.PI;
            }else if(angle<= -2*Math.PI){
                angle=+2*Math.PI;
            }
            
            repaint();
            
        }
    }
 
    /*
     * Constructor
     */
    public Board() {
        // set background color of the board and default size.
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        o.open();
        x=B_WIDTH/2;
        y=B_HEIGHT/2;
        Timer t=new Timer();
        p.open();
        p.play();
        t.scheduleAtFixedRate(new ScheduledUpdate(),INITIAL_DELAY,PERIOD_INTERVAL);
 
        // attempt to load the image.
        try {
            File imageFile = new File("Midia/Andy.png");
            img = ImageIO.read(imageFile);
            setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
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
        affineTransform.translate(x-img.getWidth()/2, y-img.getHeight()/2);
        affineTransform.rotate(angle, img.getWidth()/2, img.getHeight()/2);
        g2d.drawImage(img, affineTransform, null );
    }
}


