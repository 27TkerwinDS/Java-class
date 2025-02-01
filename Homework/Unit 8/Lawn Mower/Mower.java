public class Mower {
    int mowerX;
    int mowerY;
    int direction;
    String[][]laxBro;
    public Mower(Lawn l){
        int temp=(int)(Math.random()*4)+1;
        laxBro=l.test();
        if (temp==1){
            mowerX=1;
            mowerY=1;
        }else if(temp==2){
            mowerX=(laxBro[0].length)-2;
            mowerY=1;
        }else if(temp==3){
            mowerX=1;
            mowerY=(laxBro.length)-2;
        }else if(temp==4){
            mowerX=(laxBro[0].length)-2;
            mowerY=(laxBro.length)-2;
        }
        temp=(int)(Math.random()*4)+1;
        if (temp==1){
            direction=1;
        }else if(temp==2){
            direction=2;
        }else if(temp==3){
            direction=3;
        }else if(temp==4){
            direction=4;
        }
        laxBro[mowerY][mowerX]=mowD();

    }
    public String mowD(){
        if (direction==1){
            return "^";
        }else if(direction==2){
            return ">";
        }else if(direction==3){
            return "V";
        }else{
            return "<";
        }
    }
    public int getX(){
        return mowerX;
    }
    public int getY(){
        return mowerY;
    }
    /*public int getDirection(){
        return direction;
    }*/
    public String look(){
        if (direction==1){
            return laxBro[mowerY-1][mowerX];
        }else if(direction==2){
            return laxBro[mowerY][mowerX+1];
        }else if(direction==3){
            return laxBro[mowerY+1][mowerX];
        }else{
            return laxBro[mowerY][mowerX-1];
        }
    }
    public void turnLeft(){
        direction=direction-1;
        if (direction==0){
            direction=4;
        }
        laxBro[mowerY][mowerX]=mowD();
    }
    public void forward(){
        if (direction==1){
            laxBro[mowerY][mowerX]=" ";
            mowerY=mowerY-1;
            laxBro[mowerY][mowerX]=mowD();
        }else if(direction==2){
            laxBro[mowerY][mowerX]=" ";
            mowerX=mowerX+1;
            laxBro[mowerY][mowerX]=mowD();
        }else if(direction==3){
            laxBro[mowerY][mowerX]=" ";
            mowerY=mowerY+1;
            laxBro[mowerY][mowerX]=mowD();
        }else{
            laxBro[mowerY][mowerX]=" ";
            mowerX=mowerX-1;
            laxBro[mowerY][mowerX]=mowD();
        }
    }
    public void turnRight(){
        direction=direction+1;
        if (direction==5){
            direction=1;
        }
        laxBro[mowerY][mowerX]=mowD();
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    /*public static void main(String[] args)throws InterruptedException {
        Lawn l=new Lawn(6, 10);
        Mower m=new Mower(l);
        System.out.println(m.getX());
        System.out.println(m.getY());
        System.out.println(m.look());
        System.out.println(m.getDirection());
        l.printLawn();
        Thread.sleep(10000);
        m.turnLeft();
        l.printLawn();
    }*/
}
