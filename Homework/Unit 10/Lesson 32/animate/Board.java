package animate;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.security.Key;

import javax.swing.JPanel;

import org.w3c.dom.events.MouseEvent;
public class Board extends JPanel implements KeyListener,MouseListener{
    private final int B_WIDTH = 650;
    private final int B_HEIGHT = 480;
    private final int B_RAD=20;
    private int bx=B_WIDTH/2;
    private int by=B_HEIGHT/2;
    Graphics2D g2d;
 
    /*
     * Constructor
     */
    public Board() {
        // set background color of the board and default size.
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        this.setFocusable(true);
        this.addKeyListener(this);
        this.addMouseListener(this);

        // attempt to load the image.

    } 
    public void paintComponent(Graphics g) {
        // call the parent class method.
        super.paintComponent(g);
        g2d=(Graphics2D) g;
        g2d.setColor(Color.MAGENTA);
        g2d.fillOval(bx-B_RAD/2, by-B_RAD/2, B_RAD, B_RAD);
        
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
        System.out.println("Hi");
        if (e.getKeyCode()==32){
            bx=B_WIDTH/2;
            by=B_HEIGHT/2;
            repaint();
            System.out.println("Bye");
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
        bx=e.getX();
        by=e.getY();
        System.out.println(bx+", "+by);
        repaint();

    }
    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }
    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }
    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }
    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }

}


