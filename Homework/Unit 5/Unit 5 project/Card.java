public class Card {
    enum Suit{
        Spade, Heart, Club, Dimond
    }
    enum Rank{
        Ace,Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
    }
    private Suit suit;
    private Rank rank;
    public Card(){
        int r=(int)(Math.random()*4);
        switch (r){
            case 0:
            suit=Suit.Spade;
            break;
            case 1:
            suit=Suit.Heart;
            break;
            case 2:
            suit=Suit.Club;
            break;
            case 3:
            suit=Suit.Dimond;
            break;
        }
        r=(int)(Math.random()*13);
        switch (r) {
            case 0:
            rank=Rank.Ace;
            break;
            case 1:
            rank=Rank.Two;
            break;
            case 2:
            rank=Rank.Three;
            break;
            case 3:
            rank=Rank.Four;
            break;
            case 4:
            rank=Rank.Five;
            break;
            case 5:
            rank=Rank.Six;
            break;
            case 6:
            rank=Rank.Seven;
            break;
            case 7:
            rank=Rank.Eight;
            break;
            case 8:
            rank=Rank.Nine;
            break;
            case 9:
            rank=Rank.Ten;
            break;
            case 10:
            rank=Rank.Jack;
            break;case 11:
            rank=Rank.Queen;
            break;case 12:
            rank=Rank.King;
            break;
        }

    }
    public Card(Suit tgtSuit, Rank tgtRank){
        suit=tgtSuit;
        rank=tgtRank;
    }
    public Suit returnSuit(){
        return suit;
    }
    public Rank returnrank(){
        return rank;
    }
    public String getface(){
        String ranks="";
        String suits="";
        switch (rank) {
            case Ace:
                ranks="A";
                break;
            case Jack:
                ranks="J";
                break;
            case King:
                ranks="K";
                break;
            case Queen:
                ranks="Q";
                break;
            case Two:
                ranks="2";
                break;
            case Three:
                ranks="3";
                break;
            case Four:
                ranks="4";
                break;
            case Five:
                ranks="5";
                break;
            case Six:
                ranks="6";
                break;
            case Seven:
                ranks="7";
                break;
            case Eight:
                ranks="8";
                break;
            case Nine:
                ranks="9";
                break;
            case Ten:
                ranks="T";
                break;
        }
        switch (suit){
            case Heart:
                suits="H";
                break;
            case Dimond:
                suits="D";
                break;
            case Spade:
                suits="S";
                break;
            case Club:
                suits="C";
                break;
        }
        String total= ranks+suits;
        return total;
    }
    public static void main(String[] args) {
        Card r=new Card(Suit.Spade, Rank.Ace);
        System.out.println(r.getface());
        r=new Card(Suit.Club, Rank.Ten);
        System.out.println(r.getface());
        for(int i=1; i<101; i++){
            System.out.printf("%3d| ", i);
            r=new Card();
            System.out.println(r.getface());
        }
    }
}