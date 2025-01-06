import java.util.ArrayList;
import java.util.Scanner;
public class BlackJack{
   
    public class Deck{
        public static int draw(){
            int drew=(int)((Math.random()*13)+1);
            return drew;
        }
        public static String convertNumToString(int val){
            String card="";
            if ((10>val)&&(val>1)){
                card=String.valueOf(val);
            }else if(val==1){
                card="A";
            }else if(val==10){
                card="T";
            }else if(val==11){
                card="J";
            }else if(val==12){
                card="Q";
            }else if(val==13){
                card="K";
            }
            int temp=(int)((Math.random()*4)+1);
            if(temp==1){
                card=card+"H";
            }else if(temp==2){
                card=card+"D";
            }else if(temp==3){
                card=card+"S";
            }else if(temp==4){
                card=card+"C";
            }
            
            
            return card;
        }
        
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    public static void displayHands(boolean show, ArrayList <String>dealer, ArrayList <String> player) {  
        clearScreen();
        System.out.println("Dealer:");
        System.out.print(dealer.get(0)+", ");
        if(!show){
            System.out.println("[]");
        }else{
            for (int i=1;i<dealer.size();i++){
                System.out.print(dealer.get(i)+", ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Player:");
        for (int i=0;i<player.size();i++){
            System.out.print(player.get(i)+", ");
        }
        System.out.println();
        System.out.println();
    } 
    public static void main(String[] args) throws InterruptedException {
        Scanner in=new Scanner(System.in);
        int playertotal=0;
        int dealertotal=0;
        int dAceSub=0;
        int pAceSub=0;
        boolean stand=false;
       
        clearScreen();
        ArrayList <Integer> dealer=new ArrayList<>();
        ArrayList <Integer> player=new ArrayList<>();
        dealer.add(Deck.draw());
        if(dealer.get(dealer.size()-1)==1){
            dealertotal=dealertotal+11;
            dAceSub=dAceSub+10;
        }else if(dealer.get(dealer.size()-1)<11){
            dealertotal=dealertotal+dealer.get(dealer.size()-1);
        }else{
            dealertotal=dealertotal+10;
        }
        dealer.add(Deck.draw());
        if(dealer.get(dealer.size()-1)==1){
            dealertotal=dealertotal+11;
            dAceSub=dAceSub+10;
        }else if(dealer.get(dealer.size()-1)<11){
            dealertotal=dealertotal+dealer.get(dealer.size()-1);
        }else{
            dealertotal=dealertotal+10;
        }
        player.add(Deck.draw());
        if(player.get(player.size()-1)==1){
            playertotal=playertotal+11;
            pAceSub=pAceSub+10;
        }else if(player.get(player.size()-1)<11){
            playertotal=playertotal+player.get(player.size()-1);
        }else{
            playertotal=playertotal+10;
        }
        player.add(Deck.draw());
        if(player.get(player.size()-1)==1){
            playertotal=playertotal+11;
            pAceSub=pAceSub+10;
        }else if(player.get(player.size()-1)<11){
            playertotal=playertotal+player.get(player.size()-1);
        }else{
            playertotal=playertotal+10;
        }
        ArrayList <String> dealerAsS=new ArrayList<>();
        dealerAsS.add(Deck.convertNumToString((int)dealer.get(0)));
        dealerAsS.add(Deck.convertNumToString((int)dealer.get(1)));
        ArrayList <String> playerAsS=new ArrayList<>();
        playerAsS.add(Deck.convertNumToString((int)player.get(0)));
        playerAsS.add(Deck.convertNumToString((int)player.get(1)));
        displayHands(stand, dealerAsS, playerAsS);
        while(!stand){
            System.out.print("'h' to hit 's' to stand: ");
            String input=in.next();
            if(input.toLowerCase().equals("h")){
                player.add(Deck.draw());
                if(player.get(player.size()-1)==1){
                    playertotal=playertotal+11;
                    pAceSub=pAceSub+10;
                }else if(player.get(player.size()-1)<11){
                    playertotal=playertotal+player.get(player.size()-1);
                }else{
                    playertotal=playertotal+10;
                }
                playerAsS.add(Deck.convertNumToString((int)player.get(player.size()-1)));
                displayHands(stand, dealerAsS, playerAsS);
            }else if (input.toLowerCase().equals("s")){
                stand=true;
                displayHands(false, dealerAsS, playerAsS);
            }else{
            System.err.println("An Error has occored");
                displayHands(stand, dealerAsS, playerAsS);
            }
        }
        Thread.sleep(1000);
        displayHands(stand, dealerAsS, playerAsS);

        while(dealertotal<17){
            dealer.add(Deck.draw());
            dealerAsS.add(Deck.convertNumToString((int)dealer.get(dealer.size()-1)));
            if(dealer.get(dealer.size()-1)==1){
                dealertotal=dealertotal+11;
                dAceSub=dAceSub+10;
            }else if(dealer.get(dealer.size()-1)<11){
                dealertotal=dealertotal+dealer.get(dealer.size()-1);
            }else{
                dealertotal=dealertotal+10;
            }  
            Thread.sleep(1000);
            displayHands(stand, dealerAsS, playerAsS);
            if((dealertotal>21)&&(dAceSub>0)){
                dealertotal=dealertotal-10;
                dAceSub=dAceSub-10;
            }
        }

        while((playertotal>21)&&(pAceSub>0)){
            playertotal=playertotal-10;
            pAceSub=pAceSub-10;
        }

        Thread.sleep(10000);
        clearScreen();
        if (((playertotal<21)&&(playertotal>dealertotal))||((playertotal<21)&&(dealertotal>21))){
            System.out.println("                   CONGRADULATIONS YOU WIN!!!");
        }else if(playertotal==dealertotal){
            System.out.println("                   CONGRADULATIONS YOU TIED!!");
            
        }else{
            System.out.println("                     OH NO! YOU LOSE!!! :(");
        }

        System.out.println("");
        System.out.println("                You Scored:          Dealer scored: ");
        System.out.println("                "+playertotal+"                   "+dealertotal);
        System.out.println();

        in.close();
    }
}