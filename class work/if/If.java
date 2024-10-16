import java.util.Scanner;
public class If {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter age: ");
        int age= in.nextInt();
        if (age >= 50){
            System.out.println("you are old");
        }else{
            System.out.println("You are young");
            age--;
            System.out.println(age);
        }
        in.close();
    }
}
    