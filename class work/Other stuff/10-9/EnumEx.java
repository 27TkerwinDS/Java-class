import javax.swing.JOptionPane;
import java.util.Scanner;
public class EnumEx{
    enum Daysofweek {sun, mon, tue, wed,thu,fri,sat};
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //JOptionPane.showMessageDialog(null, "Howdy folks!");
       // JOptionPane.showMessageDialog(null, "Wellcome to The Cougar Cafe!");
        //String in=JOptionPane.showInputDialog("Do you have a student ID?\n YES or NO");
     
        int toomany=input.nextInt();
        Daysofweek today;
        if (toomany==0){
            today=Daysofweek.sun;
            System.out.println(today);
        }
        input.close();
    }
}