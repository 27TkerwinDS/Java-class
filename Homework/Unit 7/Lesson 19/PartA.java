import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class PartA {
    public static void main(String[] args)throws FileNotFoundException {
        File inputFile = new File("temps.txt");
        Scanner in = new Scanner(inputFile);
        ArrayList <Integer> t=new ArrayList<>();
        while(in.hasNext()){
            t.add(in.nextInt());
        }
        int lowest=Integer.MAX_VALUE;
        for(int i=0; i<t.size();i++){
            if (t.get(i)<lowest){
                lowest=t.get(i);
            }
        }
        for(int i=0; i<t.size();i++){
            System.out.print(t.get(i));
            if (t.get(i)==lowest){
                System.out.println(" <=lowest");
            }else{
                System.out.println();
            }
        }
        in.close();
    }
}