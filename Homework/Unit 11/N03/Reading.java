import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args) throws IOException {
        FileInputStream in;
        DataInputStream dataI;
        try{
            File txt=new File("data.bin");
            in=new FileInputStream(txt);
            dataI=new DataInputStream(in);
        }catch(FileNotFoundException e) {
            System.err.println("FileNotFound!");
            return;
        }
        ArrayList<Employee> workForce=new ArrayList<Employee>();
        int lastIDUsed=dataI.readInt();
        Employee.lastIDUsed=lastIDUsed;
        while (true) {
            try {
                int iD=dataI.readInt();
                String fN=dataI.readUTF();
                String lN=dataI.readUTF();       
                double salary=dataI.readDouble();
                Employee e =new Employee(fN,lN,iD,salary);
                workForce.add(e);
            } catch (EOFException e) {
                System.out.println("End of file reached. all done.");
                break;
            }
        }
        for(int i=0;i<workForce.size();i++){
            Employee e=workForce.get(i);
            e.displayInfo();
        }
        dataI.close();

    }
}
