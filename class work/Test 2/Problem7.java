import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("please enter a intiger:");
        int num1=in.nextInt();
        System.out.print("please enter a intiger:");
        int num2=in.nextInt();
        System.out.print("please enter a intiger:");
        int num3=in.nextInt();
        if(num1>num2&&num1>num3){
            System.out.print(num1+" ");
        }else if(num2>num1&&num2>num3){
            System.out.print(num2+" ");
        }else if(num3>num2&&num3>num1){
            System.out.print(num3+" ");
        }
        
        if((num1<num2&&num1>num3)||(num1>num2&&num1<num3)){
            System.out.print(num1+" ");
        }else if((num3<num2&&num3>num1)||(num3>num2&&num3<num1)){
            System.out.print(num3+" ");
        }else if((num2<num1&&num2>num3)||(num2>num1&&num2<num3)){
            System.out.print(num2+" ");
        }
        if(num1<num2&&num1<num3){
            System.out.print(num1+" ");
        }else if(num2<num3&&num2<num1){
            System.out.print(num2+" ");
        }else if(num3<num2&&num3<num1){
            System.out.print(num3+" ");
        }
        in.close();
    }
}
