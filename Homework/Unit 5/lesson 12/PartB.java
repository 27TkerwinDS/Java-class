import java.util.Scanner;
public class PartB {
    public static double smallest(double x, double y, double z){
        double smallest=1;
        if((x<y)&&(x<z)){
            smallest=x;
        }else if((y<x)&&(y<z)){
            smallest=y;
        }else if((z<x)&&(z<y)){
            smallest=z;
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a=0;
        double b=0;
        double c=0;
        System.out.print("Enter first number: ");
        if(in.hasNextDouble()){
            a=in.nextDouble();
        }else{
            System.err.println("Double only!");
            System. exit(0);
        }
        System.out.print("Enter second number: ");
        if(in.hasNextDouble()){
            b=in.nextDouble();
        }else{
            System.err.println("Double only!");
            System. exit(0);
        }
        System.out.print("Enter third number: ");
        if(in.hasNextDouble()){
            c=in.nextDouble();
        }else{
            System.err.println("Double only!");
            System. exit(0);
        }
        System.out.println("The smallest number is: "+PartB.smallest(a,b,c));
        in.close();
    }
}
