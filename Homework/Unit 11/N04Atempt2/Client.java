import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int portNumber=8675;
        String host="localhost";
        if(args.length<2){
            System.err.println("Using defalt values");
        }else{
            host=args[0];
            try{
                portNumber=Integer.parseInt(args[1]);
            }catch(NumberFormatException e){
                System.err.println("Unable to parse port number, using defalt.");
            }
        }
        System.out.println("Trying to connect to "+host+" on port "+portNumber);
        try(
            Socket socket=new Socket(host, portNumber);
            PrintWriter out=new PrintWriter(socket.getOutputStream());
            Scanner stdIn =new Scanner(System.in);
        ){
            System.out.println("Connected to "+socket.getInetAddress().getHostName()+" on port "+socket.getLocalPort());

        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        System.out.println("Goodbye");
    }
}
