import java.util.Scanner;
public class Duplicates {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int[] inputs=new int[20];
        boolean brek=false;
        int curentSize=0;
        for(int i=0; (i<20)&&(!brek);){
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
        for(int i=0; i<curentSize-1;i++){
            System.out.print(inputs[i]+",");
        }
        System.out.println(inputs[curentSize-1]);
        System.out.print("Please enter targit value: ");
        int tgt;
        if(in.hasNextInt()){
            tgt=in.nextInt();
        }else{
            System.err.println("ERROR");
            tgt=0;
        }
        int totaltgt=0;
        for(int i=0; i<curentSize;i++){
            if(inputs[i]==tgt){
                totaltgt++;
            }
        }
        System.out.println("The Value "+tgt+" occored "+totaltgt+" times in the data");

    

        






        in.close();
    }
}
