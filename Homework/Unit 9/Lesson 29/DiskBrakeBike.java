public class DiskBrakeBike extends Bycicle{
    public void brake() {
        setSpeed(getSpeed()-2); 
        if (getSpeed() < 0) {
            setSpeed(0);
        }
    }
}
