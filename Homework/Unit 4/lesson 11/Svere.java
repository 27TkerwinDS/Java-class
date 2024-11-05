/*
 * The radius should be provided as a double value
 * Write a method that uses this radius to calculate and return the volume of a sphere (as a double value).
 * Your program should use this method to calculate the volume of at least one sphere.
 */
import java.util.Scanner;
public class Svere {
    public static double sVol(double rad){
        double volume=4.0/3.0*Math.PI*rad*rad*rad;
        return volume;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter a double value for the radious: ");
        if(in.hasNextDouble()){
            double input= in.nextDouble();
            System.out.println("The volume of the circle is: "+sVol(input));
        }else{
            System.err.println("double Values only please");
        }
       
        in.close();
    }
}
