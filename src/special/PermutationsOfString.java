package special;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Sathvik on 02/01/16.
 */
public class PermutationsOfString {

   public static void main(String[] args){

       String str = "ABC";
       permutationsOfString(str.toCharArray(),str.length());

   }

    private static void permutationsOfString(char[] a, int n){

        if(n==1){
            System.out.println(a);
        }else{
            for(int i=0;i<n;i++){
                swapChars(a,i,n-1);
                permutationsOfString(a,n-1);
                swapChars(a,i,n-1);
            }
        }

    }

    private static void swapChars(char[] a,int i,int j){
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
