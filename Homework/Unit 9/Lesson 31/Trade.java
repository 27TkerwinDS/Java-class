public class Trade {
    public static void main(String[] args) {
        BaseBallCard b=new BaseBallCard("Fred", 1965);
        System.out.println(b);
        BaseBallCard c=new BaseBallCard("Fred", 1965);
        BaseBallCard d=new BaseBallCard("Eng", 2025);
        if (b.equals(c)){
            System.err.println("This should work!");
        }
        if(b.equals(d)){
            System.out.println("This shouldn't!");
        }
    }
}
