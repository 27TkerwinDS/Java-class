// we declare the Light class here, but it's not public.
class Light {
    // track the state of the light.
    // true means the light is on.
    // false means the light is off.
    boolean state = false;
    int lightlevelon=10;
    int lightlevel=0;

    // this method returns true if the light is on.
    public boolean view() {
        return state;
    }

    // turn on light.
    public void turnOn() {
        lightlevel=lightlevelon;
    }

    // turn off light.
    public void turnOff() {
        lightlevel=0;
    }
    public void setLight(){
        lightlevel=setLight();
    }
}

public class Dimlight {
    public static void main(String[] args) {
        // create a light object.
        Light light = new Light();

        // turn on the light.
        light.turnOn();

        // print current state.
        System.out.println("state = " + light.view());

        // turn off the light.
        light.turnOff();

        // print current state.
        System.out.println("state = " + light.view());
    }
}