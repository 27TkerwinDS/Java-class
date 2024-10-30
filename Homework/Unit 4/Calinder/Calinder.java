import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Month;
public class Calinder{
    public static void main(String[] args) {
        int daycount=0;
        LocalDate today = LocalDate.now();
        Month month = today.getMonth();
        String lmonth=month.toString();
        int padding=(28-lmonth.length())/2;
        String centeredText = String.format("%" + padding + "s%s%" + padding + "s", "", lmonth, "");
        System.out.println(centeredText);
        System.out.println("Mon Tue Wed Thr Fri Sat Sun");
        LocalDate firstOfMonth = today.minusDays(today.getDayOfMonth() - 1);
        //System.out.println(firstOfMonth.getDayOfWeek());
        DayOfWeek dayofweek=firstOfMonth.getDayOfWeek();
        for(int i=1;i<dayofweek.getValue();i++){
            System.out.print("    ");
            daycount=dayofweek.getValue();
        }
        for(int i=1;i<=month.length(false);i++){
            System.out.printf("%3d",i);
            if(i == today.getDayOfMonth()){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            if (daycount % 7 == 0) {
                System.out.println();
            }
            daycount++;
        }
    }
}