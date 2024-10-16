import java.util.Scanner;
public class Demo{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Give me two numbers reble scum:");
        double x=in.nextDouble();
        double y=in.nextDouble();
        double av=(double)(x+y)/2;
        System.out.println(av);
        in.close();
    }
}