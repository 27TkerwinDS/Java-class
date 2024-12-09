public class SwapExample {
    public static int swap(int a, int b) {
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
        return a;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 99;
        System.out.printf("x = %d, y = %d (before)%n", x, y);

        // call the bogus swap function.
        int temp1=swap(x, y);
        int temp2=swap(y,x);
        y=temp2;
        x=temp1;

        System.out.printf("x = %d, y = %d (after)%n", x, y);
    }
}
