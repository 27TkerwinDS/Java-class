public class Numbers{
    public static void main(String[] args) {
        double[]list={ 2.2, 1.0, 3.7, 4.1, 88.0 };
        double total=0;
        for(int i=0;i<=(list.length-1);i++){
            System.out.println(list[i]);
            total=total+list[i];
        }
        System.out.println((double)total/list.length);
    }
}