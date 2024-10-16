import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int testing=06;
        double testingtwo=.2;
        System.out.print("enter first account ID: ");
        int oneid = in.nextInt();
        System.out.print("enter first account balence: ");
        double oneac=in.nextDouble(); 
        System.out.print("enter second account ID: ");
        int twoid = in.nextInt();
        System.out.print("enter second account balence: ");
        double twoac=in.nextDouble(); 
        System.out.print("enter third account ID: ");
        int threeid = in.nextInt();
        System.out.print("enter third account balence: ");
        double threeac=in.nextDouble(); 
        double max=0;
        String mixint="";
        if (oneac >= twoac & oneac>=threeac){
            mixint=(oneac);


        }
        System.out.printf("Account #%0"+testing+"d has a ballence of $%,"+testingtwo+"f%n",oneid, oneac);
        System.out.printf("Account #%0"+testing+"d has a ballence of $%,"+testingtwo+"f%n",twoid, twoac);
        System.out.printf("Account #%0"+testing+"d has a ballence of $%,"+testingtwo+"f%n",threeid, threeac);
        in.close();
    }
}
