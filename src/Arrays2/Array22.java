package Arrays2;

import java.util.Arrays;

/**
 * Created by Sathvik on 15/01/16.
 */
public class Array22 {

    //Find maximum average "subarray" of k length
    public static  void main(String[] args){

        int a[] = new int[]{1,12,-5,-6,50,3};

        System.out.println("Max average sub-array sum begins at index : "+maximumAverageSubArray(a,4));
    }

    private static int maximumAverageSubArray(int[] a,int k){

        int[] cSum = new int[a.length];

        cSum[0] = a[0];

        for(int i=1;i<a.length;i++){
            cSum[i] = cSum[i-1] + a[i];
        }

        int maxSum = cSum[k-1];
        int maxIndex = k-1;

        //System.out.println(Arrays.toString(cSum));
        for(int i=k;i<a.length;i++){

            int currentSum = cSum[i] - cSum[i-k];

            if(currentSum > maxSum){
                maxSum = currentSum;
                maxIndex = i;
            }

        }

        return maxIndex - k+1;
    }

}
