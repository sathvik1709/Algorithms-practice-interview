package Arrays;

import sort.ArrayConstants;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sathvik on 10/11/15.
 */
public class Array5 {

    //How to find all pairs on integer array whose sum is equal to given number?

    static int sum = 7;
    static ArrayConstants arrayConstants;

    public static void main(String args[]){
        arrayConstants = new ArrayConstants();

        int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
        printPairs(numbersWithDuplicates);
        printPairs2(numbersWithDuplicates);

    }

    private static void printPairs(int[] a) {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i != j){
                    if(a[i] + a[j] == sum){
                        System.out.println("("+a[i]+","+a[j]+")");
                    }
                }
            }
        }
    }

    private static void printPairs2(int[] b){

        Set<Integer> integers = new HashSet<Integer>();
        for(int i : b){
            integers.add(i);
        }

        System.out.println(integers);

        for(int v:b){
            int target;
            target = sum - v;
            if(integers.contains(target)){
                System.out.println("("+target+","+v+")");
            }
        }

    }
}
