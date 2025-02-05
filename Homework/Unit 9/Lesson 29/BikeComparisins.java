public class BikeComparisins {
    
    public static void main(String[] args) {
        Bycicle b=new Bycicle();
        DiskBrakeBike d=new DiskBrakeBike();
        b.pedal();
        b.pedal();
        b.pedal();
        b.pedal();
        d.pedal();
        d.pedal();
        d.pedal();
        d.pedal();
        System.out.print("bike ");
        b.prints();
        b.brake();
        System.out.print("bike ");
        b.prints();
        b.brake();
        System.out.print("bike ");
        b.prints();
        b.brake();
        System.out.print("bike ");
        b.prints();
        b.brake();
        System.out.print("bike ");
        b.prints();
        System.out.print("Disk Bike ");
        d.prints();
        d.brake();
        System.out.print("Disk Bike ");
        d.prints();
        d.brake();
        System.out.print("Disk Bike ");
        d.prints();
        d.brake();
    }

}
