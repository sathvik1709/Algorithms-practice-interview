package Arrays;

import sort.ArrayConstants;

import java.util.*;

/**
 * Created by Sathvik on 10/11/15.
 */
public class Array11 {

    // How to find kth smallest element in unsorted array?

    static ArrayConstants arrayConstants;

    public static void main(String args[]){
        arrayConstants = new ArrayConstants();

        int[] aa = new int[]{1, 2, 3, 9, 4};

        findKthLowestElement(arrayConstants.getRandomArray(20),7);
        findKthLowestElement(aa,4);
        //findKthLowestElement2(arrayConstants.getRandomArray(20), 2);

    }

    private static void findKthLowestElement(int[] a, int k) {

        System.out.println(Arrays.toString(a));

        int minPos = 0;

        for (int i = 0; i < a.length; i++) {
            minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minPos]) {
                    minPos = j;
                }
            }

            int temp = a[i];
            a[i] = a[minPos];
            a[minPos] = temp;

            if(i==k)break;
        }

        System.out.println((a[k-1]));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));




    }


}
