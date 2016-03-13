package Arrays;

import sort.ArrayConstants;

import java.util.Arrays;

/**
 * Created by Sathvik on 11/11/15.
 */
public class Array13 {
    static ArrayConstants arrayConstants;

    public static void main(String args[]){
        arrayConstants = new ArrayConstants();

        int[] a = arrayConstants.getRandomArray(10);
        int[] b = arrayConstants.getRandomArray(15);
        int[] c = arrayConstants.getRandomArray(20);

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        findCommonInAllThree2(a, b, c, a.length, b.length, c.length);// Recommended method

    }

    private static void findCommonInAllThree2(int[] a, int[] b, int[] c, int al, int bl, int cl) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < al && j < bl && k < cl){

            if(a[i] == b[j] && b[j] == c[k]){
                System.out.println(a[i]);
                i++;
                j++;
                k++;
            }else if(a[i] < b[j]){
                i++;
            }else if(b[j] < c[k]){
                j++;
            }else{
                k++;
            }
        }
    }
}
