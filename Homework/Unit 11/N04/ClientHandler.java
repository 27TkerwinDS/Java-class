import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable{
    private Socket clientSocket;
    private String inputLine;
    static PrintWriter out;
    public static void sendMessage(String message){
        if (out !=null){
            out.println(message);
        }
    }
    //hello
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
            out=new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println("Connected to client " + clientSocket.getInetAddress().getHostAddress()+ " on port " + clientSocket.getPort());
            while ((inputLine = in.readLine()) != null) {
                // display info about what was received.
                System.out.printf("Received from client (%s): %s%n",
                        clientSocket.getInetAddress().getHostAddress(), inputLine);
                // echo line back to client.
                out.println(inputLine);
            }
            System.out.println("Client disconnected: " + clientSocket.getInetAddress());
        }catch (IOException e) {
            System.err.println("Error handling client: " + e.getMessage());
        }
    }
}
