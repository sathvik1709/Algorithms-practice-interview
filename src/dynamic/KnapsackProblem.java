package dynamic;

import java.util.Arrays;

/**
 * Created by Sathvik on 03/02/16.
 */
public class KnapsackProblem {

    public static void main(String[] args){
        int[] wt = new int[]{2,3,4,5};
        int[] val = new int[]{3,4,5,6};

        //knapsack2(6,2000);
        knapsack(wt,val,5);
    }

    private static void knapsack(int[] weightArray,int[] valueArray, int w){

        int totalItems = weightArray.length;
        int totalWeight = w;

        int[][] d = new int[totalItems+1][totalWeight+1];

        for(int i=0;i<= totalItems;i++){
            d[i][0] = 0;
        }

        for(int i=0;i< totalWeight;i++){
            d[0][i] = 0;
        }

        for(int i=1;i <= totalItems;i++){
            for(int j=1;j<=totalWeight;j++){

                int opt1 = d[i-1][j];

                int opt2 =0;
                //int kkk = j-weightArray[i];
                if(j-weightArray[i-1] >= 0){
                    opt2 = valueArray[i-1]+ d[i-1][j-weightArray[i-1]];
                }

                d[i][j] = Math.max(opt1,opt2);

            }
        }

        System.out.println("Total weight that can be carried: "+d[totalItems][totalWeight]);

        System.out.println("Item no's that can be carried:");
        for(int k=totalItems;k>0;k--){
            if(d[k][totalWeight] != d[k-1][totalWeight]){
                System.out.println(k);
            }
        }

        // To calculate the number of items to be carried

        /* Check the weight matrix
        for(int k=0;k<=totalItems;k++){
            System.out.println(Arrays.toString(d[k]));
        }*/


    }

    private static void knapsack2(int i,int j){
        int N = i;   // number of items
        int W = j;   // maximum weight of knapsack

        int[] profit = new int[N+1];
        int[] weight = new int[N+1];

        // generate random instance, items 1..N
        for (int n = 1; n <= N; n++) {
            profit[n] = (int) (Math.random() * 1000);
            weight[n] = (int) (Math.random() * W);
        }

        // opt[n][w] = max profit of packing items 1..n with weight limit w
        // sol[n][w] = does opt solution to pack items 1..n with weight limit w include item n?
        int[][] opt = new int[N+1][W+1];
        boolean[][] sol = new boolean[N+1][W+1];

        for (int n = 1; n <= N; n++) {
            for (int w = 1; w <= W; w++) {

                // don't take item n
                int option1 = opt[n-1][w];

                // take item n
                int option2 = Integer.MIN_VALUE;
                if (weight[n] <= w) option2 = profit[n] + opt[n-1][w-weight[n]];

                // select better of two options
                opt[n][w] = Math.max(option1, option2);
                sol[n][w] = (option2 > option1);
            }
        }

        // determine which items to take
        boolean[] take = new boolean[N+1];
        for (int n = N, w = W; n > 0; n--) {
            if (sol[n][w]) { take[n] = true;  w = w - weight[n]; }
            else           { take[n] = false;                    }
        }

        // print results
        System.out.println("item" + "\t" + "profit" + "\t" + "weight" + "\t" + "take");
        for (int n = 1; n <= N; n++) {
            System.out.println(n + "\t" + profit[n] + "\t" + weight[n] + "\t" + take[n]);
        }
    }

}
