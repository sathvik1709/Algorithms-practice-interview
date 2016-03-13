package sort;

/**
 * Created by Sathvik on 10/11/15.
 */
public class QuickSortAlgorithm {

    static ArrayConstants arrayConstants;
    static int[] array;

    public static void main(String[] args){

        arrayConstants = new ArrayConstants();
        array = arrayConstants.getUnSortedArray();

        quickSort(array,0, array.length - 1);

        arrayConstants.printArray(array);
    }

   private static void quickSort(int[] array,int start,int end){

       if(start < end){
           int pIndex = partition(array,start,end);
           quickSort(array,start,pIndex-1);
           quickSort(array,pIndex+1,end);

       }
   }

    private static int partition(int[] array,int start,int end){

        int pIndex=start;
        int pivot = array[end];

        for(int i=start;i<end;i++){
            if(array[i] <= pivot){
                swap(array,i,pIndex);
                pIndex++;
            }
        }

        swap(array,end,pIndex);
        return pIndex;
    }

    private static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
