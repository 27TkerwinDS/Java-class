import java.util.Scanner;
public class Monogram{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your first middle and last names: ");
        String first=in.next();
        String middle=in.next();
        String last=in.next();
        System.out.println("Your first name is:" +first);
        System.out.println("Your middle name is:" +middle);
        System.out.println("Your last name is:" +last);
        System.out.println("monogram: "+first.substring(0,1).toUpperCase()+middle.substring(0,1).toUpperCase()+last.substring(0,1).toUpperCase());
        in.close();
        String answer = String.valueOf(Math.PI / 2.0);
        System.out.println(answer+2);
    }
}