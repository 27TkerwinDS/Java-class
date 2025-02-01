import java.util.Scanner;

public class MowFinal {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException {
        Scanner in =new Scanner(System.in);
        System.out.print("Please enter x: ");
        int x;
        if (in.hasNextInt()){
            x=in.nextInt();
        }else{
            System.err.println("Intiger values only!");
            return;
        }
        System.out.print("Please enter y: ");
        int y;
        if (in.hasNextInt()){
            y=in.nextInt();
        }else{
            System.err.println("Intiger values only!");
            return;
        }
        System.out.print("1 for horizantal cut 2 for spirel.: ");
        int cutType;
        if (in.hasNextInt()){
            cutType=in.nextInt();
            if (cutType==1||cutType==2){
                //do nothing
            }else{
                System.err.println("1 or 2 only!");
                return;
            }
        }else{
            System.err.println("1 or 2 only!");
            return;
        }
        Mowpattern mow=new Mowpattern(x, y);
        if(cutType==1){
            mow.horisantalCut();
        } else{
            mow.spirelCut();
        }
        in.close();
    }
}
