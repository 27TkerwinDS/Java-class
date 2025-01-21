import java.util.ArrayList;

public class BlackJackTwo {
    public class Card{
        String seeval;
        boolean show;
        int value;
        String suit;
        public Card(){
            boolean show=true;
            int value=(int)((Math.random()*12)+1);
            int temp=(int)((Math.random()*4)+1);
            String suit;
            if (temp==1){
                suit="H";
            }else if(temp==2){
                suit="S";
            } else if(temp==3){
                suit="D";
            }else{
                suit="C";
            }
        }
        public Card(boolean see){
            show=see;
            value=(int)((Math.random()*12)+1);
            int temp=(int)((Math.random()*4)+1);
            if (temp==1){
                suit="H";
            }else if(temp==2){
                suit="S";
            } else if(temp==3){
                suit="D";
            }else{
                suit="C";
            }
            
            if(value==1){
                seeval="A";
                value=11;
            }else if (value>11){
                seeval=String.valueOf(value);
            }else if (value==11){
                seeval="J";
                value=10;
            }else if (value==12){
                seeval="Q";
                value=10;
            }else if (value==13){
                seeval="K";
                value=10;
            }
        }
        public String showCard(){
            if(show){
                String temp=seeval+suit;
                return temp;
            }else{
                return "[]";
            }
        }
        public void reveal(){
            show=true;
        }
    }
    public static void main(String[] args) {
        Card c;
        ArrayList <Card>playerdeack=new ArrayList<>();
        playerdeack.add(c.new Card());
    }
}
