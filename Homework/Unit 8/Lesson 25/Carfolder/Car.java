package Carfolder;
public class Car{
    double speed;
    public Car(){
        speed=0;
    }
    public Car(double newSpeed){
        if(newSpeed<120&&newSpeed>0){
            speed=newSpeed;
        }else if (newSpeed>120){
            speed=120;
        }else{
            speed=0;
        }
    }
    public void f(){
        if (speed<120){
            speed++;
        }
    }
    public void s(){
        if (speed>.001){
            speed=speed-.1;
        }
    }
    public double getSpeed(){
        return speed;
    }
}