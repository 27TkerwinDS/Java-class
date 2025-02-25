package animate;
import animate.Application;
import animate.Board2;
import java.awt.EventQueue;

public class PartA {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("Title");
            myApp.setVisible(true);
        });
    }
}
