package Arrays;

import sort.ArrayConstants;

import java.util.Arrays;

/**
 * Created by Sathvik on 14/01/16.
 */
public class Array18 {

    //How to rearrange array in alternating positive and negative number?

    private static boolean typeSearch = true;

    public static void main(String args[]){
        //int[] a = new int[]{1,-4,22,-26,22,-8};
        int[] a = new int[]{-1, 2, -3, 4, 5, -7, 8, 9,-10,-11};

        System.out.println(Arrays.toString(alternatingPosNeg(a)));

    }

    private static int[] alternatingPosNeg(int[] a) {

        int pivot= 0;

        for(int i=0;i< a.length;i++){
            if(a[i] < 0){
                for(int j=i;j<a.length;j++){
                    if(a[j] > 0){
                        swap(a,i,j);
                        pivot =i;
                    }
                }
            }
        }

        if(a[pivot+1] > 0){
            while(a[pivot] > 0){
                pivot ++;
            }
        }else{
            pivot ++;
        }

        for(int i=1;i<a.length && pivot < a.length;i+=2){
            swap(a,i,pivot);
            pivot++;
        }

        return a;
    }

    private static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
