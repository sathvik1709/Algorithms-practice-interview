package Arrays;

import sort.ArrayConstants;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sathvik on 13/11/15.
 */
public class Array17 {

    //How to find the smallest positive integer value that cannot be represented as sum of any subset of a given array?

    static ArrayConstants arrayConstants;

    public static void main(String args[]) {

        arrayConstants = new ArrayConstants();

        int[] a = arrayConstants.getRandomUniqueNumbers(10);

        Arrays.sort(a);

        //System.out.println(findSmallest(a));


        /*int[] a1 = {1, 3, 4, 5};
        System.out.println(findSmallest(a1));*/
        int[] a2 = {1, 3, 4, 5, 6};
        System.out.println(findSmallest(a2));
        /*int[] a3 = {1, 1, 1, 1};
        System.out.println(findSmallest(a3));*/

    }


    private  static int findSmallest(int arr[]) {
        int res = 1; // Initialize result

        // Traverse the array and increment 'res' if arr[i] is
        // smaller than or equal to 'res'.
        for (int i = 0; i < arr.length; i++)
            if(arr[i] <= res){
                res = res + arr[i];
            }
        return res;
    }


}
