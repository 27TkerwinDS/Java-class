import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MessageHandler implements Runnable{
    private Socket socket;
    private BufferedReader in;
    @Override
    public void run() {
        try{
            in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String inputLine;
            while((inputLine=in.readLine())!=null){
                System.out.println(inputLine);
            }
            System.out.println("Bye from Message handler");
        }catch(IOException e){
            System.err.println(e.getMessage());
        }finally{
            if (in !=null){
                try{
                    in.close();
                }catch(IOException e){
                    System.err.println(e.getMessage());
                }
            }
        }
    }
    public MessageHandler(Socket socket){
        this.socket=socket;
    }
}
