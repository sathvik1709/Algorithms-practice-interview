package practice;

/**
 * Created by Sathvik on 12/01/16.
 */
public class PermutationsOfString {

    public static void main(String[] args){

        String str = "ABC";
        permute(str.toCharArray(),str.length());

    }

    private static void permute(char[] a,int n) {

        if(n == 1){
            System.out.println(a);
        }else{
            for(int i=0;i<n;i++){
                swap(a,i,n-1);
                permute(a,n-1);
                swap(a,i,n-1);
            }
        }

    }

    private static void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
