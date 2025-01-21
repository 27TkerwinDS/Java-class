import java.util.ArrayList;
import java.util.Scanner;
public class Part2 {
    public static void main(String[] args) {
        ArrayList <Double> scores=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        boolean q=false;
        while(!q){
            System.out.print("Enter a quiz score or 'q' to quit: ");
            if (in.hasNextDouble()){
                scores.add(in.nextDouble());
            }else{
                if(in.next().toLowerCase().equals("q")){
                    q=true;
                }else{
                    System.err.println("Error! try again!");
                }
            }
        }
        System.out.println();
        System.out.println("-----------------");
        double total=0;
        for(int i=0; i<scores.size();i++){
            total=total+scores.get(i);
            System.out.printf(" %6.2f%n",scores.get(i));
        }
        System.out.println("-----------------");
        System.out.println("avg = "+(double)total/scores.size());
        in.close();
    }
    
}
