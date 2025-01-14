import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) throws FileNotFoundException{
        File data=new File("sales.txt");
        Scanner in=new Scanner(data);
        in.useDelimiter("[,\n\r\s]+");
        while (in.hasNextLine()){
            String service=in.next();
            service=service.trim();
            String custimer=in.next();
            custimer=custimer.trim();
            String money;
            if(in.hasNextDouble()){
                Double temp=in.nextDouble();
                money=String.valueOf(temp);
            }else{
                in.next();

                money="n/a";
            }
            System.out.printf("%10s | %10s | %10s%n",service,custimer,money);
        }
        in.close();
    }
}
