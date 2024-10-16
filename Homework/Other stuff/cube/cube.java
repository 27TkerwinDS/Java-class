import java.util.Scanner;
public class cube{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("HELLO world");
        System.out.print("enter hight: ");
        double h=in.nextDouble();
        System.out.print("enter width: ");
        double w=in.nextDouble();
        System.out.print("enter length: ");
        double l=in.nextDouble();
        //gather info
        double aria=h*w*l;
        double surfece=2*w*l+2*l*h+2*w*h;
        //calc numbers
        System.out.printf(" hight: %,13.2fcm%nlength: %,13.2fcm%n width: %,13.2fcm%n",h,w,l);
        //prints out all veriables with spacing
        System.out.printf("and:%naria:         %,12.2fcm%nsurfece aria: %,12.2fcm%n",aria,surfece);
        in.close();
    }
}