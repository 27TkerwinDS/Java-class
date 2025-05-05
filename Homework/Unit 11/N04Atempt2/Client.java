import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

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
            PrintWriter out=new PrintWriter(socket.getOutputStream(), true);
            BufferedReader stdIn =new BufferedReader(new InputStreamReader(System.in))
        ){
            System.out.println("Connected to "+socket.getInetAddress().getHostName()+" on port "+socket.getLocalPort());
            MessageHandler mHandler=new MessageHandler(socket);
            Thread thread=new Thread(mHandler);
            thread.start();
            //get user input and brodcast it.
            String inputLine;
            while((inputLine=stdIn.readLine())!=null){
                out.println(inputLine);
            }
            System.out.println("Goodbye from cliant");

        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        System.out.println("Goodbye");
    }
}
