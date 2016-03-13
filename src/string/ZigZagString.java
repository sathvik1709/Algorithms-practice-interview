package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Sathvik on 14/01/16.
 */
public class ZigZagString {

    //Given a string and number of rows ‘n’.
    // Print the string formed by concatenating n rows when input string is written in row-wise Zig-Zag fashion.
    /*Examples:

    Input: str = "ABCDEFGH"
    n = 2
    Output: "ACEGBDFH"
    Explanation: Let us write input string in Zig-Zag fashion
    in 2 rows.
    A   C   E   G
      B   D   F   H
    Now concatenate the two rows and ignore spaces
    in every row. We get "ACEGBDFH"

    Input: str = "GEEKSFORGEEKS"
    n = 3
    Output: GSGSEKFREKEOE
    Explanation: Let us write input string in Zig-Zag fashion
    in 3 rows.
    G       S       G       S
      E   K   F   R   E   K
        E       O       E
    Now concatenate the two rows and ignore spaces
    in every row. We get "GSGSEKFREKEOE"
    */

    public static void main(String[] args){

        String str = "GEEKSFORGEEKS";
        printZigZag(str, 3);

    }

    private static void printZigZag(String str, int n) {

        Map<Integer,String> integerStringMap = new HashMap<Integer,String>();
        boolean isRaising = false;
        int currentLevel = 1;

        for(int i=0;i<str.length();i++){

            if(integerStringMap.get(currentLevel) != null){
                integerStringMap.put(currentLevel,integerStringMap.get(currentLevel)+str.charAt(i));
            }else{
                integerStringMap.put(currentLevel,String.valueOf(str.charAt(i)));
            }

            if(isRaising){
                currentLevel -= 1;
            }else{
                currentLevel += 1;
            }

            if(currentLevel % n == 0 || currentLevel == 1){
                isRaising = !isRaising;
            }

        }

        Iterator iterator = integerStringMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.print(entry.getValue());
        }

        //System.out.println(integerStringMap.toString());

    }

}
