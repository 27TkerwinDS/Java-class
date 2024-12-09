import java.util.Scanner;
import java.util.Arrays;
public class Sort{
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int[] inputs=new int[10];
        boolean brek=false;
        int curentSize=0;
        for(int i=0; (i<10)&&(!brek);){
            System.out.print("Enter int or q to quit: ");
            if (in.hasNextInt()){
                inputs[i]=in.nextInt();
                i++;
                curentSize++;
            }else if ((in.next()).toLowerCase().equals("q")){
                brek=true;
                i++;
            }else{
                System.err.println("An Error has occored");
            }
        }
        System.out.print("*");
        for(int i=0; i<curentSize;i++){
            System.out.print(inputs[i]+"*");
        }
        Arrays.sort(inputs, 0, curentSize);
        System.out.println();
        int temp;
        int tempq= curentSize-1;
        for(int i=0; i<(int)curentSize/2;i++){
            temp=inputs[i];
            inputs[i]=inputs[tempq];
            inputs[tempq]=temp;


            tempq--;
        }
        for(int i=0; i<curentSize;i++){
            System.out.print(inputs[i]+" ");
        }
















        in.close();
    }
}