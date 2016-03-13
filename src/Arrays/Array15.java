package Arrays;

import sort.ArrayConstants;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sathvik on 11/11/15.
 */
public class Array15 {

    //How to find first non-repeating element in array of integers?

    static ArrayConstants arrayConstants;

    public static void main(String args[]){
        arrayConstants = new ArrayConstants();

        int[] a = arrayConstants.getRandomArray(10);
        System.out.println(Arrays.toString(a));
        findFirstNonRepeatingElement(a);

    }

    private static void findFirstNonRepeatingElement(int[] a) {

        Map<Integer,Integer> integerMap = new HashMap<Integer,Integer>();

        for(int i=0;i<a.length;i++){
            if(integerMap.containsKey(a[i])){
                integerMap.put(a[i],integerMap.get(a[i])+1);
            }else{
                integerMap.put(a[i],1);
            }
        }

        for(int i=0;i<a.length;i++){
            if(integerMap.get(a[i])==1){
                System.out.println(a[i]);
                break;
            }
        }

        System.out.println(integerMap);

    }
}
