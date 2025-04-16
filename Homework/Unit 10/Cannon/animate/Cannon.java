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

//import Midia.*;

//import java.util.Timer;
//import java.util.TimerTask;
public class Cannon extends JPanel{
    private double angle=45;
    private int canonx;
    private int canony;
    private double mussleV=0;
    private BufferedImage imgCannon;
    private int pivotx=15;
    private int pivoty=0;
    AffineTransform affineTransform;
    PlayFile p;
    PlayFile c;
    public Cannon(int x, int y){
        p=new PlayFile("Midia/Wheel.wav");
        c=new PlayFile("Midia/cannon.wav");
        c.open();
        p.open();
        canonx=x;
        canony=y;
        try {
            File imageFile = new File("Midia/sm_cannon.png");
            imgCannon = ImageIO.read(imageFile);
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
    public int getCX(){
        return canonx;
    }
    public void setCX(int newX){
        canonx=newX;
    }
    public int getCY(){
        return canony;
    }
    public void setCY(int newY){
        canony=newY;
    }
    public double getMV(){
        return mussleV;
    }
    public int getCannonHeight(){
        return imgCannon.getHeight();
    }
    public void setMV(double newV){
        mussleV=newV;
    }
    public void cannonRUp(){
        if (angle<90){
            angle=angle+5;
            p.play();
        }
    }
    public void cannonRDown(){
        if (angle>0){
            angle=angle-5;
            p.play();
        }
    }
    public void fire(CannonBall cb, Graphics2D g2d){
        c.play();
        cb.fireCB(g2d);
        
    }
    public void drawCannon(Graphics2D g){
        //super.paintComponent(g);
        affineTransform=new AffineTransform();
        affineTransform.translate(canonx, canony);
        //rotate cannon
        affineTransform.rotate(-1*angle*(Math.PI/180), 15,imgCannon.getHeight()/2);
        g.setColor(Color.BLUE);
        g.drawImage(imgCannon, affineTransform, null );
        //draw triangle
        Polygon triagle=new Polygon();
        triagle.addPoint(canonx+15, canony+26);
        triagle.addPoint(canonx-20,canony+76);
        triagle.addPoint(canonx+50,canony+76);
        g.setColor(Color.PINK);
        g.fillPolygon(triagle);
        //add brim
        g.setColor(Color.BLACK);
        g.drawPolygon(triagle);
        //fill pivot point
        g.fillOval(canonx+10, canony+21, 10, 10);

    }
}
