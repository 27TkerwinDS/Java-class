import java.util.Scanner;
public class Balence{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Interest rate: ");
        double ir=in.nextDouble();
        System.out.print("Initial balence: ");
        double ib=in.nextDouble();
        System.out.printf("Year |         Int Earned: ($)      |          Balence ($)%n");
        System.out.println("-------------------------------------------------------------------");
        int i=1;
        double bi;
        for(;i<6;i++){
            bi=(ir/100.0)*ib;
            ib=ib+bi;
            System.out.printf("  %d  |%,30.2f|%,30.2f%n",i,bi,ib);
        }
        in.close();
    }
}