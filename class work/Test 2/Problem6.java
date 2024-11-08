public class Problem6{
    public static void main(String[] args) {
        // Write a program that uses a loop that computes and displays the average of 
        //all the integers from 1 to 100
        int total=0;
        for(int i=1;i<=100;i++){
            total=total+i;
        }
        System.out.println((double)total/100);
    }
}