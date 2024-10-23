import java.util.Random;
public class CompleatlyRandom {
    public static void main(String[] args) {
        Random ran=new Random();
        for (int i = 1; i < 101; i++) {
            System.out.println(ran.nextInt(100));
        }   
            
    }
}