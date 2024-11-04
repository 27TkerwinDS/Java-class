/*
 * Create a nested Create a nested for loop to produce the following output.
    ....1
    ...22
    ..333
    .4444
    55555

 */
public class Dot {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int rep=5-i;
            while(rep>0){
                System.out.print(".");
                rep--;
            }
            int rep2=i;
            while(rep2>0){
                System.out.print(i);
                rep2--;
            }
            System.out.println();
        }
    }
}
