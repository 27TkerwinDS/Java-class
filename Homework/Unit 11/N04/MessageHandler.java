import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MessageHandler implements Runnable{
    private Socket socket;
    private BufferedReader in;
    public MessageHandler(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'run'");
        //try to get imput reader screen
        try{
            in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String input;
            while((input=in.readLine())!=null){
                System.out.println(input);
            }
        }catch(IOException exception){
            System.err.println(exception.getMessage());
        }finally{
            if(in!=null){
                try{
                    in.close();
                }catch(IOException e){
                    System.err.println(e.getMessage());
                }
            }
        }
    }
    
}
