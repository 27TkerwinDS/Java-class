import java.util.Scanner;
public class Dothedo{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double total=0.0;
        double number;
        do{
            number=in.nextDouble();
            if(number>0){
                total=total+number;
            }
            System.out.println(total);
        }
        while(number>0);
    }
}