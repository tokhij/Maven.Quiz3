package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (int i = 0; i < vowels.length; i++) {
            if(word.indexOf(vowels[i]) != -1){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for(int i = 0; i < word.length(); i++){
            if(isVowel(word.charAt(i))) {
                return i;
            }
        }

        return -1;
    }


    public static Boolean startsWithVowel(String word) {
//        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
//
//        for (int i = 0; i < vowels.length; i++) {
//            if (Character.toLowerCase(word.charAt(0))) != -1) {
//                return true;
//            }
//        }
        return "eaiouEAIOU".indexOf(word.charAt(0)) >=0;
    }

    public static Boolean isVowel(Character character) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (int i = 0; i < vowels.length; i++) {
            if(character == vowels[i]){
                return true;
            }
        }
        return false;
    }
}
