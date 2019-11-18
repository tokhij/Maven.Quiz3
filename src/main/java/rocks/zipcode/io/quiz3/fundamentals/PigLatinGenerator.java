package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {

            StringBuilder builder = new StringBuilder();
            String[] words = str.split(" ");

            for(int i = 0; i < words.length-1; i++)builder.append(translateWord(words[i])).append(" ");
            builder.append(translateWord(words[words.length - 1]));
            return builder.toString();
        }

        private String translateWord(String str){
            if(VowelUtils.startsWithVowel(str)){
                return str + "way";
            }
            if (!VowelUtils.startsWithVowel(str)) {
                Integer firstVowel = VowelUtils.getIndexOfFirstVowel(str);
                String str2 = str.substring(firstVowel) + str.substring(0,firstVowel);
                return str2 + "ay";
            }

            return str + "ay";
        }
}


