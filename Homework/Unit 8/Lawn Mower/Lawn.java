public class Lawn {
    public String[][]lawn;
    int hix;
    int hiy;
    public Lawn(int x, int y){
        x=x+2;
        y=y+2;
        hix=x;
        hiy=y;
        lawn=new String[y][x];
        for(int i=0;i<x;i++){
            lawn[0][i]="R";
            lawn[y-1][i]="R";
        }
        for(int i=1;i<y-1;i++){
            lawn[i][0]="R";
            for(int o=1;o<x-1;o++){
                lawn[i][o]="+";
            }
            lawn[i][x-1]="R";
        }

    }
    public void printLawn(){
        clearScreen();
        for(int i=0;i<hiy;i++){
            for(int o=0;o<hix;o++){
                System.out.print(lawn[i][o]);
            }
            System.out.println();
        } 
    }
    public String[][] test(){
        return lawn;
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    public static void main(String[] args) {
        Lawn lawn=new Lawn(6, 10);
        lawn.printLawn();
    }
}