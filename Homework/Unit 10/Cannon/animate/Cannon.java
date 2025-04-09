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
import Midia.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.util.Timer;
import java.util.TimerTask;
public class Cannon extends JPanel{
    private double angle=0;
    private double canonx=0;
    private double canony=0;
    private double mussleV=0;
    private BufferedImage img;
    private int pivotx=15;
    private int pivoty=0;
    File cannon;
    PlayFile p;
    PlayFile c;
    public Cannon(int x, int y){
        p=new PlayFile("Midia/wheel.wav");
        c=new PlayFile("Midia/cannon.wav");
        cannon=new File("Midia/sm_cannon.png");
        c.open();
        p.open();
        canonx=x;
        canony=y;
        try {
            File imageFile = new File("Midia/Andy.png");
            img = ImageIO.read(imageFile);
            if (img != null) {
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public double getCA(){
        return angle;
    }
    public void setCA(double newAngle){
        angle=newAngle;
    }
    public double getCX(){
        return canonx;
    }
    public void setCX(double newX){
        canonx=newX;
    }
    public double getCY(){
        return canony;
    }
    public void setCY(double newY){
        canony=newY;
    }
    public double getMV(){
        return mussleV;
    }
    public void setMV(double newV){
        mussleV=newV;
    }
    public void cannonRUp(){
        if (angle<90){
            angle=angle+5;
            c.play();
        }
    }
    public void cannonRDown(){
        if (angle>0){
            angle=angle-5;
            c.play();
        }
    }
    public void fire(){
        c.play();
    }
    public void drawCannon(Graphics2D g){
        super.paintComponent(g);
        AffineTransform affineTransform=new AffineTransform();
        affineTransform.translate(pivotx, pivoty);
        g.drawImage(img, affineTransform, null );
    }
}
