import java.util.Random;
public class Randomdice{
    public static void main(String[] args) {
        Random ran=new Random();
        double tot=0;
        for (int i = 1; i < 1001; i++) {
            tot=tot+ran.nextInt(10);
        }  
        System.out.println(tot/1000.0);
    }
}