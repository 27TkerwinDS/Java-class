import java.util.Arrays;
public class Part1{

    public static void swap(int a, int b, int[]values){
        if ((values.length>a &&values.length>b)&&(a>=0&&b>=0)){
        int temp=values[a];
        values[a]=values[b];
        values[b]=temp;
        }
    }





    public static void main(String[] args) {
        int[] numbers={0,1,2,3,4,5,6,7,8,9};
        swap(0,9,numbers);
        System.out.println(Arrays.toString(numbers));
    }
}