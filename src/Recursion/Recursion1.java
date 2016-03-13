package Recursion;

/**
 * Created by Sathvik on 10/11/15.
 */
public class Recursion1 {
    //Algorithm for finding the k-th even natural number

    public static void main(String args[]){
            System.out.println(kthEvenNaturalNumber(3));
    }

    private static int kthEvenNaturalNumber(int k) {

        if(k == 1){
            return 0;
        }else{
            return kthEvenNaturalNumber(k-1)+2;
        }

    }

}
