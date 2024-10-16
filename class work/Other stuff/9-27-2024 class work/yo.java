import java.util.Scanner;
public class yo{
public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("hi \"");
        System.out.println("hi \\");
        System.out.println("hi \n");
        System.out.println("hi \r\n");
        char c ='p';
        System.out.println(c);
        System.out.println((int)c);
        String greating="hello world";
        String hellomod= greating.substring(0, 5);
        hellomod=hellomod.substring(0,4)+hellomod.substring(4).toUpperCase();
        System.out.println(hellomod);
        System.out.print("Name: ");
        String name=in.nextLine();
        name=name.substring(0, 1).toUpperCase()+name.substring(1).toLowerCase();
        System.out.println(name);
        in.close();
    }
}