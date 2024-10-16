import java.util.Scanner;
public class Test{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Hello Mr Eng! please enter a name: ");
        String name=in.nextLine();
        System.out.println("Hello "+name+" have a good day!");
        System.out.print("Please enter first amount between .01 and 9,999.99: ");
        double one=in.nextDouble();
        System.out.print("Please enter second amount between .01 and 9,999.99: ");
        double two=in.nextDouble();
        double av=(double)(one+two)/2;
        System.out.printf("Acount 1: %,8.2f%nAcount 2: %,8.2f%nAverage:  %,8.2f%n", one, two, av);
        System.out.print("enter 1 if you liked this program, enter two if you didn't: ");
        int yay=in.nextInt();
        if (yay==1){
            System.out.println("YAY!");
        }else if (yay==2){
            System.out.println("Awww, you should still give me an 100%");
        }else{
            System.out.println("Geze, you cant listen to directions.");
        }
        in.close();
    }
}