import javax.swing.JOptionPane;
public class Pie{
    public static void main(String[] args) {
        String inwin=JOptionPane.showInputDialog("Welcome to TK baked goods!"+"\nPies cost 10$\nthere is a 10% discout for 3 or more pies.\n\nHow many pies would you like to order?");
        int pie=Integer.parseInt(inwin);
        double cost=pie*10;
        if(pie>=3){
            cost=(double)cost-cost/10;
            JOptionPane.showMessageDialog(null,"Thank you for placing your order.\nYour total is: "+cost+"$\nYou saved 10% on your order.");
        }else{
            JOptionPane.showMessageDialog(null,"Thank you for placing your order.\nYour total is: "+cost+"$");
        }
    }
}