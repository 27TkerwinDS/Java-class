import java.util.Scanner;

public class makingit {
    //public class name of file
    public static void main(String[] args) {
        //type "main" will auto fill
        System.out.println("YOOOOOOO");
        Scanner in=new Scanner (System.in);
        int input1=in.nextInt();
        int input2=in.nextInt();
        double an=(double)(input1+input2)/2;
        System.out.println(an);
        in.close();
    }
}