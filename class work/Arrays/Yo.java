public class Yo {

    public static void squares(int[] initial){
        for(int i=0; i<initial.length; i++){
            initial[i]= initial[i]*initial[i];
        }
    }


    public static void main(String[] args) {
        int[] howdy={10, 2,4,5,2,6};
        squares(howdy);
        for (int i=0; i<howdy.length; i++){
            System.out.println(howdy[i]);
        }
    }
}
