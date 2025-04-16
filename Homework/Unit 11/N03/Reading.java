import java.io.DataInputStream;
import java.io.DataOutputStream;
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
            File txt=new File("data.txt");
            in=new FileInputStream(txt);
            dataI=new DataInputStream(in);
        }catch(FileNotFoundException e) {
            System.err.println("FileNotFound!");
            return;
        }
        ArrayList<Employee> workForce=new ArrayList<Employee>();
        while(dataI.available()>0){
            String fN=dataI.readUTF();
            String lN=dataI.readUTF();
            int iD=dataI.readInt();
            double salary=dataI.readDouble();
            //Employee e =new Employee(fN,lN,iD,salary);
            //workForce.add(e);
        }

        dataI.close();

    }
}
