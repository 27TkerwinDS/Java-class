package Svere.clacsvere;

public class CalcSurface {
    public static double Volume(double r){
        double v=(3.0/4.0)*Math.PI*r*r*r;


        return v;
    }
    public static double Surface(double r){
        double sa=4*Math.PI*r*r;


        return sa;
    }
}
