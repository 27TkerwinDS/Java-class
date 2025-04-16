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
            
        }else if(y>=floor){
            AffineTransform affineTransform=new AffineTransform();
            affineTransform.translate(x-10, y-30);
            //rotate cannon
            g2d.setColor(Color.BLUE);
            g2d.drawImage(flame, affineTransform, null );
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
    int imgnum=0;
    public int getImgNum(){
        return imgnum;
    }
    private BufferedImage flame;
    public void updateCB(){
        
        if(y<floor){
            if (visible){
                x=x+tempVX;
                tempVY=tempVY+ay;
                y=y+tempVY;
            }
        }else{
            visible=false;
            if(imgnum<4){
                imgnum++;
            }else{
                imgnum=1;
            }
            try {
                if(imgnum==1){
                    File imageFile = new File("Midia/flame01.png");
                    flame = ImageIO.read(imageFile);
                }else if(imgnum==2){
                    File imageFile = new File("Midia/flame02.png");
                    flame = ImageIO.read(imageFile);
                }else if(imgnum==3){
                    File imageFile = new File("Midia/flame03.png");
                    flame = ImageIO.read(imageFile);                  
                }else if(imgnum==4){
                    File imageFile = new File("Midia/flame04.png");
                    flame = ImageIO.read(imageFile);
                }else{
                    File imageFile = new File("thisdoesn'texist");
                    flame = ImageIO.read(imageFile);
                }
                
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }
        
    }
}
