package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sathvik on 14/01/16.
 */
public class Array19 {

    //How to find if there is a "sub array" with sum equal to zero

    public static void main(String[] args) {
        int[] a = new int[]{4, 2, -3, 1, 6};

        System.out.println(subsetSumZero(a));

    }

    private static boolean subsetSumZero(int[] a) {

        boolean result = false;

        // List<Integer> integerList = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            int sum =0;
            for (int j = i; j < a.length - 1; j++) {
                sum += a[j];
                if (sum == 0) {
                    System.out.println(i+"--"+j);
                    result = true;
                    break;
                }
            }
        }

        // System.out.println(integerList);

        return result;
    }


}
