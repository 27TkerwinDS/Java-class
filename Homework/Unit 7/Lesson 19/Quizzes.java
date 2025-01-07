import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Quizzes {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("quizscores.txt");
        Scanner in = new Scanner(inputFile);

        File outputFile = new File("formatedquizz.txt");
        PrintWriter out = new PrintWriter(outputFile);
        int i=0;
        double tot=0.0;
        while (in.hasNext()) {

            double score = in.nextDouble();
            tot=tot+score;
            out.printf("Quiz %03d: %6.2f%n", i, score);
            i++;
        }
        out.println("----------------");
        tot=(double)tot/i;
        out.printf("Average: %6.2f%n",tot);
        in.close();
        out.close();
    }
}