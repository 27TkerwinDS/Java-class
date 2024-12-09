import java.util.Scanner;
public class Arrays{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] vals=new int [5];
        int maxval=Integer.MIN_VALUE;
        int maxinter=0;
        for (int i=0; i<5; i++){
            vals[i]=in.nextInt();
            if (vals[i]>maxval){
                maxval=vals[i];
                maxinter=i;
            }
        }
        for (int i=0; i<5; i++){
            System.out.print(vals[i]);
            if (i==maxinter){
                System.out.print(" >= max");
            }
            System.out.println();
        }
        in.close();
    }
    
}