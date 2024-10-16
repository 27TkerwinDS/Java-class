/*
Cookies are $0.99 apiece.
If you purchase > 6 cookies, you get a 2.5% discount on your total order.
If you purchase > 12 cookies, you get a 5% discount on your total order.
If you purchase > 24 cookies you get a 15% discount on your total order
*/
import javax.swing.JOptionPane;
public class Cookies {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome back to TK backerys!");
        JOptionPane.showMessageDialog(null, "Cookies are .99$ apiece.\nIf you purchase > 6 cookies, you get a 2.5% discount on your total order.\nIf you purchase > 12 cookies, you get a 5% discount on your total order.\nIf you purchase > 24 cookies you get a 15% discount on your total order.");
        String in=JOptionPane.showInputDialog("How many cookies would you like to order?");
        int cookies=Integer.parseInt(in);
        double price=cookies*.99;
        if(cookies>24){
            price=price-price/15;
            JOptionPane.showMessageDialog(null, "Your total is: "+price+"$\nYou saved 15%!");
        } else if (cookies>12){
        }else if (cookies>6){
        }else{
        }
    }
}
