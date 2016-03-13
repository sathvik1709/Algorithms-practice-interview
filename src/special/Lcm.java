package special;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sathvik on 13/01/16.
 */
public class Lcm {

    public static void main(String[] args){

        int n = 100;
        System.out.println(lcm(n));

    }

    private static List<Integer> lcm(int n){

        List<Integer> integerList = new ArrayList<Integer>();

        for(int i=2;i<=n/i;i++){
            while(n%i == 0){
                integerList.add(i);
                n = n/i;
            }
        }

        integerList.add(n);

        if(n!= 1){
            //System.out.println(n);
            integerList.add(1);
        }




        return integerList;
    }


}
