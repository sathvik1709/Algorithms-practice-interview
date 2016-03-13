package dynamic;

import java.util.Arrays;

/**
 * Created by Sathvik on 05/02/16.
 */
public class MinimumEditDistance {

    public static void main(String[] args){
        String a = "abcde";
        String b = "azced";

        getMinimumEditDistance(a,b);

    }

    private static void getMinimumEditDistance(String a, String b) {

        int[][] res = new int[a.length()+1][b.length()+1];

        for(int i=1;i<=a.length();i++){
            res[0][i] = 1 + res[0][i-1];
        }

        for(int i=1;i<=b.length();i++){
            res[i][0] = 1 + res[i-1][0];
        }

        for(int i=1;i<=b.length();i++){
            for(int j=1;j<=a.length();j++){
                if(a.charAt(j-1) == b.charAt(i-1)){
                    res[i][j] = res[i-1][j-1];
                }else{
                    res[i][j] = 1+ Math.min(res[i][j-1],Math.min(res[i-1][j-1],res[i-1][j]));
                }
            }
        }

       /* for(int i=0;i<res.length;i++){
            System.out.println(Arrays.toString(res[i]));
        }*/

        System.out.println("Minimum number of edits: "+res[a.length()][b.length()]);

    }

}
