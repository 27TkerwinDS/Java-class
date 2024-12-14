import java.util.ArrayList;
import java.util.Scanner;
public class Names{
    public static void main(String[] args) {
        ArrayList <String>names=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        boolean quit=false;

        while(!quit){
            System.out.print("Please enter a name: ");
            if (in.hasNext("#")){
                in.next();
                quit=true;
            }else if(in.hasNext()){
                names.add(in.next());
            }else{
                System.err.println("An Error has ocorred.");
            }
        }
        for(int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }

        in.close();
        
    }
}