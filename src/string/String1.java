package string;

/**
 * Created by Sathvik on 16/01/16.
 */
public class String1 {

/*    Check if edit distance between two strings is one
    An edit between two strings is one of the following changes.

    Add a character
    Delete a character
    Change a character*/

    public static void main(String[] args){

       /* String s1 = "geeks";
        String s2 = "geek";*/

        System.out.println(checkForEdits("geeks", "geek"));
        System.out.println(checkForEdits("geeks", "geeks"));
        System.out.println(checkForEdits("geaks", "geeks"));
        System.out.println(checkForEdits("peaks", "geeks"));

    }

    private static boolean checkForEdits(String s1,String s2){


        int numberOfEdits = 0;
        int i = 0;
        int j = 0;

        while(i < s1.length() && j<s2.length()){

            if(s1.charAt(i) != s2.charAt(j)){
                numberOfEdits += 1;
            }

            i++;
            j++;
        }


        numberOfEdits += Math.abs(s1.length()-s2.length());


        System.out.println("No. of edits "+numberOfEdits);

        if(numberOfEdits == 1){
            return true;
        }else{
            return false;
        }
    }


}
