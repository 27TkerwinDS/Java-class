import java.util.ArrayList;
import java.util.Scanner;
public class EvenOnly {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList <Integer>intis=new ArrayList<>();
        boolean quit=false;
        while(!quit){
            System.out.print("Please enter a Intiger or 'q' to quit: ");
            if(in.hasNext("Q")||in.hasNext("q")){
                in.next();
                quit=true;
            }else if (in.hasNextInt()){
                intis.add(in.nextInt());
            }else{
                System.err.println("Error!");
                in.next();
            }
        }
        System.out.println(intis);
        for(int i=0;i<intis.size();i++){
            if (intis.get(i)%2==1){
                intis.remove(i);
                i--;
            }
        }
        System.out.println(intis);
        for(int i=0;i<intis.size();i++){
            System.out.println(i+1+" | "+intis.get(i));
        }





        in.close();
    }
}
