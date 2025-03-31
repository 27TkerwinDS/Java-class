public class PartBDemo {
    public static void main(String[] args) {
        Animal a=new Animal("Tom", 5600);
        Animal b=new Animal("Bob", 60);
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo(a));
    }
    
}
