import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ProcesingAccounts{
    public static void main(String[] args)throws FileNotFoundException {
        File inputFile = new File("acounts.txt");
        Scanner in = new Scanner(inputFile);
        in.useDelimiter("[, \n]+");
        while(in.hasNext()){
            System.out.println(in.next());
        }
    }
}