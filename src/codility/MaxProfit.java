package codility;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Sathvik on 28/01/16.
 */
public class MaxProfit {

    public static void main(String[] args){
        int[] a = new int[]{ 23171, 21011 ,21123 ,21366 ,21013 ,21367};

        System.out.println(solution(a));

    }

    public static int solution(int[] A){

        Queue<Integer> queue = new LinkedList<>();

        int lastPushedElement = 0;

        for(int i=0;i< A.length;i++){
            if(queue.isEmpty()){
                queue.add(A[i]);
                lastPushedElement = A[i];
            }
            else{
                if(A[i] < lastPushedElement){
                    queue.add(A[i]);
                    lastPushedElement = A[i];
                }
            }
        }

        int currProfit = 0;
        int maxProfit = 0;

        int lastPoppedElement = 0;

        for(int i=0;i<A.length;i++){
            if(!queue.isEmpty() && queue.element() == A[i]){
                lastPoppedElement = A[i];
                queue.remove();
            }else{
                currProfit = A[i] - lastPoppedElement;
                if(currProfit > maxProfit){
                    maxProfit = currProfit;
                }
            }

        }

        return maxProfit;
    }

    //https://codility.com/demo/results/trainingWF2JZ5-ZNU/

}
