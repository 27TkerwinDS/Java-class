import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Orginise{
    public static void main(String[] args) throws FileNotFoundException{
        File inputFile=new File("unemployedData.txt");
        Scanner in=new Scanner(inputFile);
        in.useDelimiter("[\n\r,]+");
        System.out.println("--------------------------------------------------------------");
        System.out.println("                  Top 5 Unemployment Rates");
        System.out.println("--------------------------------------------------------------");
        while(in.hasNextLine()){
            String name=in.next();
            name=name.trim();


            String tempD=in.next();
            tempD=tempD.trim();
            double percentige=Double.parseDouble(tempD);


            String tempI=in.next();
            tempI=tempI.trim();
            int rank=Integer.valueOf(tempI);


            String region=in.next();
            region=region.trim();


            System.out.printf("Ranked #%3d: %16s| %5.2f%% | %22s%n",rank,name,percentige,region);
        }
        System.out.println("--------------------------------------------------------------");
        in.close();
    }
}