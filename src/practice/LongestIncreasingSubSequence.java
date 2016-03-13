package practice;

import java.util.Arrays;

/**
 * Created by Sathvik on 15/01/16.
 */
public class LongestIncreasingSubSequence {

    public static void main(String[] args){
        int[] a = new int[]{3,2,6,4,5,1};

        System.out.println(lis(a));

    }

    /*private static int lis(int[] a){

        int[] L = new int[a.length];

        L[0] = 1;

        for(int i=1;i<a.length;i++){
            int maxn =0;
            for(int j=0;j<i;j++){
                if(a[j] < a[i] && maxn < L[j]){
                    maxn = L[j];
                }
                L[i] = maxn+1;
            }
        }

        System.out.println(Arrays.toString(L));

        return 0;
    }*/

    private static int lis(int[] a){

        int[] l = new int[a.length];

        l[0]=1;

        for(int i=1;i<a.length;i++){
            int count = 0;
            for(int j=0;j<i;j++){
                if(a[j] < a[i] && count < l[j]){
                    count++;
                }
            }
            l[i] = count+1;
        }


        System.out.println(Arrays.toString(l));

        return 0;
    }

}
