import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a Scanner object.
        Scanner in = new Scanner(System.in);

        // get the user's name.
        /*  System.out.print("Enter your name: ");
        String name = in.nextLine();

        // print the name.
        System.out.println("Hello, " + name);
        */
        // get the height (as a decimal and in meters).
        System.out.print("Enter the initial height in meters (as a decimal number): ");
        double height0 = in.nextDouble();
        System.out.print("Enter the initial velocity (m/s): ");
        double velocity0 = in.nextDouble();
        System.out.print("Enter the time (s): ");
        double time = in.nextDouble();
        
        //calculate the hight using consant acseleration equation

        double h = height0 + velocity0 * time + 0.5 * (-9.81) * time * time;
        System.out.println("hight is: "+ h + "m");
        // does calculation
    }
}
