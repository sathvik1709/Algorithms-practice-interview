package Arrays;

import sort.ArrayConstants;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sathvik on 11/11/15.
 */
public class Array14 {

    //How find the first repeating element in an array of integers
    static ArrayConstants arrayConstants;

    public static void main(String args[]){
        arrayConstants = new ArrayConstants();

        int[] a = arrayConstants.getRandomArray(20);
        System.out.println(Arrays.toString(a));
        findFirstRepeatingElement(a);

    }

    private static void findFirstRepeatingElement(int[] array) {

        Set<Integer> integerSet = new HashSet<Integer>(array.length);
        int index=-1;

        for(int i=array.length-1;i>=0;i--){
            if(integerSet.contains(array[i])){
                index = i;
            }else{
                integerSet.add(array[i]);
            }
        }

        if(index != -1){
            System.out.println(array[index]);
        }

    }
}
