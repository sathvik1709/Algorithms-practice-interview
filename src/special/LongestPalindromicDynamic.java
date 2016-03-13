package special;

import java.util.Arrays;

/**
 * Created by Sathvik on 13/02/16.
 */
public class LongestPalindromicDynamic {

    public static void  main(String[] args)
    {
        System.out.println("The length of the longestPalindromicSubSequence is " + String.valueOf(longestPalindromicSubSequence("agbdba")));
        System.out.println("The length of the longestPalindromicSubString is " + String.valueOf(longestPalindromicSubString("agbdba")));

    }

    private static int longestPalindromicSubSequence(String str) {
        int[][] result = new int[str.length()][str.length()];

        int cl = str.length();
        int kl = 0;
        for(int i=0;i<str.length();i++){
            for(int k=0;k<cl;k++){
                int r = k;
                int c = k+kl;

                System.out.print("("+k+","+(k+kl)+")");

                if(r==c){
                    result[r][c] = 1;
                }else if(str.charAt(r) == str.charAt(c)){
                    result[r][c] = result[r+1][c-1] + 2;
                }else if(str.charAt(r) != str.charAt(c)){
                    result[r][c] = Math.max(result[r][c-1], result[r+1][c]);
                }

            }
            kl += 1;
            cl -= 1;
            System.out.println();
        }


        for(int i=0;i< result.length;i++){
            System.out.println(Arrays.toString(result[i]));
        }


        return result[0][str.length()-1];

    }

    private static int longestPalindromicSubString(String str){

        int[][] res = new int[str.length()][str.length()];



        return 0;
    }

}
