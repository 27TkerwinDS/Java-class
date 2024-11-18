//roll a die, look at a die
import java.util.Random;
import java.util.Scanner;
class Die{
    Random ran=new Random();
    int val=0;
    public void rollDie(){
        val=ran.nextInt(0, 6)+1;
    }
    public int view(){
        return val;
    }
    public Die(){
        val=1;
    }
    public Die(int newval){
        if ((newval<=1)&&(newval>=6)){
            val=newval;
        }else{
            val=1;
        }
        
    }
}


public class Dice {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Die dice=new Die();
        boolean bool=false;
        while(bool==false){
            System.out.print("'r' to roll 'd' to display 'q' to quit: ");
            String input=in.nextLine();
            if(input.equals("q")){
                bool=true;
            }else if(input.equals("r")){
                dice.rollDie();
            }else if(input.equals("d")){
                int v= dice.view();
                System.out.println("+-------+");
                if(v==1){
                    System.out.println("|       |");
                    System.out.println("|   O   |");
                    System.out.println("|       |");
                }else if(v==2){
                    System.out.println("| O     |");
                    System.out.println("|       |");
                    System.out.println("|     O |");
                }else if(v==3){
                    System.out.println("| O     |");
                    System.out.println("|   O   |");
                    System.out.println("|     O |");
                }else if(v==4){
                    System.out.println("| O   O |");
                    System.out.println("|       |");
                    System.out.println("| O   O |");
                }else if(v==5){
                    System.out.println("| O   O |");
                    System.out.println("|   O   |");
                    System.out.println("| O   O |");
                }else if(v==6){
                    System.out.println("| O   O |");
                    System.out.println("| O   O |");
                    System.out.println("| O   O |");
                }
                System.out.println("+-------+");
            }else{
                System.err.println("Invalid input.");
            }
        }  
        in.close();      
    }
}
