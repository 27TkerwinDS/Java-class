public class Rad{
    public static void main(String[] args) {
        double rad=100.0;
        int time=0;
        while (rad>1){
            time=time+30;
            rad=rad/2.0;
        }
        System.out.println("It would take "+time+" years for the radiation to drop by 99%.");
        System.out.println(rad+"% of the material would remain.");
    }
}