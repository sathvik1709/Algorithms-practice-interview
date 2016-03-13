package datastructures.heap;

/**
 * Created by Sathvik on 14/02/16.
 */
public class HeapDSMainDriver {

    public static void main(String[] args){

        MaxHeapDataStructure heapDataStructure = new MaxHeapDataStructure();
        heapDataStructure.insert(15);
        heapDataStructure.insert(18);
        heapDataStructure.insert(21);
        heapDataStructure.insert(65);
        heapDataStructure.insert(63);
        heapDataStructure.insert(75);
        heapDataStructure.insert(36);
        heapDataStructure.insert(89);
        heapDataStructure.insert(70);
        heapDataStructure.insert(90);

        System.out.println(heapDataStructure);

        heapDataStructure.delete(90);
        heapDataStructure.delete(75);
        heapDataStructure.delete(89);

        System.out.println(heapDataStructure);



    }

}

