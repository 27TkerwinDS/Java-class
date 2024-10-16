import javax.swing.JOptionPane;
public class CougarCafe{
    //enum Age{Adult, Child, Senior};
    public static void main(String[] args) {
        double discount=1;
        int age=0;
        JOptionPane.showMessageDialog(null, "Howdy folks!");
        JOptionPane.showMessageDialog(null, "Wellcome to The Cougar Cafe!");
        String in=JOptionPane.showInputDialog("please enter the day:\nEx: Sun, Mon, Tue, ect...");
        if (in.equals("Mon")){
            in=JOptionPane.showInputDialog("please enter the age of the person:");
            age=Integer.parseInt(in);
            if (age<13){
                discount=.075;
            }else if (age>=50){
                discount=.15;
            }else{
                discount=1;
            }
        }else{
            in=JOptionPane.showInputDialog("please enter the age of the person:");
            age=Integer.parseInt(in);
            if (age<13){
                discount=.05;
            }else if (age>=50){
                discount=.075;
            }else{
                discount=1;
            }
        }
        in=JOptionPane.showInputDialog("What was the cost of the meal?");
        double cost=Double.parseDouble(in);
        cost=cost-(cost*discount);
        cost=(Math.round(cost*100))/100.0;
        JOptionPane.showMessageDialog(null, "Your total is:\n"+cost+"$");
    }
}