package animate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

public class Board extends JPanel implements KeyListener,MouseListener{
    private final int B_WIDTH = 1600;
    private final int B_HEIGHT = 900;
    private final int FLOOR=B_HEIGHT-25;
    private Cannon c;
    Graphics2D g2d;
    private CannonBall cb;
 
    /*
     * Constructor
     */
    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        this.addKeyListener(this);
        this.addMouseListener(this);
        this.setFocusable(true);
        c=new Cannon(60, FLOOR-60);
        cb=new CannonBall(false, 6, 6, c);
    } 
    public void paintComponent(Graphics g) {
        // call the parent class method.
        super.paintComponent(g);

        // cast our Graphics object to a Graphics2D object.
        g2d = (Graphics2D) g;
        // translate in the x and y directions.

       g2d.setColor(Color.GREEN);
       // get the transformed shape.
       g2d.fillRect(0, FLOOR, B_WIDTH, 25);
       c.drawCannon(g2d);
       cb.drawCB(g2d);
        
        //g2d.rotate(Math.PI/2);

       // draw the transformed shape on the screen.

    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
        if (e.getKeyCode()==32){
            c.fire(cb, g2d);
        }else if (e.getKeyCode()==37){
            c.cannonRUp();
        }else if (e.getKeyCode()==39){
            c.cannonRDown();
        }else if (e.getKeyCode()==38){
            System.out.println("Up arrow was pressed");
        } else if (e.getKeyCode()==40){
            System.out.println("Down arrow was pressed");
        }else{
            System.out.println("Invalid");
        }
        this.repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
}


