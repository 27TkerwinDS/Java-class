import Carfolder.Car;
public class CarExample {
    public static void delay(long msec) {
        try{
            Thread.sleep(msec);
        } catch (Exception e) {
            // do nothing.
        }
    }
    public static void main(String[] args) {
        Car c=new Car();
        for(int i=0;i<121;i++){
            c.f();
            System.out.println(c.getSpeed());
            delay(100);
        }
        for(int i=0;i<1201;i++){
            c.s();
            System.out.printf("%.2f%n",c.getSpeed());
            delay(50);
        }
        c=new Car(50);
        System.out.println(c.getSpeed());

    }
}
