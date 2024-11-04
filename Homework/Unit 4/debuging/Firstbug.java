public class Firstbug{
    public static void main(String[] args) {
        String name = "Harry";
        //System.out.println(name.length());
        //length()gets the total amounth of charictures, charAt counts from 0, so it is one too much
        System.out.println("The last letter of the name is " + name.charAt(name.length()-1));
        //runtime err
    }
}