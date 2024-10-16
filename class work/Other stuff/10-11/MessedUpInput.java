import java.util.Scanner;
public class MessedUpInput{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int numpies=0;
        if(in.hasNextInt()){
            numpies=in.nextInt();
            System.out.println(numpies);
        }else{
            System.err.println("Please enter a whole number");
        }
        in.close();
    }
}