package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Sathvik on 08/11/15.
 */
public class ArrayConstants {

    int[] unSortedArray = new int[]{84,69,76,86,94,91,91};

    public int[] getUnSortedArray() {
        return unSortedArray;
    }

    public  void printArray(int[] array1){
        System.out.println(Arrays.toString(array1));
    }

    public int[] getRandomArray(int length){
        int[] randoms = new int[length];
        for(int i=0; i<length; i++){
            randoms[i] = (int) (Math.random()*15);
        }
        return randoms;
    }

    public int[] getRandomUniqueNumbers(int size){
        int[] randoms = new int[size];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<=size; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i=0; i<size; i++) {
            randoms[i]=list.get(i);
        }

        return randoms;
    }


}
