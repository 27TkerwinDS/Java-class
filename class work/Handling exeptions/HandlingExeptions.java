import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class HandlingExeptions{
    public static void main(String[] args){
        Scanner inKeyboard = new Scanner(System.in);
        boolean fileOpened = false;
        String name = "missing.txt";
        while (fileOpened == false) {
            try {
                File inputFile = new File(name);
                Scanner in = new Scanner(inputFile);
                while (in.hasNext()) {
                    String word = in.next();
                    System.out.println(word);
                }
                in.close();
                fileOpened = true;
            } catch (FileNotFoundException exception) {
                System.out.println("Error: unable to find the file named \"" + name + "\".");
                System.out.print("Enter the correct name of the file to open: ");
                name = inKeyboard.nextLine();
                /*if (name.length()<5){
                    name=name+".txt";
                }else{                
                    String temp=name.substring(name.length()-4, name.length());
                    if (!temp.equals(".txt")){
                        name=name+".txt";
                    }    
                }*/
                try{
                    String temp=name.substring(name.length()-4, name.length());
                    if (!temp.equals(".txt")){
                        name=name+".txt";
                    } 
                }catch (StringIndexOutOfBoundsException oobExeption){
                    name=name+".txt";
                }

            }
        }
        inKeyboard.close();
    }
}


