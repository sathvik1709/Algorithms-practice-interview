package string;


import java.util.Arrays;

/**
 * Created by Sathvik on 12/02/16.
 */
public class String2 {

    //check if a String is valid shuffle of two String?

    /*
    * One more difficult String algorithm based coding question for senior developers.
    * You are given 3 strings: first,  second, and  third.
    * third String is said to be a shuffle of first and second if it can be formed by
    * interleaving the characters of first and second String in a way that
    * maintains the left to right ordering of the characters from each string.
    * For example, given first = "abc" and second = "def",  third = "dabecf"
    * is a valid shuffle since it preserves the character ordering of the two strings.
    * So, given these 3 strings write a function that detects whether third String is a valid shuffle of first and second String.
    * */

    //Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz400kGMn6O

    public static void main(String[] args){

        System.out.println(isValidShuffle("XXY","XXZ","XXZXXXY"));
        //System.out.println(isValidShuffleDynamic("XXY","XXZ","XXZXXXY"));

    }

    private static boolean isValidShuffle(String first,String second, String third){

        if(first.length() + second.length() != third.length()){
            return false;
        }

        int iFirst = 0;
        int iSecond = 0;

        for(int i=0;i<third.length();i++){
            char c = third.charAt(i);
            if(iFirst < first.length() && c == first.charAt(iFirst)){
                iFirst++;
            }else if(iSecond < second.length() && c == second.charAt(iSecond)){
                iSecond++;
            }
        }

        if(iFirst+iSecond == third.length()){
            return true;
        }else{
            return false;
        }

    }



}
