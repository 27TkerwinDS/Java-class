import java.util.Scanner;
public class Conversation
// for one, forgot to import scanner
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("What is your first name? ");
      String input = in.next();
      System.out.println("Hello, " + input);
      System.out.print("How old are you? ");
      int input2 = in.nextInt();
      //also input is taken as a string so made a new veriable for intigers
      input2++;
      System.out.println("Next year, you will be " + input2);
      in.close();
      //also forgot to close input line
   }
}
