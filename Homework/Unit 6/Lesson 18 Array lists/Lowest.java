import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Lowest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList <Double>temps=new ArrayList<>();
        boolean quit=false;
        while(!quit){
            System.out.print("Please enter a tempiture or 'q' to quit: ");
            if(in.hasNext("Q")||in.hasNext("q")){
                in.next();
                quit=true;
            }else if (in.hasNextDouble()){
                temps.add(in.nextDouble());
            }else{
                System.err.println("Error!");
                in.next();
            }
        }
        Collections.sort(temps);
        double a1 = temps.get(0);
        double b1 = 0.000001;
        double lowest = a1-b1;
        for(int i=0; i<temps.size();i++){
            double a = temps.get(i);
            double b = 0.000001;
            double c = a-b;
            if(lowest==c){
                System.out.printf("%d | %6.2f<=Lowest%n",i+1,temps.get(i));
            }else{
                System.out.printf("%d | %6.2f%n",i+1,temps.get(i));
            }

        }






        in.close();
    }
}
