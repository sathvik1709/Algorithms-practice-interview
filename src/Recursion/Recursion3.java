package Recursion;

import Arrays.Array;
import sort.ArrayConstants;

import java.util.Arrays;

/**
 * Created by Sathvik on 10/11/15.
 */
public class Recursion3 {

    //Recursive Algorithm for Sequential Search

    static ArrayConstants arrayConstants;

    public static void main(String args[]){

        arrayConstants = new ArrayConstants();

        int[] a = arrayConstants.getRandomArray(10);

        int index = searchSequential(a,0,a.length-1,14);
        System.out.println(Arrays.toString(a));
        System.out.println(index +"->"+a[index]);
    }

    private static int searchSequential(int[] a,int i,int j,int x) {

        if(i<=j){
            if(a[i] == x){
                return i;
            }else{
                return searchSequential(a,i+1,a.length-1,x);
            }
        }else{
            return 0;
        }

    }


}
