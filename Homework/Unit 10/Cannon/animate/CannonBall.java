package animate;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
//import javax.swing.JFrame;
import javax.swing.JPanel;
public class CannonBall extends JPanel{
    boolean visible;
    double vX;
    double vY;
    Cannon cannon;
    double x;
    double y;
    public CannonBall(boolean visible, double vX, double vY, Cannon cannon){
        this.visible=visible;
        this.vX=vX;
        this.cannon=cannon;
        this.vY=vY;
       
    }
    public void drawCB(Graphics2D g2d){
        super.paintComponent(g2d);
        if (visible){
            
            g2d.setColor(Color.BLACK);
            g2d.fillOval((int)Math.round(x-10), (int)Math.round(y-10), 20, 20);
            
        }
    }
    public void fireCB(Graphics2D g2d){
        visible=true;
        x=(Math.cos(cannon.getCA()*Math.PI/180.0)*100+cannon.getCX())+10;
        y=(cannon.getCY()-Math.sin(cannon.getCA()*Math.PI/180.0)*100)+10;
        System.out.println(x+" "+ y);
        repaint();

    }
}
