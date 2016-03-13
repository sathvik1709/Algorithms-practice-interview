package codility;

import java.util.Arrays;

/**
 * Created by Sathvik on 20/01/16.
 */
public class GenomicRangeQuery {

    public static void main(String[] args){

        int[] P = new int[]{2,5,0};
        int[] Q = new int[]{4,5,6};

        /*System.out.println(Arrays.toString(solution("CAGCCTA",P,Q)));
        System.out.println(Arrays.toString(solution2("CAGCCTA", P, Q)));*/

        solution2("CAGCCTA", P, Q);

    }

    public static int[] solution(String S, int[] P, int[] Q) {

        int[] strArray = new int[S.length()];
        int[] res = new int[P.length];

        for(int i =0;i<S.length();i++){
            if(S.charAt(i) == 'A'){strArray[i] = 1;}
            else if(S.charAt(i) == 'C'){strArray[i] = 2;}
            else if(S.charAt(i) == 'G'){strArray[i] = 3;}
            else if(S.charAt(i) == 'T'){strArray[i] = 4;}
        }

        int currentMin = 0;
        int min = 0;
        for(int i=0; i<P.length;i++ ){
            int startPoint = P[i];
            int endPoint = Q[i];
            min = Integer.MAX_VALUE;
            for(int j=startPoint;j<=endPoint;j++){
                currentMin = strArray[j];
                if(currentMin < min){
                    min = currentMin;
                }
            }
            res[i] = min;
        }

        return res;

    }

    public static int[] solution2(String S, int[] P,int[] Q){
        int len = S.length();
        int[][] arr = new int[len][4];
        int[] result = new int[P.length];

        for(int i = 0; i < len; i++){
            char c = S.charAt(i);
            if(c == 'A') arr[i][0] = 1;
            if(c == 'C') arr[i][1] = 1;
            if(c == 'G') arr[i][2] = 1;
            if(c == 'T') arr[i][3] = 1;
        }


        // compute prefixes
        for(int i = 1; i < len; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] += arr[i-1][j];
            }
        }



        printMatrix(arr);

        for(int i = 0; i < P.length; i++){
            int x = P[i];
            int y = Q[i];

            for(int a = 0; a < 4; a++){
                int sub = 0;
                if(x-1 >= 0) sub = arr[x-1][a];
                if(arr[y][a] - sub > 0){
                    result[i] = a+1;
                    break;
                }
            }

        }

        return result;
    }

    private static void printMatrix(int[][] a){

        for(int i=0;i< a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }

    }

}
