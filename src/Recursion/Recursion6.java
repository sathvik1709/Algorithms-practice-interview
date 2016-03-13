package Recursion;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sathvik on 11/11/15.
 */
public class Recursion6 {

    // finding all permutations

    public static void main(String args[]) {

        String s2 = "abc";
        System.out.println("\nString " + s2 + ":\nPermutations: " + crunchifyPermutation(s2));

    }

    public static Set<String> crunchifyPermutation(String str) {
        Set<String> crunchifyResult = new HashSet<String>();
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            crunchifyResult.add("");
            return crunchifyResult;
        }

        char firstChar = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = crunchifyPermutation(rem);
        System.out.println(words);
        for (String newString : words) {
            for (int i = 0; i <= newString.length(); i++) {
                crunchifyResult.add(crunchifyCharAdd(newString, firstChar, i));
            }
        }

        System.out.println("cres "+crunchifyResult);
        return crunchifyResult;
    }

    public static String crunchifyCharAdd(String str, char c, int j) {
        String first = str.substring(0, j);
        String last = str.substring(j);
        return first + c + last;
    }



}
