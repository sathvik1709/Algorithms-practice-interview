package codility;

/**
 * Created by Sathvik on 19/01/16.
 */
public class CountDiv {

    /*
    * Write a function:

class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ? i ? B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Assume that:

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ? B.
Complexity:

expected worst-case time complexity is O(1);
expected worst-case space complexity is O(1).
    * */

    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int b = B/K;
        int a=0;
        if(A > 0){
            a = (A-1)/K;
        }
        if(A==0){
            b++;
        }

        return b-a;
    }

    /*
    * Explanation: All numbers in range A...B divisible by K, are the same numbers divisible by K in the range 0...B-A
    * so consider int b = B/k;
    *
    * if(A greater than 0){
    *   (A-1)/k
    *   why A-1 and not A.
    *   A/K will give number of divisors including A.
    *   so take A-1.
    * }
    *
    * include 0 if A==0
    * and increment b
    *
    *
    * */


}
