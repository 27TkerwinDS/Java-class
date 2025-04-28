import java.util.ArrayList;

public class Hanoi{
    
    public static void solveHonoi(int number, int start, int end,ArrayList<Integer>[] board){
        int intermidiate;
        if ((start!=end)&&(start>0&&start<4)&&(end>0&&end<4)){
            intermidiate=getIntermidiate(start,end);
        }else{
            System.err.println("Error");
            return;
        }
        if (number==3){
            switchValues(start, end, board);
            switchValues(start, intermidiate, board);
            switchValues(end, intermidiate, board);
            switchValues(start, end, board);
            switchValues(intermidiate, start, board);
            switchValues(intermidiate, end, board);
            switchValues(start, end, board);
        }else{
            solveHonoi(number-1, start, intermidiate, board);
            switchValues(start, end, board);
            solveHonoi(number-1, intermidiate, end, board);
        }
        

    }
    public static int getIntermidiate(int start, int end){
        return (6-start)-end;
    }
    public static void switchValues(int tgt, int place,ArrayList<Integer>[] board){
        tgt--;
        place--;
        int temp=board[tgt].get(0);
        board[tgt].remove(0);
        board[place].add(0,temp);
        System.out.printf("%d -> %d%n",tgt+1,place+1);
    }
    public static void main(String[] args) {
        Towers t=new Towers(5);
        solveHonoi(5, 1,3,t.getBoard());
    }
    
    
}
class Towers{
    ArrayList<Integer> tower;
    ArrayList<Integer>[]board=new ArrayList[3];
    public ArrayList<Integer> createTower(){
        return tower=new ArrayList<>();
    }
    public Towers(int size){
        for(int i=0;i<3;i++){
            board[i]=createTower();
        }
        for (int i=size;i>0;i--){
            board[0].add(i);
        }
    }
    public ArrayList<Integer>[] getBoard(){
        return board;
    }

}