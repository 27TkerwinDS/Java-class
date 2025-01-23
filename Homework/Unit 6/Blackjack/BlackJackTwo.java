
import java.util.ArrayList;
import java.util.Scanner;

public class BlackJackTwo {
    public static void showHand(ArrayList<Card> hand) {
        // loop through and display the card face.
        Card c;
        for (int i = 0; i < hand.size(); i++) {
            c = hand.get(i);
            System.out.print(c.showCard() + " ");
        }
        System.out.println();
        
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }public static void displayHands(ArrayList<Card>dealer,ArrayList<Card>player) {  
        clearScreen();
        System.out.println("Dealer:");
        showHand(dealer);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Player:");
        showHand(player);
    }  
    public static int returnScores(ArrayList<Card> array){
        Card c;
        int aces=0;
        int score=0;
        for(int i=0;i<array.size();i++){
            c=array.get(i);
            score=score+c.getVal();
            if (c.ace()){
                aces++;
            }
        }
        while(aces>0){
            if(score>21){
                score=score-10;
                aces--;
            }else{
                aces--;
            }
        }
        return score;
    }
    public static void main(String[] args) throws InterruptedException {
        // player's hand
        ArrayList <Card>playerdeack=new ArrayList<>();

        // dealer's hand.
        ArrayList <Card> dealerhand = new ArrayList<>();

        // deal one card to the player.
        playerdeack.add(new Card());

        // deal one card to the dealer (face up).
        dealerhand.add(new Card());

        playerdeack.add(new Card());
        dealerhand.add(new Card(false));


        boolean q=false;

        Scanner in=new Scanner(System.in);
        while (!q){
            displayHands(dealerhand, playerdeack);
            System.out.print("'h' to hit 's' to stand: ");
            String input=in.next();
            if(input.toLowerCase().equals("h")){
                playerdeack.add(new Card());
            }else if (input.toLowerCase().equals("s")){
                q=true;
                displayHands(dealerhand,playerdeack);
                Card c=dealerhand.get(1);
                c.reveal();


            }else{
            System.err.println("An Error has occored");
                displayHands(dealerhand,playerdeack);
            }
        }
        Thread.sleep(1000);
        displayHands(dealerhand,playerdeack);
        int playerScore=0;

        int dealerScore=0;
        dealerScore=returnScores(dealerhand);
        playerScore=returnScores(playerdeack);
        while (dealerScore<17){
            dealerhand.add(new Card());
            Thread.sleep(500);
            displayHands(dealerhand, playerdeack);
            dealerScore=returnScores(dealerhand);
        }
        Thread.sleep(5000);

        clearScreen();
        if (((returnScores(playerdeack)<21)&&(returnScores(playerdeack)>returnScores(dealerhand)))||((returnScores(playerdeack)<21)&&(returnScores(dealerhand)>21))){
            System.out.println("                   CONGRADULATIONS YOU WIN!!!");
        }else if(returnScores(dealerhand)==returnScores(playerdeack)&&returnScores(playerdeack)<21){
            System.out.println("                   CONGRADULATIONS YOU TIED!!");
            
        }else{
            System.out.println("                     OH NO! YOU LOSE!!! :(");
        }

        System.out.println("");
        System.out.println("                You Scored:          Dealer scored: ");
        System.out.println("                "+returnScores(playerdeack)+"                   "+returnScores(dealerhand));
        System.out.println();

        in.close();
        
    }
}
