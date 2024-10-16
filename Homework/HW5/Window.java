//Thomas Kerwin 10/2/2024
import javax.swing.JOptionPane;
public class Window {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter name:");
        System.out.println(name);
        String in = JOptionPane.showInputDialog("Enter first number:");
        Double one= Double.parseDouble(in);
        in = JOptionPane.showInputDialog("Enter first number:");
        Double two= Double.parseDouble(in);
        JOptionPane.showMessageDialog(null, "Average="+ (Double)(one+two)/2);
    }
}
