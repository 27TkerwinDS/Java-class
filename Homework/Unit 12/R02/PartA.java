public class PartA{
    public static void main(String[] args) {
        String s="dud";
        System.out.println(isPalendrome(processPhrase(s)));
        
    }

    public static String processPhrase(String phrase) {
        phrase = phrase.toLowerCase();
        phrase = phrase.replaceAll("[,.'?! ]+", "");
        return phrase;
        
    }
     public static boolean isPalendrome(String word){
        if (word.length()==1||word.length()==0){
            return true;
        }else{
            Character f=word.charAt(0);
            Character l=word.charAt(word.length()-1);
            if(f.compareTo(l)==0){
                word=word.substring(1, word.length()-1);
                return isPalendrome(word);
            }else{
                return false;
            }

        }
     }


}