package Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sathvik on 11/11/15.
 */
public class Recursion5 {

    static  String str = "abc";
    static List<String> result = new ArrayList<>();

    public static void main(String args[]){
        perm2(str.toCharArray(),str.length());
    }


    private static void perm2(char[] a, int n) {
        if (n == 1) {
            System.out.println(a);
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a, i, n-1);
            perm2(a, n-1);
            swap(a, i, n-1);
        }
    }

    // swap the characters at indices i and j
    private static void swap(char[] a, int i, int j) {
        char c = a[i];
        a[i] = a[j];
        a[j] = c;
    }


}
