public class R01{
    public static void main(String[] args) {
        invertedTri(5);
    }
    public static void invertedTriLen(int n){
        int tempN=n;
        if (tempN==1){
            System.out.println("*");
        }else if(tempN<1){
            throw new IllegalArgumentException("Must be greater than 0");
         }else{
            System.err.print("*");
            invertedTriLen(tempN-1);
        }
    }
    public static void invertedTriHei(int n){
        if (n==0){
            return;
        }else if(n<1){
            throw new IllegalArgumentException("Must be greater than 0");
         }else{
            invertedTriLen(n);
            invertedTriHei(n-1);
        }
    }
    public static void invertedTri(int n){
        invertedTriHei(n);
    }
}