/*
Get x coordinate value
Get y coordinate value
Get r (radius) value (polar coordinate)
Get angle value (polar coordinate)
Translate (dx,dy) - translate the point in the x-direction (dx) and in the y direction (dy)
Distance to (point) - returns the distance to another point; takes the other point as an argument.
*/ 
class Cords{
    double x;
    double y;
    double theta;
    double r;
    public void setPoint(double newx, double newy){
        x=newx;
        y=newy;
        r=Math.sqrt(x*x+r*r);
        theta=Math.toDegrees(Math.atan((y)/(x)));
    }
    public Cords(){
        x=0;
        y=0;
        theta=0;
        r=0;
    }
    public double returnX(){
        return x;
    }
    public double returnY(){
        return y;
    }
    public double returnR(){
        return r;
    }
    public double returnTheta(){
        return theta;
    }
    public String returnAll(){
        String puttogether;
        puttogether="("+String.valueOf(x)+", "+String.valueOf(y)+")";
        return puttogether;
    }
    public void translateX(double trans){
        x=x+trans;
        r=Math.sqrt(x*x+r*r);
        theta=Math.toDegrees(Math.atan((y)/(x)));
    }
    public void translateY(double trans){
        y=y+trans;
        r=Math.sqrt(x*x+r*r);
        theta=Math.toDegrees(Math.atan2((y),(x)));
    }
    public double distance(Cords c){

        double distance=Math.sqrt((x-c.returnX())*(x-c.returnX())+(y-c.returnY())*(y-c.returnY()));

        return distance;
    }
    public Cords(double newx, double newy){
        x=newx;
        y=newy;
        r=Math.sqrt(x*x+r*r);
        theta=Math.toDegrees(Math.atan((y)/(x)));
    }

}
public class PartA{
    public static void main(String[] args) {
        Cords c=new Cords();
        Cords d=new Cords(2,2);
        c.setPoint(3,1);
        System.out.println("X="+c.returnX());
        System.out.println("Y="+c.returnY());
        System.out.println("together="+c.returnAll());
        System.out.println("R="+c.returnR());
        System.out.println("theta="+c.returnTheta());
        c.translateX(1);
        System.out.println("new all="+c.returnAll());
        c.setPoint(1, 1);
        System.out.println(d.distance(c));
    }
}