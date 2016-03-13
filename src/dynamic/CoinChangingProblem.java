package dynamic;

import java.util.Arrays;

/**
 * Created by Sathvik on 28/01/16.
 */
public class CoinChangingProblem {

    // Dynamic Programming

    /*
    Given a value N, if we want to make change for N cents,
    and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins,
    how many ways can we make the change?
    The order of coins doesn’t matter.

    For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4.
    For N = 10 and S = {2, 5, 3, 6}, there are five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}.
    So the output should be 5.
    */

    public static void main(String[] args){

        // Minimum number of coins required
        int[] s = new int[]{1,3,4};
        //System.out.println(getMinCoinsRequired(6, s));

        // To get maximum number of ways in which N value can be obtained with given coins
        //int[] c = new int[]{2,3,5,6};
        //System.out.println(getNumberOfWays(c,10));

        //System.out.println(solution(c,10));
        //250 24
        //
        int[] c = new int[]{41, 34, 46, 9, 37, 32, 42, 21, 7, 13, 1, 24, 3, 43, 2, 23, 8, 45, 19, 30, 29, 18, 35, 11};
        System.out.println(getNumberOfWays(c,250));

    }

    private static int getMinCoinsRequired(int n,int[] c){

        int numberOfCoins = n;
        int numberOfCoinTypes = c.length;

        int[][] res = new int[numberOfCoinTypes][numberOfCoins+1];

        for(int i=0;i< numberOfCoinTypes;i++){
            res[i][0] = 0;
        }

        for(int i=0;i< numberOfCoinTypes;i++){
            for(int j=1;j<=numberOfCoins;j++){

                int opt1 = Integer.MAX_VALUE;
                int opt2 = Integer.MAX_VALUE;

                if(i-1 >= 0){
                    opt1 = res[i-1][j];
                }

                if(j-c[i] >= 0){
                    opt2 = res[i][j-c[i]]+1;
                }

                res[i][j] = Math.min(opt1, opt2);

            }
        }

        for(int k=0;k<numberOfCoinTypes;k++){
            System.out.println(Arrays.toString(res[k]));
        }

        return res[numberOfCoinTypes-1][numberOfCoins];
    }

    private static int getNumberOfWays(int[] c,int n){

        Arrays.sort(c);

        int numberOfCoins = c.length;
        int totalAmount = n;

        int[][] res = new int[numberOfCoins+1][totalAmount+1];

        for(int i=0;i<=numberOfCoins;i++){
            res[i][0] = 1;
        }



        for(int i=1;i<=numberOfCoins;i++){
            for(int j=1;j<=totalAmount;j++){

                if(j-c[i-1] < 0){
                    res[i][j] = res[i-1][j];
                }else{
                    res[i][j] = res[i-1][j]+res[i][j-c[i-1]];
                }

            }
        }

        /*for(int k=0;k<=numberOfCoins;k++){
            System.out.println(Arrays.toString(res[k]));
        }*/


        return res[numberOfCoins][totalAmount];
    }

    private static int solution(int[] a,int n){

        int m = a.length;

        int x, y;

        // We need n+1 rows as the table is constructed in bottom up manner using
        // the base case 0 value case (n = 0)
        int table[][] = new int[n+1][m];

        // Fill the entries for 0 value case (n = 0)
        for (int i=0; i<m; i++)
            table[0][i] = 1;

        for (int i = 1; i < n+1; i++)
        {
            for (int j = 0; j < m; j++)
            {
                // Count of solutions including S[j]
                x = (i-a[j] >= 0)? table[i - a[j]][j]: 0;

                // Count of solutions excluding S[j]
                y = (j >= 1)? table[i][j-1]: 0;

                // total count
                table[i][j] = x + y;
            }
        }

        for(int i =0;i<table.length;i++){
            System.out.print(i + " ");
            for(int j =0;j<table[i].length;j++){
                System.out.print(table[i][j]+",");
            }
            System.out.println();
        }

        return table[n][m-1];

    }

}
