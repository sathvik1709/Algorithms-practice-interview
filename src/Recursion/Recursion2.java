package Recursion;

/**
 * Created by Sathvik on 10/11/15.
 */
public class Recursion2 {

    // Algorithm for computing the k-th power of 2

    public static void main(String args[]){
        System.out.println(kthPowerOfTwo(3));
    }

    private static int kthPowerOfTwo(int k) {

        if(k==0){
            return 1;
        }else{
            return kthPowerOfTwo(k-1)*2;
        }

    }
}
