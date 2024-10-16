import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter the amount of monney you need in change (ex: 1.10):");
        double initialp = in.nextDouble();
        initialp=initialp*100;    // convert to cents
        System.out.println("");
        number = (int)initialp;
        int dollers = number / 100; //finds the dollers
        number = number % 100;//finds the remnder and sets int number as the remander
        int q = (int) number/25;//finds the quarters
        number = number%25;//finds the remnder and sets int number as the remander
        int d = (int) number/10;//finds the dimes
        number=number%10;//finds the remnder and sets int number as the remander
        int n = (int) number/5;//finds the nickles
        number=number%5;//finds the remnder and sets int number as the remander
        int p = (int) number/1;//finds the penneys
        System.out.println("you will get:");
        if ((int)dollers>0){
            System.out.println(dollers+ "$");
        }
        if ((int)q>1){//if the quarters are greater than one it says quarters plural
            System.out.println(q+ " quarters");
        }else if ((int)q==1){ //if there is only one quarter it prints quarter singular
            System.out.println(q+ " quarter");
        } //if the value is 0 it doesn't print
        if ((int)d>1){
            System.out.println(d+ " dimes");//lines 25-29 reapeat but for the different values
        }if ((int)d==1){
            System.out.println(d+ " dime");
        }
        if ((int)n>1){
            System.out.println(n+ " nickles");
        }if ((int)n==1){
            System.out.println(n+ " nickle");
        }
        if ((int)p>1){
            System.out.println(p+ " pennys");
        }else if ((int)p==1){
            System.out.println(p+ " penny");
        }
        System.out.println("");
        System.out.println("This is how you should react to this:");
        
        if ((int) p==2) {//funney things that i made when i descovered if statments
            System.out.println("\"I AM AMAZING!!!!\"");
        }else if ((int)p==3) {
            System.out.println("\"yoooo\"");
        }else if ((int)p==4){
            System.out.println("\"this rocks!\"");
        }else if ((int)p==1){
            System.out.println("\"Im going to give Thomas a 100% in this class!\"");
        }else{
            System.out.println("\"Boo hoo, i have no pennys. :(\"");
        }
    }
}
