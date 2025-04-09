import animate.*;
import java.awt.EventQueue;
import java.awt.Graphics2D;

public class PartA {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("image example");
            myApp.setVisible(true);
        });
    }
}
