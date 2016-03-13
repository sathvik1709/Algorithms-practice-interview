package datastructures.heap;

import java.util.Arrays;

/**
 * Created by Sathvik on 14/02/16.
 */
public class MaxHeapDataStructure {

    /* Complexity
    Insert : O(log(n))
    delete : O(log(n) + n) => O(n)
    Peek : O(1)
    */

    private int currentHeapLength = 0;
    private final int maxCapacity = 20;
    private int[] heapArray = new int[maxCapacity];

    public void insert(int item) {
        if (currentHeapLength + 1 <= maxCapacity) {
            heapArray[currentHeapLength] = item;
            currentHeapLength++;
            filterUp(currentHeapLength - 1);
        } else {
            ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
            throw e;
        }
    }

    public void delete(int item) {

        int deleteIndex = getIndexOfItem(item);
        if (deleteIndex >= 0) {
            if (deleteIndex == currentHeapLength - 1) {
                heapArray[currentHeapLength - 1] = 0;
            }else{
                swapInt(deleteIndex,currentHeapLength-1);
                heapArray[currentHeapLength-1] = 0;
                if(heapArray[deleteIndex] > heapArray[getParentIndex(deleteIndex)]){
                    filterUp(deleteIndex);
                }else{
                    filterDown(deleteIndex);
                }
            }
            currentHeapLength -= 1;
        } else {
            ArrayIndexOutOfBoundsException a = new ArrayIndexOutOfBoundsException();
            throw a;
        }

    }

    // Helper functions for insert and delete operations
    private void filterUp(int index) {
        int parentIndex = getParentIndex(index);
        if (parentIndex >= 0
                && heapArray[parentIndex] < heapArray[index]) {
            swapInt(parentIndex, index);
            filterUp(parentIndex);
        }
    }

    private void filterDown(int index){
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;

        if(leftChildIndex < currentHeapLength && rightChildIndex < currentHeapLength){
            int swapIndex = getMaxOfChildren(leftChildIndex,rightChildIndex);
            swapInt(swapIndex,index);
            filterDown(swapIndex);
        }

    }

    // Peek and Size methods
    public int heapLength(){
        return heapArray.length;
    }

    public int peek(){
        return heapArray[0];
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");
        for(int i=0;i< currentHeapLength;i++){
            stringBuilder.append(heapArray[i]);
            if(i != currentHeapLength-1){
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    // For building heap
    private void buildMaxHeap() {

        int heapSize = (int) Math.floor(heapArray.length / 2);

        for (int i = heapSize; i >= 0; i--) {
            maxHeapify(i);
        }

    }

    private void maxHeapify(int index) {

        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;

        if (left < heapArray.length && heapArray[left] > heapArray[largest]) {
            largest = left;
        }
        if (right < heapArray.length && heapArray[right] > heapArray[largest]) {
            largest = right;
        }

        if (largest != index) {
            swapInt(index, largest);
            maxHeapify(largest);
        }

    }

    // Helper function
    private void swapInt(int i, int j) {
        int temp = heapArray[i];
        heapArray[i] = heapArray[j];
        heapArray[j] = temp;
    }

    private int getParentIndex(int index) {
        return (int) Math.floor(index / 2);
    }

    private int getIndexOfItem(int item) {

        for (int i = 0; i < heapArray.length; i++) {
            if (heapArray[i] == item) return i;
        }

        return -1;
    }

    private int getMaxOfChildren(int leftChildIndex, int rightChildIndex) {
        if(heapArray[leftChildIndex] > heapArray[rightChildIndex]){return leftChildIndex;}
        else{ return rightChildIndex;}
    }

}
