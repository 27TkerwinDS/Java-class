import java.util.Random;
public class Cards{
    
    //enum Suit(,);

    //public void

    public static String drawran() {
        Random ran=new Random();
        String val="1";
        String suitString="H";
        String numString;
        int suit= ran.nextInt(3)+1;
        int hight=ran.nextInt(12)+1;
        if(suit==1){
            suitString="H";
        }else if (suit==2){
            suitString="D";
        }else if(suit==3){
            suitString="S";
        }else if(suit==4){
            suitString="C";
        }
        if(hight==1){
            numString="A";
        }else if(hight==11){
            numString="J";
        }else if(hight==12){
            numString="Q";
        }else if(hight==13){
            numString="K";
        }else{
            numString=String.valueOf(hight);
        }
        val=numString+suitString;
        return(val);
    }
    public static String draw(int hight, String suitString) {
        String val="1";
        String numString;
        if(hight==1){
            numString="A";
        }else if(hight==11){
            numString="J";
        }else if(hight==12){
            numString="Q";
        }else if(hight==13){
            numString="K";
        }else{
            numString=String.valueOf(hight);
        }
        val=numString+suitString;
        return(val);
    }



    public static void main(String[] args) {
        System.out.println("The following cars should be the queen of hearts:");
        System.out.println(Cards.draw(12,"H"));
        System.out.println("Now here is 100 random cards:");
        for(int i=1; i<101; i++){
            System.out.printf("%3d| ", i);
            System.out.println(Cards.drawran());
        }
    }
}