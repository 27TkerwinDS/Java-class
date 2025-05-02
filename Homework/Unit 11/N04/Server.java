import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    static ArrayList<ClientHandler> contacts;
    public static void main(String[] args) {
        // parse input arguments for port
        // if (args.length < 1) {
        //     // print an error message.
        //     System.err.println("Usage: java EchoServer <port number>");
 
        //     // exit with a value of 1, which indicates that an error occurred.
        //     System.exit(1);
        // }
 
        // try to parse the argument to get the port number.
        int portNumber = 8675;
        contacts=new ArrayList<>();
        try {
            portNumber = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Unable to parse the port number!");
            System.err.println("Usage: java EchoServer <port number>");
            System.exit(1);
        }
        try (ServerSocket serverSocket = new ServerSocket(portNumber);) {
            System.out.println("Multi echo server listening on port " + portNumber);
            while (true) {
               try {
                    Socket clientSocket = serverSocket.accept(); // Accept incoming client connection
                    System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());
                    // Create a new thread to handle the clients
                    ClientHandler clientHandler = new ClientHandler(clientSocket);
                    new Thread(clientHandler).start();
                    contacts.add(clientHandler);
               } catch (IOException e) {
                    System.err.println("Error accepting client connection: " + e.getMessage());
               }
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "+ portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
       System.out.println("Goodbye!");
 
    }
    public static void brodCastMessage(String message){
        for(ClientHandler handler : contacts){
            if(handler != null){
                handler.sendMessage(message);
            }
        }
    }
    static void removeCliant(ClientHandler tgt){
        int index=contacts.indexOf(tgt);
        if(index>0){
            contacts.remove(index);
        }
    }
}
