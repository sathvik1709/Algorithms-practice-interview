package special;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sathvik on 14/01/16.
 */
public class AplusBequalsCplusD {

    public static void main(String[] args) {

        int[] a = new int[]{3, 4, 7, 1, 2, 9, 8};
        int[] b = new int[]{3, 4, 7, 1, 12, 9};
        int[] c = new int[]{65, 30, 7, 90, 1, 9, 8};

        findPairs(a);
        findPairs(b);
        findPairs(c);
    }

    private static void findPairs(int[] a) {

        Map<Integer, Pair> integerPairMap = new HashMap<Integer, Pair>();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (integerPairMap.get(a[i] + a[j]) == null) {
                    integerPairMap.put(a[i] + a[j], new Pair(a[i], a[j]));
                } else {
                    System.out.println(integerPairMap.get(a[i] + a[j]));
                    System.out.println(a[i] + "," + a[j]);
                    return;
                }
            }
        }

        System.out.println("No pairs found");

    }

}
