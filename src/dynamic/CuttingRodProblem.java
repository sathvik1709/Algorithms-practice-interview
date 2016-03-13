package dynamic;

import java.util.Arrays;

/**
 * Created by Sathvik on 05/02/16.
 */
public class CuttingRodProblem {

    public static void main(String[] args){

        int[] prices = new int[]{2,5,7,8};
        int[] lengths = new int[]{1,2,3,4};
        int n=5;
        getMaxProfit(lengths,prices,n);

    }

    private static void getMaxProfit(int[] lengths,int[] prices,int n){

        int totalLength = n;
        int totalPieces = prices.length;

        int[][] res = new int[totalPieces+1][totalLength+1];

        for(int i=0;i<=totalPieces;i++){
            res[i][0] = 0;
        }

        for(int i=0;i<=totalLength;i++){
            res[0][i] = 0;
        }

        for(int i=1;i<=totalPieces;i++){
            for(int j=1;j<= totalLength;j++){

                int opt1 = res[i-1][j];

                int opt2; // = res[i][j-lengths[i-1]] + prices[i-1];
                if(j-lengths[i-1] >=0){
                    opt2 = res[i][j-lengths[i-1]] + prices[i-1];
                }else{
                    opt2 = 0;
                }

                res[i][j] = Math.max(opt1,opt2);
            }
        }

        for(int i=0;i<=totalPieces;i++){
            System.out.println(Arrays.toString(res[i]));
        }

        // Print result
        System.out.println("The maximum profit: "+res[totalPieces][totalLength]);

    }

}
