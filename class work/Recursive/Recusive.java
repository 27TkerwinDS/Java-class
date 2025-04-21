public class Recusive{
    public static void main(String[] args) {
        dofact(5);
    }
    public static int factorial (int n){
        if (n==1 ||n==0){
            return 1;
        }else if (n<0){
            throw new IllegalArgumentException("n must be greater than 0");
        }else{
            return n*factorial(n-1);
        }
        
    }
    public static void dofact(int n){
        System.out.printf("factorial(%d) = %d%n", n ,factorial(n));
    }
}