import java.util.Scanner;
// we declare the Light class here, but it's not public.
class Light {
    // track the state of the light.
    // true means the light is on.
    // false means the light is off.
    boolean state = false;
    int lightlevelon=10;
    int lightlevel=0;

    // this method returns true if the light is on.
    public int view() {
        if (lightlevel!=0){
            lightlevel=lightlevelon;
        }
        return lightlevel;
    }

    // turn on light.
    public void turnOn() {
        lightlevel=lightlevelon;
    }

    // turn off light.
    public void turnOff() {
        lightlevel=0;
    }
    public void setLight(int newval){
        if(newval<=10&&newval>=1){
            lightlevelon=newval;
        lightlevel=lightlevelon;
        }else{
            System.err.println("1-10 please!");
        } 
    }
    public void up() {
        if(lightlevelon<10){
            lightlevelon=lightlevelon+1;
        }
    }public void down() {
        if(lightlevelon>1){
            lightlevelon=lightlevelon-1;
        }
    }
}

public class Dimlight {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        boolean q=false;
        Light light=new Light();
        while(q==false){
            System.out.printf("%nPlease enter 'on' to turn on the light%nPlease enter 'off' to turn off the light%nplease enter 'view' to see the light value%nplease enter 'up' to increase brightness of the light%nplease enter 'down' to turn down the brightness of the light%nPlease enter 1-10 to set the brightness of the light%nEnter 'q' to quit.%n");
            if(in.hasNextInt()){
                int input=in.nextInt();
                light.setLight(input);
            }else if(in.hasNextLine()){
                String input=in.nextLine();
                if(input.equals("q")){
                    q=true;
                }else if(input.equals("on")){
                    light.turnOn();
                }else if(input.equals("off")){
                    light.turnOff();
                }else if(input.equals("view")){
                    System.out.println(light.view());
                }else if(input.equals("up")){
                    light.up();
                }else if(input.equals("down")){
                    light.down();
                }else{
                    System.err.println("That is not an acseptible input!");
                }
            }
        }
        in.close();
        /*// create a light object.
        Light light = new Light();

        // turn on the light.
        light.turnOn();

        // print current state.
        System.out.println("state = " + light.view());

        // turn off the light.
        light.turnOff();

        // print current state.
        System.out.println("state = " + light.view());
        */
    }
}