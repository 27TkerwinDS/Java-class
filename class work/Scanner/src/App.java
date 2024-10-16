import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name);
        System.out.print("mo=");
        double mo;
        mo=input.nextDouble();
        int yo;
        System.out.print("yo=");
        yo=input.nextInt();
        double result;
        result=(double)mo/yo;
        System.out.println(result);
    }
}
