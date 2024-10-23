import java.util.Scanner;
public class Phone {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter a unformated 10 diget phone number: ");
        String totalnumber;
        long q;
        String num1;
        String num2;
        String num3;
        if (in.hasNextLong()) {
            q = in.nextLong();
            totalnumber=String.valueOf(q);
            num1=totalnumber.substring(0,3);
            num2=totalnumber.substring(3,6);
            num3=totalnumber.substring(6);
            System.out.println("("+num1+") "+num2+"-"+num3);
        } else { 
            System.out.println("Error: please enter in an integer value!");
        }
        in.close();
    }
}
