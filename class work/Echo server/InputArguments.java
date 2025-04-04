public class InputArguments{
    public static void main(String[] args) {
        // how many arguments were passed to this program
        System.out.println("# Arguments = "+args.length);
        for (int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }
    }
}