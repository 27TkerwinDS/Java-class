import java.util.Scanner;
public class A{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int testing=06;
        System.out.print("enter first account ID: ");
        int oneid = in.nextInt();
        System.out.print("enter first account balence: ");
        double oneac=in.nextDouble(); 
        System.out.print("enter second account ID: ");
        int twoid = in.nextInt();
        System.out.print("enter second account balence: ");
        double twoac=in.nextDouble(); 
        System.out.print("enter third account ID: ");
        int threeid = in.nextInt();
        System.out.print("enter third account balence: ");
        double threeac=in.nextDouble(); 
        System.out.printf("Account #%0"+testing+"d has a ballence of $%,14.2f%n",oneid, oneac);
        System.out.printf("Account #%06d has a ballence of $%,14.2f%n",twoid, twoac);
        System.out.printf("Account #%06d has a ballence of $%,14.2f%n",threeid, threeac);
        in.close();
    }
}