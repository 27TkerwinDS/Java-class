import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ProcesingAccounts{
    public static void main(String[] args)throws FileNotFoundException {
        File inputFile = new File("acounts.txt");
        Scanner in = new Scanner(inputFile);
        in.useDelimiter("[,\s\n\r]+");
        int acoutnt;
        String name;
        double val;
        System.out.println("-----------------------------------------");
        System.out.println("Acount |     Name     |        Balence");
        System.out.println("-----------------------------------------");
        while(in.hasNext()){
            acoutnt=in.nextInt();
            name=in.next();
            val=in.nextDouble();
            System.out.printf("%06d | %12s | $ %,15.2f%n",acoutnt,name,val);
        }
        System.out.println("-----------------------------------------");
        in.close();
    }
}