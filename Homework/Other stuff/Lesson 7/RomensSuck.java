import java.util.Scanner;
public class RomensSuck{
    enum M{M,MM,MMM};
    enum C{C,CC,CCC,CD,D,DC,DCC,DCCC,CM};
    enum X{X,XX,XXX,XL,L,LX,LXX,LXXX,XC};
    enum I{I,II,III,IV,V,VI,VII,VIII,IX};
    /*
     * M=1000
     * D=500
     * C=100
     * L=50
     * X=10
     * V=5
     * I=1
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number;
        System.out.print("Please enter a whole number 1-3999:");
        if (in.hasNextInt()) {
            number = in.nextInt();
            } else { 
            System.out.println("Error: please enter in an integer value!");
            number = 0;
            }
            
        int d1=number/1000;
        number=number%1000;
        M tempm;
        if(d1==1){
            tempm=M.M;
            System.out.print(tempm);
        }else if(d1==2){
            tempm=M.MM;
            System.out.print(tempm);
        }else if (d1==3){
            tempm=M.MMM;
            System.out.print(tempm);
        }
        int d2=number/100;
        number=number%100;
        C tempc;
        if(d2==9){
            tempc=C.CM;
            System.out.print(tempc);
        }else if(d2==8){
            tempc=C.DCCC;
            System.out.print(tempc);
        }else if(d2==7){
            tempc=C.DCC;
            System.out.print(tempc);
        }else if(d2==6){
            tempc=C.DC;
            System.out.print(tempc);
        }else if(d2==5){
            tempc=C.D;
            System.out.print(tempc);
        }else if(d2==4){
            tempc=C.CD;
            System.out.print(tempc);
        }else if(d2==3){
            tempc=C.CCC;
            System.out.print(tempc);
        }else if(d2==2){
            tempc=C.CC;
            System.out.print(tempc);
        }else if(d2==1){
            tempc=C.C;
            System.out.print(tempc);
        }
        int d3=number/10;
        number=number%10;
        X tempx;
        if(d3==9){
            tempx=X.XC;
            System.out.print(tempx);
        }else if(d3==8){
            tempx=X.LXXX;
            System.out.print(tempx);
        }else if(d3==7){
            tempx=X.LXX;
            System.out.print(tempx);
        }else if(d3==6){
            tempx=X.LX;
            System.out.print(tempx);
        }else if(d3==5){
            tempx=X.L;
            System.out.print(tempx);
        }else if(d3==4){
            tempx=X.XL;
            System.out.print(tempx);
        }else if(d3==3){
            tempx=X.XXX;
            System.out.print(tempx);
        }else if(d3==2){
            tempx=X.XX;
            System.out.print(tempx);
        }else if(d3==1){
            tempx=X.X;
            System.out.print(tempx);
        }
        int d4=number/1;
        I tempi;
        if(d4==9){
            tempi=I.IX;
            System.out.print(tempi);
        }else if(d4==8){
            tempi=I.VIII;
            System.out.print(tempi);
        }else if(d4==7){
            tempi=I.VII;
            System.out.print(tempi);
        }else if(d4==6){
            tempi=I.VI;
            System.out.print(tempi);
        }else if(d4==5){
            tempi=I.V;
            System.out.print(tempi);
        }else if(d4==4){
            tempi=I.IV;
            System.out.print(tempi);
        }else if(d4==3){
            tempi=I.III;
            System.out.print(tempi);
        }else if(d4==2){
            tempi=I.II;
            System.out.print(tempi);
        }else if(d4==1){
            tempi=I.I;
            System.out.print(tempi);
        }
        in.close();
    }
}