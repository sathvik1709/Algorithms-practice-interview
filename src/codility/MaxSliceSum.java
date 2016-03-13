package codility;

/**
 * Created by Sathvik on 28/01/16.
 */
public class MaxSliceSum {

    /*
    A non-empty zero-indexed array A consisting of N integers is given. A pair of integers (P, Q), such that 0 ? P ? Q < N, is called a slice of array A. The sum of a slice (P, Q) is the total of A[P] + A[P+1] + ... + A[Q].

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns the maximum sum of any slice of A.

For example, given array A such that:

A[0] = 3  A[1] = 2  A[2] = -6
A[3] = 4  A[4] = 0
the function should return 5 because:

(3, 4) is a slice of A that has sum 4,
(2, 2) is a slice of A that has sum ?6,
(0, 1) is a slice of A that has sum 5,
no other slice of A has sum greater than (0, 1).
Assume that:

N is an integer within the range [1..1,000,000];
each element of array A is an integer within the range [?1,000,000..1,000,000];
the result will be an integer within the range [?2,147,483,648..2,147,483,647].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
    */

    public static void main(String[] args){
        int[] a = new int[]{1,-2,-3,4,5};

        int[] a1 = new int[]{1,1};
        System.out.println(solution(a));
        maxContiguousSum(a);
        //https://codility.com/demo/results/trainingD94J3C-PFU/
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        int max = A[0];
        int maxEndingHere = A[0];

        for(int i=1;i<A.length;i++){
            maxEndingHere = Math.max(A[i],maxEndingHere+A[i]);
            max = Math.max(max,maxEndingHere);
        }

        return max;
    }

    //{1,-2,-3,4,5}
    private static void maxContiguousSum(int[] a){

        int start = 0;
        int end = 0;

        int runningSum = a[0];
        int max = a[0];

        for(int i=1;i<a.length;i++){

            if(runningSum + a[i] > a[i]){
                runningSum = runningSum + a[i];
                end = i;
            }else{
                runningSum = a[i];
                start = i;
                end = i;
            }

            if(runningSum > max){
                max = runningSum;
                end = i;
            }
        }

        System.out.println("Max sum: "+max);
        System.out.println("Start: "+start+ " End: "+end);
    }

}
