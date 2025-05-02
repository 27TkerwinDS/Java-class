import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CliantHandler implements Runnable{
    Socket socket;
    static PrintWriter out;
    BufferedReader in;
    String name;

    public CliantHandler(Socket socket){
        this.socket=socket;

    }

    @Override
    public void run() {
        try{
            in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out=new PrintWriter(socket.getOutputStream(),true);
            System.err.println("Connected to "+socket.getInetAddress().getHostName());
            //get name
            String inputLine;
            out.println("Please enter name: ");
            name=in.readLine();
            System.out.println("Hello "+name);

        }catch(IOException e){
            System.err.println(e.getMessage());
        }finally{
            if (in!=null){
                try{
                    in.close();
                }catch(IOException e){
                    System.err.println(e.getMessage());
                }
            }
        }

    }
    public static void sendMessage(String message){
        if(out !=null){
            out.println(message);
        }
    }

}
