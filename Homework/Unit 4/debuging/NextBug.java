import java.util.Scanner;

public class NextBug {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number of cookies: ");
    int num = in.nextInt();
    double discount=1;
    // discount didn't work because if it was less than than or equal to 6 discount would never get value
    if (num > 6) {
        discount = 0.05;
    } else if (num > 12) {
    discount = 0.10;
    }
    System.out.println("Discount = " + discount);  
    in.close();
    }
    //compilation error
}
