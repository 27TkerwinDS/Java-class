import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class yoy{
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("yo.txt");
        Scanner in = new Scanner(inputFile);
        in.useDelimiter("[^A-Za-z0-100]+");
        while (in.hasNext()) {
            String score = in.next();
            System.out.println(score);
        }
        in.close();
    }

}