package Arrays;

import sort.ArrayConstants;

/**
 * Created by Sathvik on 10/11/15.
 */
public class Array4 {

    //How to find largest and smallest number in unsorted array?


    static int smallest = Integer.MAX_VALUE;
    static int largest = Integer.MIN_VALUE;
    static ArrayConstants arrayConstants;

    public static void main(String args[]){
        arrayConstants = new ArrayConstants();
        findLargestAndSmallest(arrayConstants.getUnSortedArray());
    }

    private static void findLargestAndSmallest(int[] array) {
        for(int i=0;i<array.length;i++){
            if(array[i] < smallest){
                smallest = array[i];
            }else if(array[i] > largest){
                largest = array[i];
            }
        }

        System.out.println(largest+"  "+smallest);
    }
}
