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
public class CannonBall{
    boolean visible;
    double vX;
    double vY;
    double ay=.04;
    Cannon cannon;
    double x;
    int floor;
    double tempVX;
    double tempVY;
    double y;
    public CannonBall(boolean visible, Cannon cannon,int foor){
        this.visible=visible;
        this.cannon=cannon;
        this.floor=foor;
        this.vY=-cannon.getCA()/9.0;
        this.vX=10.0+this.vY;
        System.err.println(this.vX+" "+this.vY);
    }
    public void drawCB(Graphics2D g2d){
        if (visible){
            
            g2d.setColor(Color.BLACK);
            g2d.fillOval((int)Math.round(x-10), (int)Math.round(y-10), 20, 20);
            
        }
    }
    public void fireCB(Graphics2D g2d){
        
        vY=(-cannon.getCA()/9.0);
        vX=(10.0+vY);
        tempVX=vX;
        tempVY=vY;
        visible=true;
        x=(Math.cos(cannon.getCA()*Math.PI/180.0)*100+cannon.getCX())+15;
        y=(cannon.getCY()-Math.sin(cannon.getCA()*Math.PI/180.0)*100)+cannon.getCannonHeight()/2;
        
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void updateCB(){
        
        if(y<floor){
            if (visible){
                x=x+tempVX;
                tempVY=tempVY+ay;
                y=y+tempVY;
            }
        }else{

        }
        
    }
}
