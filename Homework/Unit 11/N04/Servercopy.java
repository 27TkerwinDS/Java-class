import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servercopy {
    public static void main(String[] args) {
        // parse input arguments for port
        if (args.length < 1) {
            // print an error message.
            System.err.println("Usage: java EchoServer <port number>");
 
            // exit with a value of 1, which indicates that an error occurred.
            System.exit(1);
        }
 
        // try to parse the argument to get the port number.
        int portNumber = 8675;
        try {
            portNumber = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Unable to parse the port number!");
            System.err.println("Usage: java EchoServer <port number>");
            System.exit(1);
        }
        ArrayList<ClientHandler> cliants=new ArrayList<>();
        try (ServerSocket serverSocket = new ServerSocket(portNumber);) {
            System.out.println("Multi echo server listening on port " + portNumber);
            while (true) {
               try {
                    Socket clientSocket = serverSocket.accept(); // Accept incoming client connection
                    System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());
                    // Create a new thread to handle the client
                    ClientHandler clientHandler = new ClientHandler(clientSocket);
                    new Thread(clientHandler).start();
                    cliants.add(clientHandler);
               } catch (IOException e) {
                    System.err.println("Error accepting client connection: " + e.getMessage());
               }
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "+ portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
}
class ClientHandler implements Runnable {
    private Socket clientSocket;
    private String inputLine;
    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }
    public String getData(){
        return inputLine;
    }
    @Override
    public void run() {
        // use try with catch statement to create output and input streams.
        try (PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) {
            System.out.println("Connected to client " + clientSocket.getInetAddress().getHostAddress()
                    + " on port " + clientSocket.getPort());
            while ((inputLine = in.readLine()) != null) {
                // display info about what was received.
                System.out.printf("Received from client (%s): %s%n",
                        clientSocket.getInetAddress().getHostAddress(), inputLine);
                // echo line back to client.
                out.println(inputLine);
            }
            System.out.println("Client disconnected: " + clientSocket.getInetAddress());
        } catch (IOException e) {
            System.err.println("Error handling client: " + e.getMessage());
        }
    }
}

