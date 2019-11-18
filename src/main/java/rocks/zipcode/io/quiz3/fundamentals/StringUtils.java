package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
//    Set<String> temp = new HashSet<>();
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        //so it doesnt go out of bounds
        if (indexToCapitalize == str.length() - 1) {
            return str.substring(0, indexToCapitalize) + Character.toUpperCase(str.charAt(indexToCapitalize));
        } // this return statement already passed all tests, but if last letter was capitalized, we would need to be sure it doesnt go out of bounds
        return str.substring(0, indexToCapitalize) + Character.toUpperCase(str.charAt(indexToCapitalize)) + str.substring(indexToCapitalize + 1);
    }


    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if (baseString.charAt(indexOfString) == characterToCheckFor){
            return true;
        }

        return false;
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> temp = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                temp.add(string.substring(i, j));
            }
        }
        return temp.toArray(new String[]{});
    }

    public static Integer getNumberOfSubStrings(String input){
        Set<String> temp = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                temp.add(input.substring(i, j));
            }
        }
        return temp.size();
    }

}
