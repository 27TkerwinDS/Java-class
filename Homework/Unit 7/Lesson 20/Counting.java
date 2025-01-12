import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counting{
    public static void main(String[] args) throws FileNotFoundException {
        File text=new File("poem.txt");
        Scanner in=new Scanner(text);
        //in.useDelimiter("");
        int carictures=0;
        int letters=0;
        int digits=0;
        String yo=in.nextLine();
        System.out.println(yo);
        yo=in.nextLine();
        System.out.println(yo);
        in=new Scanner(text);
        while (in.hasNextLine()){
            yo=in.nextLine();
            carictures=carictures + yo.length();
            for(int i=0;i<yo.length();i++){
                Character place=yo.charAt(i);
                if (Character.isDigit(place)){
                    digits++;
                }else if(Character.isLetter(place)){
                    letters++;
                }
            }

        }
        System.out.println(letters+" Letters");
        System.out.println(digits+" Digits");
        System.out.println(carictures+" Total Carictures");
    }
}