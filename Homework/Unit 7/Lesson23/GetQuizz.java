import java.util.Scanner;

public class GetQuizz{
    public static void main(String[] args) {
        boolean q=false;
        Scanner in=new Scanner(System.in);
        while (!q){
            System.out.print("Please enter a test score: ");
            if (in.hasNextInt()){
                try{
                    System.out.println(testCheack(in.nextInt()));
                }catch(ArithmeticException e){
                    System.err.println("an error occurred!");
                    System.out.println(e.getMessage());
                }
            }else if(in.next().toLowerCase().equals("q")){
                q=true;
            }else{
                System.err.println("Error!");
            }
        }
        in.close();
    }
    public static int testCheack(int i){
        if((i<0)||(i>100)){
            throw new ArithmeticException("Not a logical Number");
        }else{
            return i;
        }
    }
}