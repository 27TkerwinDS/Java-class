import java.util.Scanner;
public class tile{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter dimentions of the room in inches: ");
        final int tile_width=5;
        double room=in.nextDouble();
        int tials=(int)room/tile_width;
        if (tials % 2 == 0){
            tials=tials-1;
        }
        double gap=room-tials*tile_width;
        gap=(double)gap/2;
        System.out.println("gap is: "+gap+"\"");
        System.out.println((int)tials/2+" white tiles");
        System.out.println((int)tials/2+1+" black tiles");


        in.close();
    }
}