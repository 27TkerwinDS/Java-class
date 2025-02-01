public class Mowpattern {
    Lawn l;
    Mower m;
    public Mowpattern(int x, int y){
        l=new Lawn(x, y);
        m=new Mower(l);
        l.printLawn();
    }
    public void goToEnd()throws InterruptedException{
        while (m.look().equals("+")){
            m.forward();
            l.printLawn();
            Thread.sleep(100);
        }
    }
    public void spirelCut()throws InterruptedException{
        l.printLawn();
        Thread.sleep(1000);
        if (m.look().equals("R")){
            while (m.look().equals("R")){
                m.turnLeft();
                l.printLawn();
                Thread.sleep(100);
            }
        }else{
            while (m.look().equals("+")) {
                m.turnRight();
                l.printLawn();
                Thread.sleep(100);
            }
            m.turnLeft();
            l.printLawn();
            Thread.sleep(100);
        }
        boolean q=false;
        while(!q){
            while (m.look().equals("+")){
                goToEnd();
            }
            m.turnLeft();
            if (m.look().equals(" ")){
                q=true; 
            }
        }
    }
    public void horisantalCut()throws InterruptedException{
        l.printLawn();
        Thread.sleep(1000);
        if (m.look().equals("R")){
            while (m.look().equals("R")){
                m.turnLeft();
                l.printLawn();
                Thread.sleep(100);
            }
        }else{
            while (m.look().equals("+")) {
                m.turnRight();
                l.printLawn();
                Thread.sleep(100);
            }
            m.turnLeft();
            l.printLawn();
            Thread.sleep(100);
        }
        boolean q=false;
        int dir=1;
        while(!q){
            while (m.look().equals("+")){
                goToEnd();
            }
            if(dir%2==1){
                m.turnLeft();
            }else{
                m.turnRight();
            }
            if (m.look().equals("R")){
                q=true; 
            }else{
                m.forward();
                if(dir%2==1){
                    m.turnLeft();
                }else{
                    m.turnRight();
                }
                dir=dir+1;
            }

        }
    }
    
}
