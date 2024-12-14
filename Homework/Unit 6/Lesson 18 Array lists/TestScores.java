import java.util.Scanner;
import java.util.ArrayList;
public class TestScores {
    public static void main(String[] args) {
        ArrayList <Double>testScores=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        boolean quit=false;
        int i=1;
        double tot=0;
        while(!quit){
            System.out.print("Please enter test score "+i+": ");
            if(in.hasNext("q")||in.hasNext("Q")){
                in.next();
                quit=true;
            }else if(in.hasNextDouble()){
                testScores.add(in.nextDouble());
                tot=tot+testScores.get(i-1);
            }else{
                System.err.println();
                System.err.println("Error, Please enter a number or 'q' to quit.");
            }
            


            i++;
        }
        System.out.println();
        System.out.println();
        for(int o=0; o<testScores.size(); o++){
            System.out.printf("Test %d: %6.2f%n",o+1,testScores.get(o));
        }
        System.out.println("Average: "+(double)tot/testScores.size());
        in.close();
    }
}
