import java.util.Scanner;
public class Money{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter money (1.51 fromat):");
        double amount;
        int amountD;
        int amountC;
        if (in.hasNextDouble()) {
            amount = in.nextDouble();
            System.out.println(amount);
            amountD=(int)amount/1;
            amountC=(int)(amount*100-amountD*100);
            System.out.printf("The total amount of money is %.2f$%nThis includes %d dollers, and %d cents",amount,amountD,amountC);
            } else { 
            System.out.println("Error: please enter in an integer value!");
        }
        in.close();
    }
}