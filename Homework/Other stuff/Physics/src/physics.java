import java.util.Scanner;

public class physics {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Scanner in = new Scanner(System.in);
        //String name = in.nextLine();
        //h = h0 + v0·t + ½·g·t2
        Scanner in = new Scanner(System.in);
        System.out.print("initial hight (m): ");
        double h0 = in.nextDouble();
        System.out.print("initial volocity (m/s): ");
        double v0 = in.nextDouble();
        System.out.print("time: ");
        double t = in.nextDouble();
        double result=0;
        final double G= -9.81;
        System.out.println("h0="+ h0);
        System.out.println("v0="+ v0);
        System.out.println("t="+ t);
        System.out.println("G="+ G);
        result= h0 + v0*t+.5*G*(t*t);
        System.out.println("result="+ result);
    }
}
