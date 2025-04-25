import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable{
    private Socket clientSocket;
    private String inputLine;
    PrintWriter out;
    public static void sendMessage(String message){
        if (out !=null){
            out.println(message);
        }
    }
    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }
    public String getData(){
        return inputLine;
    }
    @Override
    public void run() {
        // use try with catch statement to create output and input streams.
        
        try{
            
        }
    }
}
