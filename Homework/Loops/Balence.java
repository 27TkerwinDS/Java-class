import java.util.Scanner;
public class Balence{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Interest rate: ");
        double ir=in.nextDouble();
        System.out.print("Initial balence: ");
        double ib=in.nextDouble();
        System.out.printf("Year |         Int Earned: ($)      |          Balence ($)");
        in.close();
    }
}