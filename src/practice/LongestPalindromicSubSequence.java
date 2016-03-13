package practice;

/**
 * Created by Sathvik on 12/01/16.
 */
public class LongestPalindromicSubSequence {

    public static void  main(String[] args)
    {
        String seq = "abccea";

        System.out.println("The lnegth of the LPS is " + String.valueOf(lps(seq.toCharArray(), 0, seq.length() - 1)));

    }

    private static int lps(char[] a, int i, int j) {

        if(i == j){
            return 1;
        }

        if(a[i] == a[j] && j == i+1){
            return 2;
        }

        if(a[i] == a[j]){
            return lps(a,i+1,j-1) + 2;
        }


        return Math.max(lps(a,i+1,j),lps(a,i,j-1));

    }


}
