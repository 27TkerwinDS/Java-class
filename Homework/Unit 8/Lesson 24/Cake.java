import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class Tally{
    int total;

    //initialise to 0
    public Tally(){
        total=0;
    }
    //initulise to a number
    public Tally(int i){
        total=i;
    }
    //add
    public void add(){
        total++;
    }
    //veiw total
    public int view(){
        return total;
    }
}


public class Cake {
    public static void main(String[] args) throws FileNotFoundException {
        Tally p=new Tally();
        Tally c=new Tally();
        Scanner in=new Scanner(System.in);
        boolean q=false;
        while (!q){
            System.out.print("'q' to quit 'p' for pie 'c' for cake: ");
            String temp=in.next();
            if(temp.toLowerCase().equals("q")){
                q=true;
            }else if(temp.toLowerCase().equals("c")){
                c.add();
            }else if(temp.toLowerCase().equals("p")){
                p.add();
            }else{
                System.err.println("Error, try again!");
            }
        }
        System.out.println("Total cake is: "+c.view());
        System.out.println("Total Pie is: "+p.view());
        File text=new File("totalVotes.txt");
        Scanner intxt=new Scanner(text);
        int pieTotal=intxt.nextInt();
        int cakeTotal=intxt.nextInt();
        pieTotal=pieTotal+p.view();
        cakeTotal=cakeTotal+c.view();
        System.out.println("Total over all cake is: "+cakeTotal);
        System.out.println("Total over all pie is: "+pieTotal);
        PrintWriter out=new PrintWriter(text);
        out.println(pieTotal);
        out.println(cakeTotal);
        out.close();
        in.close();
        intxt.close();


    }
}
