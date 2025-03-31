package animate;

//import java.awt.EventQueue;

import javax.swing.JFrame;

public class Application extends JFrame {
    private final int FRAME_WIDTH = 1640;
    private final int FRAME_HEIGHT = 480;

    /*
     * Constructor.
     */
    public Application(String title) {
        // the values for border width and title bar height
        // depend on the operating system.
        int border_width = 0;
        int bar_height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case LINUX:
                // I don't know what the values are for Linux.
                break;
            case OTHER:
                break;
        }

        int application_width = FRAME_WIDTH + 2 * border_width;
        int application_height = FRAME_HEIGHT + bar_height + border_width;
        this.setTitle(title);
        this.setSize(application_width, application_height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        // Use the inherited setSize() method
       // to set the size of our frame.
       // this.setSize(FRAME_WIDTH, FRAME_HEIGHT);

       // add a Board to our JFrame.
       Board board = new Board();
       this.add(board);
   
       // set the size based on the board size
       // and also account for the border width and the bar height.
       application_height = (int) board.getPreferredSize().getHeight() + bar_height + border_width;
       application_width = (int) board.getPreferredSize().getWidth() + 2 * border_width;
       this.setSize(application_width, application_height);

    }

    public static enum OS {
        WIN, MAC, LINUX, OTHER
    }

    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }
        return val;
    }
    /*private final int SIDE_LEN = 150;
    
    }*/

    /*public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            Application a=new Application("null");
            a.setVisible(true);
        });
        
    }*/
}
