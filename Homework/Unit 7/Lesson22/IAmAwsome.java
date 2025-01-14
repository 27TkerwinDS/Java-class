import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class IAmAwsome{
    public static void main(String[] args) {
        Scanner intxt=new Scanner(System.in);
        boolean q=false;
        System.out.print("Please enter your text file name: ");
        while (!q){
            String in=intxt.next();
            if (in.equals("#")){
                System.out.println("Goodbye!");
                intxt.close();
                return;
            }else{
                try{
                    try{
                        String temp=in.substring(in.length()-4, in.length());
                        if(!temp.equals(".txt")){
                            in=in+".txt";
                        }
                    }catch(StringIndexOutOfBoundsException exeption){
                        in=in+".txt";
                    }
                    File txt=new File(in);
                    Scanner txtin=new Scanner(txt);
                    while(txtin.hasNext()){
                        System.out.println(txtin.next());
                    }
                    txtin.close();
                    intxt.close();
                    return;

                }catch(FileNotFoundException ex){
                    System.out.print("File Not Found, please enter an existing file: ");
                }
            }
        }

        intxt.close();
    }

}