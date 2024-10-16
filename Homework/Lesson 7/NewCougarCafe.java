import javax.swing.JOptionPane;
public class NewCougarCafe{
    enum Age{Adult, Child, Senior};
    public static void main(String[] args) {
        double discount=1;
        int age=0;
        JOptionPane.showMessageDialog(null, "Howdy folks!");
        JOptionPane.showMessageDialog(null, "Wellcome to The Cougar Cafe!");
        String in=JOptionPane.showInputDialog("please enter the day:\nEx: Sun, Mon, Tue, ect...");
        String agein=JOptionPane.showInputDialog("please enter the age of the person:");
        age=Integer.parseInt(agein);
        Age gen;
        if (in.equals("Mon")){     
            if (age<13){
                discount=.075;
                gen=Age.Child;
            }else if (age>=50){
                discount=.15;
                gen=Age.Senior;
            }else{
                discount=1;
                gen=Age.Adult;
            }
        }else{
            if (age<13){
                discount=.05;
                gen=Age.Child;
            }else if (age>=50){
                discount=.075;
                gen=Age.Senior;
            }else{
                discount=1;
                gen=Age.Adult;
            }
        }
        in=JOptionPane.showInputDialog("What was the cost of the meal?");
        double cost=Double.parseDouble(in);
        cost=cost-(cost*discount);
        cost=(Math.round(cost*100))/100.0;
        JOptionPane.showMessageDialog(null, "The costomer is a "+gen+"\nYour total is:\n"+cost+"$");
    }
}