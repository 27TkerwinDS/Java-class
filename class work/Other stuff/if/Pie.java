import java.util.Scanner;
public class Pie {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.print("Welcome to TK bakerys!%n%n");
        System.out.println("How many pies would you like to order? ");
        int pie=in.nextInt();
        boolean t=pie>=3;
        if (t){
            System.out.println("You qualify for a discount!");
            System.out.println("10% off!");
            
        }




        in.close();
    }
}
