import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TryAgain {
    public static void main(String[] args) {
        // record to file.
       String filepath = "data.bin";
       ArrayList<Employee> employees=new ArrayList<>();
       Employee em;
       Scanner in=new Scanner(System.in);

        boolean q=false;
        int o=1;
        int id=0;
        double salary=0;
        String fN="";
        String lN="";
        while(!q){
            
            System.out.println("Emploiee "+o);
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
            id++;
            em=new Employee(fN, lN, id, salary);
            employees.add(em);
            System.out.println("'q' to quit any key to continue");
            if(in.next().toLowerCase().equals("q")){
                q=true;
            }
            o++;
            for (int i=0; i<employees.size();i++){
                Employee e;
                e=employees.get(i);
                e.displayInfo();
            }
        }




       try (
               FileOutputStream fileOutputStream = new FileOutputStream(filepath);
               DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)) {
           // save the last ID used info.
           dataOutputStream.writeInt(Employee.lastIDUsed);
           for (Employee e : employees) {
               e.writeToStream(dataOutputStream);
           }

           // we're done. the streams should automatically be closed as we exit the try
           // with resources clause.
           System.out.println("Data saved to \"" + filepath + "\"");
       } catch (IOException e) {
           System.err.println("Error writing to output file.");
           System.err.println(e.getMessage());
       }

    }
}
