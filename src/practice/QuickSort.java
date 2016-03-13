package practice;

import sort.ArrayConstants;

/**
 * Created by Sathvik on 02/02/16.
 */
public class QuickSort {

    static ArrayConstants arrayConstants;
    static int[] array;

    public static void main(String[] args){

        arrayConstants = new ArrayConstants();
        array = arrayConstants.getRandomUniqueNumbers(10);

        arrayConstants.printArray(array);

        quickSort(array,0, array.length - 1);

        arrayConstants.printArray(array);
    }

    private static void quickSort(int[] array,int i,int j){

        if(i < j){
            int n = partition(array,i,j);
            quickSort(array,i,n-1);
            quickSort(array,n+1,j);
        }

    }

    private static int partition(int[] array,int start,int end){
        int partitionIndex = start;
        int pivot = array[end];

        for(int i=start;i<end;i++){
            if(array[i] <= pivot){
                swap(i,partitionIndex,array);
                partitionIndex++;
            }
        }

        swap(end,partitionIndex,array);

        return partitionIndex;

    }

    private static void swap(int i,int j,int[] a){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
