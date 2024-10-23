import java.util.Scanner;
public class While{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i=1;
        int o=1;
        while(i<101){
            System.out.printf("%3d %5d%n",i,o);
            i=i+1;
            o=i*i;
        }
        double total=0.0;
        int w=2;
       /*while(true){
            System.out.print("Enter a number or q to quit:");
            if (in.hasNext("q")|| in.hasNext("Q")){
                in.next();
                break;
            }else if(in.hasNextDouble()){
                
            }
        }
    */
        in.close();
    }
}