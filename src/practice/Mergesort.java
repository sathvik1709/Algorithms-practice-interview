package practice;

import java.util.Arrays;

/**
 * Created by Sathvik on 10/01/16.
 */
public class Mergesort {

    public static void main(String[] args){
        int[] a = new int[]{38,27,43,3,9,82,10,12};

        System.out.println(Arrays.toString(mergeSort(a)));

    }

    private static int[] mergeSort(int[] a){

        if(a.length == 1){
            return a;
        }

        int[] first = new int[a.length/2];
        int[] second = new int[a.length - first.length];

        System.arraycopy(a,0,first,0,first.length);
        System.arraycopy(a,first.length,second,0,second.length);

        mergeSort(first);
        mergeSort(second);
        merge(first,second,a);

        return a;
    }

    private static void merge(int[] first,int[] second,int[] result){

        int iFirst = 0;
        int iSecond = 0;
        int j=0;

        while(iFirst < first.length && iSecond < second.length){
            if(first[iFirst] < second[iSecond]){
                result[j] = first[iFirst];
                iFirst ++;
            }else{
                result[j] = second[iSecond];
                iSecond ++;
            }
            j++;
        }

        System.arraycopy(first,iFirst,result,j,first.length-iFirst);
        System.arraycopy(second,iSecond,result,first.length+iSecond,second.length-iSecond);

    }






}


