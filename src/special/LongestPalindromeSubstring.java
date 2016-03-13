package special;

/**
 * Created by Sathvik on 07/01/16.
 */
public class LongestPalindromeSubstring {

    static int max (int x, int y) { return (x > y)? x : y; }


    private static int lps(char[] seq, int i, int j)
    {
        // Base Case 1: If there is only 1 character
        if (i == j)
            return 1;

        // Base Case 2: If there are only 2 characters and both are same
        if (seq[i] == seq[j] && i + 1 == j)
            return 2;

        // If the first and last characters match
        if (seq[i] == seq[j])
            return lps (seq, i+1, j-1) + 2;

        // If the first and last characters do not match
        return max( lps(seq, i, j-1), lps(seq, i+1, j) );
    }

    /* Driver program to test above functions */
    public static void  main(String[] args)
    {
        String seq = "abccea";

        System.out.println("The lnegth of the LPS is " + String.valueOf(lps(seq.toCharArray(), 0, seq.length() - 1)));

    }

}
