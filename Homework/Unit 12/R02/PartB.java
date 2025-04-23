import java.util.ArrayList;


public class PartB {
    public static void main(String[] args) {
        System.out.println(isPalendrome("Madam i'm Adam"));
    }
    public static String processPhrase(String phrase) {
        phrase = phrase.toLowerCase();
        phrase = phrase.replaceAll("[,.'?! ]+", "");
        return phrase;
        
    }
    public static Boolean isPalendrome(String word){
        word=processPhrase(word);
        String newString="";
        ArrayList<Character> letters=new ArrayList<>();
        for (int i=0;i<word.length();i++){
            letters.add(word.charAt(i));
        }
        for(int i=letters.size()-1; i>=0; i--){
            newString=newString+letters.get(i);
        }
        if (newString.equals(word)){
            return true;
        }else{
            return false;
        }

    }
}
