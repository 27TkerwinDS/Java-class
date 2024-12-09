import java.util.Scanner;

public class Average {
    public static double average(double[] array, int length){
        double tot=0;
        for(int i=0; i<length; i++){
            tot=tot+array[i];
        }
        double av=(double)tot/length;
        return av;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double[] numbers=new double[100];
        boolean quit=false;
        int relivent=0;
        for(int i=0; (i<numbers.length)&&(!quit);){
            if (in.hasNextDouble()){
                System.out.print("enter the next number or 'q' to quit: ");
                numbers[i]=in.nextDouble();
                i++;
                relivent++;
            } else if(in.next().toLowerCase().equals("q")){
                quit=true;
            }else{
                System.err.println("An Error has Occored.");
            }
        }
        for(int i=0; i<relivent; i++){
            System.out.print(numbers[i]+",");
        }
        System.out.println();
        System.out.println("the average is: "+average(numbers, relivent));
        
    }
}
