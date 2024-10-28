import java.util.Scanner;
public class Grades{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean bool =false;
        int i=1;
        double grade=0;
        while (bool==false){
            System.out.print("please enter student "+ i +"'s grade negitive number will quit ");
            double input=in.nextDouble();
            if (input<0){
                bool=true;
                i=i-1;
            }else{
                grade=grade+input;
                i=i+1;
            }
        }
        System.out.println("There was a total of "+i+" students.");
        System.out.println("The class averige was: "+grade/i);
    }
}