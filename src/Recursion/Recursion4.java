package Recursion;

/**
 * Created by Sathvik on 10/11/15.
 */
public class Recursion4 {

    //Algorithm for testing whether or not a number x is a natural number

    public static void main(String args[]){

        System.out.println(xIsNatural(-2));
    }

    private static String xIsNatural(int k) {

        if(k<0){
            return "No";
        }else{
            if(k==0) return "Yes";
            else  return xIsNatural(k-1);
        }

    }

}
