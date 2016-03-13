package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Sathvik on 10/11/15.
 */
public class Array1 {

    //How to Remove Duplicates from Array without using Java Collection API
    // Note: removed elements/duplicates will be replaced with 1000

    public static void main(String[] args){
        int[] array = new int[]{1, 1, 2, 2, 2, 4, 5};
        Arrays.sort(array);

        for(int i=1;i<array.length;i++){
            if(array[i-1] == array[i]){
                array[i-1] = 1000;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
