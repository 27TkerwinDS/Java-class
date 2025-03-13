import animate.*;
import java.awt.EventQueue;

public class PartA {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Animate myApp = new Animate("image example");
            myApp.setVisible(true);
        });
    }
}