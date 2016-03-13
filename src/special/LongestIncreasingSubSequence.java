package special;

import sort.ArrayConstants;

import java.util.Arrays;

/**
 * Created by Sathvik on 11/01/16.
 */
public class LongestIncreasingSubSequence {

    public static void main(String[] args){
        int[] a = new int[]{3,2,6,4,5,1};
        //System.out.println(Arrays.toString(lis(a)));
       /* int r = increasingSubsequence(a);
        System.out.println(r);*/
        System.out.println(lis(a));

    }


    private static int lis(int[] array){
        int d[] = new int[array.length];

        d[0] = 1;

        for(int i=1;i<array.length;i++){
            int maxn =0;
            for(int j=0;j<i;j++){
                if(array[j] < array[i] && maxn < d[j]){
                    maxn = d[j];
                }
                d[i] = maxn+1;
            }
        }


        int maxi=0;
        for(int i=0;i<d.length;i++){
            if(d[i]>maxi){
                maxi=d[i];
            }
        }
        return maxi;

    }

  /*  public static int increasingSubsequence(int[]seq){
        int[] L=new int[seq.length];
        L[0]=1;
        for(int i=1;i<L.length;i++){
            int maxn=0;
            for(int j=0;j<i;j++){
                if(seq[j]<seq[i]&&L[j]>maxn){
                    maxn=L[j];
                }
            }
            L[i]=maxn+1;
        }
        int maxi=0;
        for(int i=0;i<L.length;i++){
            if(L[i]>maxi){
                maxi=L[i];
            }
        }
        return(maxi);
    }*/

}
