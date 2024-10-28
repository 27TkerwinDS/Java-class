import java.util.Scanner;
public class E {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("please enter a phrase");
        String ine=in.nextLine();
        int length=ine.length();
        String temp;
        int tote=0;
        for(int i=1; i<=length;i++){
            temp=ine.substring(i-1, i);
            if(temp.equals("e")){
                tote=tote+1;
            }
        }
        System.out.println(tote);
        in.close();
    }
}
