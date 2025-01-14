import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadBirth {
    public static void main(String[] args) {
        File txt=new File("birth.txt");
        Scanner in;
        try{
            in=new Scanner(txt);
        }catch(FileNotFoundException exception){
            return;
        }
        in.useDelimiter("[,\s\n\r]+");
        while(in.hasNext()){
            String name=in.next();
            String year=in.next();
            try{
                System.out.println(name+" was born in "+Integer.parseInt(year)+".");
            }catch(NumberFormatException ex){
                System.out.println("I do not know when "+name+" was born.");
            }
        }
    }
}
