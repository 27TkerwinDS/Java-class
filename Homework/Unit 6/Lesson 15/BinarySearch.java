import java.util.Random;
import java.util.Arrays;
public class BinarySearch {

    public static void main(String[] args) {
        Random ran=new Random();
        int[] numbers=new int[10000];
        for(int i=0; i<numbers.length;i++){
            numbers[i]=ran.nextInt(numbers.length)+1;
        }

        int targitVal=ran.nextInt(numbers.length)+1;
        long startTime=System.nanoTime();
        Boolean found=false;
        int o=0;
        while((o<numbers.length)&&(!found)){
            if(numbers[o]==targitVal){
                found=true;
            }else{
                o++;
            }
        }
        long endTime=System.nanoTime();
        
        System.out.println("Random number: "+targitVal);
        System.out.println("placement was "+o);
        System.out.println("time was "+(endTime-startTime));
        Arrays.sort(numbers);
        startTime=System.nanoTime();
        Arrays.binarySearch(numbers, targitVal);
        endTime=System.nanoTime();
        System.out.println("binary search time= "+(endTime-startTime));
        

    }
}
