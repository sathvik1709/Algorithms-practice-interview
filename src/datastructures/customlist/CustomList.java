package datastructures.customlist;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Sathvik on 11/02/16.
 */
final public class CustomList<T> {

    // size-
    //add-
    //remove(int index)-
    // add(int index)-
    // sort
    //addAll
    // clear

    int size = 0;
    int capacity = 20;
    T[]  mainArray;

    public CustomList() {
        createArray(20);
    }

    private void createArray(int newCapacity){
        if(size == 0){
            mainArray = (T[]) new Object[capacity];
        }else{
            T[] newArray = (T[]) new Object[newCapacity];
            System.arraycopy(mainArray,0,newArray,0,mainArray.length);
            mainArray = newArray;
            capacity = newCapacity;
        }
    }

    public void add(T item){
        if(size+1 == capacity){
            createArray(capacity*2);
        }else{
            mainArray[size++] = item;
        }
    }

    public void add(T item,int index){
        if(index <0 || index >= size){
            ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
            throw e;
        }else if(size+1 == capacity){
            createArray(capacity*2);
        }else{
            mainArray[index] = item;
        }
    }

    public void remove(int index){
        if(index <0 || index >= size){
            ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
            throw e;
        }else{
            System.arraycopy(mainArray,index,mainArray,index-1,size-index);
            size--;
        }
    }

    public int size(){
        return size;
    }

    public void clear(){
        size = 0;
        createArray(20);


    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for(int i=0;i < size-1;i++){
            stringBuilder.append(mainArray[i]+",");
        }
        if(size > 0){
            stringBuilder.append(mainArray[size-1]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();

    }
}
