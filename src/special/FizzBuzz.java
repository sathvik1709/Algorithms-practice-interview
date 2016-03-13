package special;

/**
 * Created by Sathvik on 09/01/16.
 */
public class FizzBuzz {

    public static void main(String[] args){
        fizzBuzzLogic(3,5,35);
    }

    private static void fizzBuzzLogic(int a,int b,int n){

        for(int i=1;i<=n;i++){
            String s = "";

            if(i % a == 0){
                s += "Fizz";
            }

            if(i % 5 == 0){
                s+= "Buzz";
            }

            if(s.equals("")){
                s = String.valueOf(i);
            }

            System.out.println(s);

        }

    }

}
