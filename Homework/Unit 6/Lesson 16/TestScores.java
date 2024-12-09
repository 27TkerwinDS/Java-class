import java.util.Scanner;
import java.util.Arrays;
public class TestScores{

    public static void removeLow(double[] array, int length){
        double[] copyArray=Arrays.copyOf(array, length);
        Arrays.sort(copyArray);
        double lowest=copyArray[0];
        Boolean found=false;
        int o=0;
        while((o<length-1)&&(!found)){
            if(array[o]==lowest){
                found=true;
            }else{
                o++;
            }
        }
        lowest=o;
        for(int i=o;i<length-1;i++){
            array[i]=array[i+1];
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double[] TestScores=new double[100];
        boolean quit=false;
        int relivent=0;
        for(int i=0; (i<TestScores.length)&&(!quit);){
            if (in.hasNextDouble()){
                System.out.print("enter the next number score or 'q' to quit: ");
                TestScores[i]=in.nextDouble();
                i++;
                relivent++;
            } else if(in.next().toLowerCase().equals("q")){
                quit=true;
            }else{
                System.err.println("An Error has Occored.");
            }
        }
        for(int i=0; i<relivent; i++){
            System.out.print(TestScores[i]+",");
        }
        System.out.println();
        System.out.println("press 'y' to drop the lowest grade else press any other letter: ");
        if(in.next().toLowerCase().equals("y")){
            removeLow(TestScores, relivent);
            relivent--;
            for(int i=0; i<relivent; i++){
                System.out.print(TestScores[i]+",");
            }
        }
        
        in.close();
    }
}