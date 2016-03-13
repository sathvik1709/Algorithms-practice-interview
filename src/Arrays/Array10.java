package Arrays;

import sort.ArrayConstants;

import java.util.Arrays;

/**
 * Created by Sathvik on 10/11/15.
 */
public class Array10 {
    //There is an array with every element repeated twice except one. Find that element?
    static ArrayConstants arrayConstants;

    public static void main(String args[]){
        arrayConstants = new ArrayConstants();

        int[] a = new int[]{1,1,2,2,3,3,4,4,5,5,6};
        int[] b = new int[]{1, 1, 2, 2, 3,3, 4, 4, 5};



        findNonRepeatedElement(a);
        findNonRepeatedElement(b);
    }

    private static void findNonRepeatedElement(int[] a) {
        Arrays.sort(a);

        for(int i=0;i<a.length;i+=2){

            if(i+1 < a.length && a[i] != a[i+1]){
                System.out.println(a[i]);
                break;
            }else if(i+1 == a.length){
                System.out.println(a[i]);
                break;
            }

        }
    }
}
