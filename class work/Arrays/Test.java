import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double[] testlist=new double[100];
        boolean q=false;
        double inputD;
        int i=0;
        while ((q==false) && (i<100)){
            System.out.print("Enter a test grade or hit q to quit: ");
            if (in.hasNext("q")){
                q=true;
                
            } else if(in.hasNextDouble()){
                inputD=in.nextDouble();
                testlist[i]=inputD;

            }

            i++;
        }
        System.out.println(i);
        for(int o=0;o<=i-2;o++){
            System.out.printf("%3d %.2f%n",o+1,testlist[o]);
        }
        in.close();
    }
}
