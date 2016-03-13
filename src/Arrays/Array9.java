package Arrays;

import sort.ArrayConstants;

import java.util.Arrays;

/**
 * Created by Sathvik on 10/11/15.
 */
public class Array9 {

    //Write a program to find intersection of two sorted array in Java?

    static ArrayConstants arrayConstants;

    public static void main(String args[]){
        arrayConstants = new ArrayConstants();

        intersectionOfTwoArrays(arrayConstants.getRandomArray(10), arrayConstants.getRandomArray(10));

    }

    private static void intersectionOfTwoArrays(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int[] result = new int[a.length];
        int resultIndex = 0;

        int currentElement;

        for(int i=0;i<a.length;i++){
            currentElement = a[i];
            for(int j=i;j<b.length;j++){
                if(currentElement == b[j]){
                    result[resultIndex++] = a[i];
                }
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(result));

    }


}
