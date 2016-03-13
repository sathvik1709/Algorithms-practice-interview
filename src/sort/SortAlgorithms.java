package sort;

import java.util.Arrays;

/**
 * Created by Sathvik on 08/11/15.
 */
public class SortAlgorithms {

    static ArrayConstants arrayConstants;

    public static void main(String[] args) {
        arrayConstants = new ArrayConstants();
        arrayConstants.printArray((new ArrayConstants().getUnSortedArray()));

        System.out.println("Insertion Sort");
        insertionSortAlgo(new ArrayConstants().getUnSortedArray());
        System.out.println("Selection Sort");
        selectionSortAlgo(new ArrayConstants().getUnSortedArray());
        System.out.println("Bubble Sort");
        bubbleSortAlgo(new ArrayConstants().getUnSortedArray());
        System.out.println("Merge Sort");
        mergeSortAlgo(new ArrayConstants().getUnSortedArray());
    }

    static void insertionSortAlgo(int[] array) {

        int key;

        for (int i = 1; i < array.length; i++) {
            key = array[i];
            for (int j = 0; j <= i; j++) {
                if (key < array[j]) {
                    // swap
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        arrayConstants.printArray(array);
    }

    static void selectionSortAlgo(int[] array) {

        //int minElement = array[0];
        int minPos = 0;

        for (int i = 0; i < array.length; i++) {
            minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPos]) {
                    minPos = j;
                }
            }

            int temp = array[i];
            array[i] = array[minPos];
            array[minPos] = temp;
        }

        arrayConstants.printArray(array);

    }

    static void bubbleSortAlgo(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        arrayConstants.printArray(array);

    }

    static void mergeSortAlgo(int[] array) {
        int[] mergeSortArray = mergeSort(array);
        arrayConstants.printArray(mergeSortArray);
    }

    static int[] mergeSort(int[] array) {


        if (array.length == 1) {
            return array;
        }

        int[] first = new int[array.length / 2];
        int[] second = new int[array.length - first.length];
        System.arraycopy(array, 0, first, 0, first.length);
        System.arraycopy(array, first.length, second, 0, second.length);

        mergeSort(first);
        mergeSort(second);

        merge(first, second, array);
        return array;

    }

    static void merge(int[] first,int[] second,int[] result) {
        int iFirst = 0;
        // Next element to consider in the second array
        int iSecond = 0;

        // Next open position in the result
        int j = 0;
        // As long as neither iFirst nor iSecond is past the end, move the
        // smaller element into the result.
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
            } else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }

        // copy what's left
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }





}
