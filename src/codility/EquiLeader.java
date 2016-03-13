package codility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sathvik on 27/01/16.
 */
public class EquiLeader {

    //https://codility.com/demo/results/trainingRNS5C8-SUV/

    /*

    A non-empty zero-indexed array A consisting of N integers is given.

The leader of this array is the value that occurs in more than half of the elements of A.

An equi leader is an index S such that 0 ? S < N ? 1
and two sequences A[0], A[1], ..., A[S]
and A[S + 1], A[S + 2], ..., A[N ? 1] have leaders of the same value.

For example, given array A such that:

    A[0] = 4
    A[1] = 3
    A[2] = 4
    A[3] = 4
    A[4] = 4
    A[5] = 2
we can find two equi leaders:

0, because sequences: (4) and (3, 4, 4, 4, 2) have the same leader, whose value is 4.
2, because sequences: (4, 3, 4) and (4, 4, 2) have the same leader, whose value is 4.
The goal is to count the number of equi leaders.

Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty zero-indexed array A consisting of N integers, returns the number of equi leaders.

For example, given:

    A[0] = 4
    A[1] = 3
    A[2] = 4
    A[3] = 4
    A[4] = 4
    A[5] = 2
the function should return 2, as explained above.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [?1,000,000,000..1,000,000,000].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.

    */

    int finalLedCount = 0;

    public int solution(int[] A) {
        // write your code in Java SE 8


        int leader = getLeader(A);
        int totalLedCount = finalLedCount;

        if(totalLedCount < A.length/2){return 0;}

        int countOnLeft = 0;
        int countOnRight = 0;
        int result = 0;

        for(int i=0;i<A.length;i++){

            if(A[i] == leader){
                countOnLeft += 1;
            }

            countOnRight = totalLedCount - countOnLeft;

            if(countOnLeft > ((i+1)/2) && countOnRight > ((A.length-1-i)/2)){
                result ++;

            }
        }


        return result;
    }

    public int getLeader(int[] A){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i< A.length;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }
        }

        int resKey = -1;
        int ledCount = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > A.length/2){
                resKey = key;
                ledCount = value;
            }
        }

        if(resKey == -1) return -1;

        finalLedCount = ledCount;
        return resKey;

    }

}
