package sort;

import java.util.Arrays;

/**
 * Created by Sathvik on 09/11/15.
 */
public class HeapSortAlgorithm {

    static ArrayConstants arrayConstants;
    static int heapSize;

    public static void main(String[] args) {
        arrayConstants = new ArrayConstants();

        int[] array =arrayConstants.getRandomUniqueNumbers(10);

        System.out.println(Arrays.toString(array));

        sort(array);

        System.out.println(Arrays.toString(array));
    }

    //Sort Function *//*
    public static void sort(int arr[])
    {
        heapify(arr);
        for (int i = heapSize; i > 0; i--)
        {
            swap(arr,0, i);
            heapSize = heapSize-1;
            maxheap(arr, 0);
        }
    }
    //* Function to build a heap *//*
    public static void heapify(int arr[])
    {
        heapSize = arr.length-1;
        for (int i = heapSize/2; i >= 0; i--)
            maxheap(arr, i);
    }
    //* Function to swap largest element in heap *//*
    public static void maxheap(int arr[], int i)
    {
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= heapSize && arr[left] > arr[i])
            max = left;
        if (right <= heapSize && arr[right] > arr[max])
            max = right;

        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }
    //* Function to swap two numbers in an array *//*
    public static void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
