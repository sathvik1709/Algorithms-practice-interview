package Arrays2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Sathvik on 15/01/16.
 */
public class Array21 {

    ///Given an array A[] and a number x, check for pair in A[] with sum as x

    public static  void main(String[] args){

        int a[] = new int[]{2,4,12,16,24,11,3};
        int sum = 8;

        //System.out.println(isSumPossibleBruteForce(a, sum));
        System.out.println(isSumPossibleHashMethod(a, sum));
    }

    /*private static boolean isSumPossibleBruteForce(int[] a,int sum){
        boolean result = false;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i] + a[j] == sum){
                    return true;
                }
            }
        }

        return result;
    }*/

    private static boolean isSumPossibleHashMethod(int[] a, int sum){
        boolean result = false;

        Set<Integer> integerSet = new HashSet<Integer>();

        for(int i=0;i<a.length;i++){
            if(integerSet.contains(a[i])){
                return true;
            }else{
                integerSet.add(sum - a[i]);
            }
        }

        return result;
    }


}
