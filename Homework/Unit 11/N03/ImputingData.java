import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class ImputingData{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        FileOutputStream out;
        DataOutputStream dataO;
        try{
            File txt=new File("data.txt");
            out=new FileOutputStream(txt);
            dataO=new DataOutputStream(out);
        }catch(FileNotFoundException e) {
            System.err.println("FileNotFound!");
            return;
        }
        boolean q=false;
        ArrayList <Employee>workforce=new ArrayList<Employee>();
        int iD=0;
        System.out.print("Starting ID: ");
        if (in.hasNextInt()) {
            iD = in.nextInt();
        } else {
            System.out.println("The input is not an integer");
        }
        int o=1;
        while(!q){
            System.out.println("Emploiee "+o+":");
            String fN="";
            String lN="";
            double salary=0;
            System.out.print("First name: ");
            fN=in.next();
            System.out.print("Last name: ");
            lN=in.next();
            System.out.print("Sallery: ");
            if (in.hasNextDouble()) {
                salary = in.nextDouble();
            } else {
                System.out.println("The input is not an Double");
            }
            iD++;
            Employee e= new Employee(fN,lN,iD,salary);
            workforce.add(e);
            o++;
            System.out.println("Press 'q' to quit, oterwise press any key.");
            if(in.next().toLowerCase().equals("q")){
                q=true;
            }
        }
        for(int i=0; i<workforce.size();i++){
            //out.printf("%06d,%s,%s,%.2f%n",workforce.get(i).getID(),workforce.get(i).getLastName(),workforce.get(i).getFirstName(),workforce.get(i).getSalary());
            try {
                dataO.writeBytes(workforce.get(i).getFirstName());
                dataO.writeBytes(workforce.get(i).getLastName());
                dataO.writeInt(workforce.get(i).getID());
                dataO.writeDouble(workforce.get(i).getSalary());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        try {
            dataO.close();
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}