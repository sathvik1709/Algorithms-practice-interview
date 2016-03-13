package codility;

import java.util.*;

/**
 * Created by Sathvik on 22/01/16.
 */
public class NumberOdDiscIntersection {

    /*We draw N discs on a plane. The discs are numbered from 0 to N ?
    1. A zero-indexed array A of N non-negative integers, specifying the radiuses of the discs, is given.
    The J-th disc is drawn with its center at (J, 0) and radius A[J].

    We say that the J-th disc and K-th disc intersect if J ? K and the J-th and K-th discs have at least one common point (assuming that the discs contain their borders).

    The figure below shows discs drawn for N = 6 and A as follows:

    A[0] = 1
    A[1] = 5
    A[2] = 2
    A[3] = 1
    A[4] = 4
    A[5] = 0


    There are eleven (unordered) pairs of discs that intersect, namely:

    discs 1 and 4 intersect, and both intersect with all the other discs;
    disc 2 also intersects with discs 0 and 3.
    Write a function:

    class Solution { public int solution(int[] A); }

    that, given an array A describing N discs as explained above, returns the number of (unordered) pairs of intersecting discs. The function should return ?1 if the number of intersecting pairs exceeds 10,000,000.

    Given array A shown above, the function should return 11, as explained above.

    Assume that:

    N is an integer within the range [0..100,000];
    each element of array A is an integer within the range [0..2,147,483,647].
    Complexity:

    expected worst-case time complexity is O(N*log(N));
    expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
    Elements of input arrays can be modified.*/

    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 2, 1, 4, 0};
        //System.out.println(solution(a));
        System.out.println(solution2(a));

        //System.out.println(intersectingDiscs(a));
    }

    public static int solution2(int[] a){
        int result = 0;

        int[] start = new int[a.length];
        int[] ends = new int[a.length];

        for(int i=0;i<a.length;i++){
            int max = Math.max(0,i-a[i]);
            start[max]++;
            int min = Math.min(a.length-1,i+a[i]);
            ends[min]++;
        }

        int active_discs = 0;
        for(int i=0;i<a.length;i++){
            if(start[i] > 0){
                result += active_discs * start[i];
                result += start[i] * (start[i]-1)/2;
                active_discs += start[i];
            }

            active_discs -= ends[i];
        }

        return result;
    }

    public static int intersectingDiscs(int[] A) {
        int l = A.length;

        long[] A1 = new long[l];
        long[] A2 = new long[l];

        for (int i = 0; i < l; i++) {
            A1[i] = (long) A[i] + i;
            A2[i] = -((long) A[i] - i);
        }

        Arrays.sort(A1);
        Arrays.sort(A2);

        long cnt = 0;

        for (int i = A.length - 1; i >= 0; i--) {
            int pos = Arrays.binarySearch(A2, A1[i]);
            if (pos >= 0) {
                while (pos < A.length && A2[pos] == A1[i]) {
                    pos++;
                }
                cnt += pos;
            } else { // element not there
                int insertionPoint = -(pos + 1);
                cnt += insertionPoint;
            }

        }

        long sub = (long) l * ((long) l + 1) / 2;
        cnt = cnt - sub;

        if (cnt > 1e7) return -1;

        return (int) cnt;
    }

    public static int solution(int[] a) {
        // write your code in Java SE 8
        int result = 0;
        int[] dps = new int[a.length];
        int[] dpe = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int maxa = Math.max(0, i - a[i]);
            dps[maxa]++;
            int mina = Math.min(a.length - 1, i + a[i]);
            dpe[mina]++;
        }

        int t = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("----i:" + i);
            if (dps[i] > 0) {
                System.out.println("i:" + i + " --dps[i] : " + dps[i]);
                result += t * dps[i];
                System.out.println("res: " + result);
                result += dps[i] * (dps[i] - 1) / 2;
                System.out.println("res: " + result);
                t += dps[i];
                System.out.println("t: " + t);
            }
            if (result > 10000000) {
                return -1;
            }
            t -= dpe[i];
            System.out.println("t: " + t);
        }

        return result;

         /*
    * This is easy. Intiially we calculate all start and end points of discs.
    * After go by all line and check count of discs inside current point.
    * If in current point started some discs and intersection count increased by:
    *       already active distsc multiplied by count of started in current point (result += t * dps[i]) and
    *       count of intersections of started(result += dps[i] * (dps[i] - 1) / 2) eg.
    * if started 5 discs in one of point it will increased by(1+2+3+4+5 intersections, or 5*(5-1) / 2[sum formula]).
    * */

    /*In other words*/

    /*
    * 	What a brilliant solution! This should be the correct (more correct :)) answer.
    * 	Just to add a bit more explanation to what Tolia has.
    * 	Basically, we are keeping track of the current "active" disks at each location.
    * 	This is the value of t. Whenever a new disk starts at location i, it intersects with all existing disks at that location.
    * 	That's why we have result += t * dps[i].
    * 	We also need to add the number of intersections for all the disks that just started at location i, i.e.,
    * 	the number of intersections within themselves excluding whatever already existed(result += dps[i] * (dps[i] - 1) / 2)
    * */

    }


}
