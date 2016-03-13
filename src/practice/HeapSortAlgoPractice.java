package practice;

import sort.ArrayConstants;

import java.util.Arrays;

/**
 * Created by Sathvik on 16/02/16.
 */
public class HeapSortAlgoPractice {

    static ArrayConstants arrayConstants;
    static int heapSize;

    public static void main(String[] args) {
        arrayConstants = new ArrayConstants();

        int[] array =arrayConstants.getRandomUniqueNumbers(10);

        System.out.println(Arrays.toString(array));

        sort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] a){
        heapify(a);
        for(int i = heapSize;i > 0;i--){
            swap(a,i,0);
            heapSize -= 1;
            buildMaxHeap(a,0);
        }
    }

    private static void heapify(int[] a){
        heapSize = a.length -1;
        for(int i=heapSize/2;i >= 0;i--){
            buildMaxHeap(a,i);
        }
    }

    private static void buildMaxHeap(int[] a, int i) {
        int left = 2*i;
        int right = 2*i + 1;
        int max = i;

        if(left <= heapSize && a[left] > a[i]) max = left;
        if(right <= heapSize && a[right] > a[max]) max = right;

        if(max != i){
            swap(a,max,i);
            buildMaxHeap(a,max);
        }

    }

    private static void swap(int[] a, int max, int i) {
        int temp = a[i];
        a[i] = a[max];
        a[max] = temp;
    }


}
