package Arrays;

import sort.ArrayConstants;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sathvik on 10/11/15.
 */
public class Array7 {

    //Write a program to remove duplicates from array in Java?

    static ArrayConstants arrayConstants;

    public static void main(String args[]){
        arrayConstants = new ArrayConstants();

        removeDuplicates(arrayConstants.getRandomArray(20));
    }

    private static void removeDuplicates(int[] r) {
        System.out.println(Arrays.toString(r));


        Set<Integer> integerSet = new HashSet<Integer>(r.length);

        for(int i=0;i<r.length;i++){
            if(integerSet.contains(r[i])){
                r[i] = 9999;
            }else{
                integerSet.add(r[i]);
            }
        }

        System.out.println(Arrays.toString(r));

    }

}
