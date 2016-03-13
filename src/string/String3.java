package string;

import java.util.Arrays;

/**
 * Created by Sathvik on 13/02/16.
 */
public class String3 {

    //Write a program to check if a String contains another String e.g. indexOf()
    public static void main(String[] args){

        String a = "abcdefghi";
        String b = "gh";

        System.out.println(stringContains(a,b));
        //System.out.println(isValidShuffleDynamic("XXY","XXZ","XXZXXXY"));

    }

    private static int stringContains(String a, String b) {

        int[][] res = new int[b.length()+1][a.length()+1];

        for(int i=0;i<=a.length();i++){
            res[0][i] = 1;
        }

        for(int i=0;i<=b.length();i++){
            res[i][0] = 1;
        }

        for(int i=0;i<res.length;i++){
            System.out.println(Arrays.toString(res[i]));
        }

        for(int i=1;i<=b.length();i++){
            for(int k=1;k<=a.length();k++){
                if(a.charAt(k-1) == b.charAt(i-1)){
                    res[i][k] = res[i][k-1]+1;
                }else{
                    res[i][k] = Math.max(res[i][k-1],res[i-1][k]);
                }
            }
        }

        for(int i=0;i<res.length;i++){
            System.out.println(Arrays.toString(res[i]));
        }

        return res[b.length()][a.length()]-1;
    }

}
