import java.util.ArrayList;
public class AnotherArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Emily");
        names.add("Bob");
        names.add("Cindy");
        names.remove("Bob");
        names.add(1,"Bob");
        names.remove(1);
        names.add(1, "hi");
        System.out.println(names);
        System.out.println(names.get(0));
    }    
}
