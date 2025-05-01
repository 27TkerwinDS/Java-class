import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoCliant implements Runnable{
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println(
                    "Usage: java EchoClient <host name> <port number>");
            System.exit(1);
        }
        //hi this is a test!
 
        String hostName = args[0];
        int portNumber = 0;
        try {
            portNumber = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.err.println("Unable to parse the port number!");
            System.err.println("Usage: java EchoClient <host name> <port number>");
            System.exit(1);
        }
        try (
               Socket echoSocket = new Socket(hostName, portNumber);
               PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
               BufferedReader stdIn = new BufferedReader(
                       new InputStreamReader(System.in))) {
            //create message handler
            MessageHandler handler=new MessageHandler(echoSocket);
            Thread thread=new Thread(handler);
            thread.start();
           String userInput;
           while ((userInput = stdIn.readLine()) != null) {
               out.println(userInput);
           }
       } catch (UnknownHostException e) {
           System.err.println("Don't know about host " + hostName);
           System.exit(1);
       } catch (IOException e) {
           System.err.println("Couldn't get I/O for the connection to " +
                   hostName);
           System.exit(1);
       }

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
}
