public class PartC {

    public static boolean isVal(String a){
        if(a.equals("a")||a.equals("A")||a.equals("e")||a.equals("E")||a.equals("i")||a.equals("I")||a.equals("o")||a.equals("O")||a.equals("u")||a.equals("U")){
            return true;
        }else{
            return false;
        }
    }
    public static int numVal(String input){
        int num=0;
        int length=input.length();
        for(int i=0; i<length;i++){
            String subString=input.substring(i, i+1);
            if(PartC.isVal(subString)){
                num=num+1;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String hi="how are you doing today?";
        System.out.println(PartC.numVal(hi));
    }
}
