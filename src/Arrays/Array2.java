package Arrays;

import java.util.Arrays;

/**
 * Created by Sathvik on 10/11/15.
 */
public class Array2 {

    //How to find missing number in integer array of 1 to 100?

    public static void main(String[] args){

        int[] array = new int[100];
        // fill array with 100 values
        for(int i=0;i<100;i++){
            array[i] = i+1;
        }
        // make the missing element, say 45 to 0, as missing
        array[45] = 0;

        // calculate actual sum
        int actualSum = 0;
        for(int i =0;i<array.length;i++){
            actualSum += array[i];
        }

        // calculate expected sum
        int expectedSum = 0;
        expectedSum = array.length*(array.length + 1)/2;

        System.out.println(expectedSum-actualSum);

    }
}
