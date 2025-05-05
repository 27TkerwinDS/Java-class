import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server{
    static ArrayList<CliantHandler>cliants;
    public static void main(String[] args) {
        int port=8675;
        cliants=new ArrayList<>();

        //try to listen to port

        try(ServerSocket serverSocket=new ServerSocket(port);){
            System.out.println("Server listining on port "+port);
            while(true){
                //listen to conection requests
                Socket socket=serverSocket.accept();
                //create client handler
                CliantHandler handler=new CliantHandler(socket);
                Thread thread=new Thread(handler);
                thread.start();
                cliants.add(handler);
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }

        

    }
    public static void brodcast(String message){
        for (CliantHandler handler:cliants){
            handler.sendMessage(message);
        }
    }
    public static void removeClient(CliantHandler handler){
        int index=cliants.indexOf(handler);
        if (index>0){
            cliants.remove(index);
        }
    }
}