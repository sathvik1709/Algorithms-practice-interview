package Arrays;

import sort.ArrayConstants;

import java.util.Arrays;

/**
 * Created by Sathvik on 11/11/15.
 */
public class Array16 {

    //How to find top two numbers from an integer array?
    static ArrayConstants arrayConstants;

    public static void main(String args[]){
        arrayConstants = new ArrayConstants();

        int[] a = arrayConstants.getRandomArray(20);

        System.out.println(Arrays.toString(a));
        findTopTwoNumbers(a);

    }

    private static void findTopTwoNumbers(int[] a) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            if(a[i] > max1){
                max2 = max1;
                max1 = a[i];
            }else if(a[i] > max2){
                max2 = a[i];
            }
        }

        System.out.println(max1+" - "+max2);
    }
}
