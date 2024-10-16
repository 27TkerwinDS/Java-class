import java.util.Scanner;
public class calculatav{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("hello world");
        //set up
        System.out.print("enter first value: ");
        double val1=input.nextDouble();
        System.out.print("enter second value: ");
        double val2=input.nextDouble();
        double answer= (double) (val1+val2)/2;
        //obtains variables
        System.out.println("your answer is...   "+answer+"!");
        System.out.print("type any number to clear!");
        int clear1=input.nextInt();
        int clear2=input.nextInt();
        System.out.printf("Pi=%.100f%n%n", Math.PI);
        System.out.printf("thing1=%,06d%nthing2=%,06d%n", clear1, clear2);
        System.out.println(clear1);
        System.out.flush();
        //calculates average
        input.close();
     }
}