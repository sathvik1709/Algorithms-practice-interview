package Arrays;

import sort.ArrayConstants;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sathvik on 16/12/15.
 */
public class Arraya1 {

    public static void main(String args[]){
        String pattern = "abba";
        String setence = "hat hat jar hat";
        System.out.println(isMatchingPattern(pattern,setence));
    }

    public static boolean isMatchingPattern(String pattern, String sentence) {

        if(pattern.length() != sentence.split(" ").length){
            return false;
        }

        String[] strArray = sentence.split(" ");
        char[] charArray = pattern.toCharArray();

        Map<String,String> map = new HashMap<String,String>();

        for(int i=0;i<strArray.length;i++){
            if(map.containsKey(strArray[i])){
                if(!map.get(strArray[i]).equalsIgnoreCase(String.valueOf(charArray[i]))){
                    return false;
                }
            }else{
                map.put(strArray[i], String.valueOf(charArray[i]));
            }
        }

        return true;

    }

}
