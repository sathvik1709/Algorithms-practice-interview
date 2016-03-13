package dynamic;

import java.util.Arrays;

/**
 * Created by Sathvik on 05/02/16.
 */
public class LongestCommonSubSequence {

    public static void main(String[] args){

        String a = "abcdaf";
        String b = "acbcf";

        longestCommonSubSequenceLength(a, b);

    }

    private static void longestCommonSubSequenceLength(String a,String b){

        int[][] res = new int[b.length()+1][a.length()+1];

        for(int i=1;i<=b.length();i++){
            for(int j=1;j<=a.length();j++){
                if(a.charAt(j-1) == b.charAt(i-1)){
                    res[i][j] = res[i-1][j-1] + 1;
                }else{
                    res[i][j] = Math.max(res[i-1][j],res[i][j-1]);
                }
            }
        }

        for(int i=0;i< res.length;i++){
            System.out.println(Arrays.toString(res[i]));
        }

    }

}
