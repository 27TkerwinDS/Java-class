class Tally{
    int total;
    public Tally(){
        total=0;
    }
    public int look(){
        return total;
    }
    public void add(){
        total++;
    }
    public void reset(){
        total=0;
    }
}
public class yo{
    
    public static void main(String[] args) {
        Tally t =new Tally();
        t.add();
        System.out.println(t.look());

    }
}