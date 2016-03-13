package Arrays;

import sort.ArrayConstants;

import java.util.*;

/**
 * Created by Sathvik on 10/11/15.
 */
public class Array6 {

    // How to find repeated numbers in an array if it contains multiple duplicate?

    static ArrayConstants arrayConstants;

    public static void main(String args[]){
        arrayConstants = new ArrayConstants();
        findDuplicates(arrayConstants.getRandomArray(20));
    }

    private static void findDuplicates(int[] a) {

        System.out.println(Arrays.toString(a));

        Map<Integer, Integer> integerMap = new LinkedHashMap<Integer,Integer>(a.length);

        for(int i=0;i<a.length;i++){

            if(integerMap.containsKey(a[i])){
                integerMap.put(a[i],integerMap.get(a[i])+1);
            }else{
                integerMap.put(a[i],1);
            }

        }
        System.out.println(integerMap);
        Iterator ir = integerMap.entrySet().iterator();
        while (ir.hasNext()) {
            Map.Entry pair = (Map.Entry)ir.next();
            if((int)pair.getValue() > 1){
                System.out.println(pair.getKey());
            }
        }
    }


}
