package codility;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by Sathvik on 24/01/16.
 */
public class Brackets {

    public static void main(String[] args){
        System.out.println(solution("{[()()]}{}"));
    }

    public static int solution(String S) {
        // write your code in Java SE 8
        Set<Character> startSet = new HashSet<Character>();
        startSet.add('(');
        startSet.add('{');
        startSet.add('[');

        Stack stack = new Stack();

        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            //System.out.println(stack);

            if(startSet.contains(c)){
                stack.push(c);
            }else{
                if(stack.size() == 0){
                    return 0;
                }
                //System.out.println((char)stack.peek());
                if((char)stack.peek() == getClosing(c)){
                    stack.pop();
                }else{ return 0;}
            }

        }

        if(stack.isEmpty()) return 1;
        else return 0;
    }

    private static char getClosing(char c){

        if(c == ')') return '(';
        if(c == '}') return '{';
        if(c == ']') return '[';

        return '-';
    }

}
