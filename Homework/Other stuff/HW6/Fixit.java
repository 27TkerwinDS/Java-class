import java.util.Scanner;
public class Fixit {
    public static void main(String[] args) {
        // prompt user for age.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // are they lucky?
        if (age == 13) {
        System.out.println("Lucky 13!");
        }
        double a = 1.2; 
        double b= 3.0;
        double c = a * b; 
        final double ROUND=1e-14;

        if(Math.abs(c-3.6) < ROUND){
        System.out.println("c is 3.6");
        } else {
        System.out.println("c is not 3.6");
        }

        input.close();
    }
}
