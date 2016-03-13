package javaconcepts;

import java.util.*;

/**
 * Created by Sathvik on 15/02/16.
 */
public class EnumaratorExample {

    public static void main(String[] args){

        Set<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(1);
        set.add(443);

        for(int i : set){
            System.out.println(i);
        }

        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(1);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        linkedHashSet.add(1);
        linkedHashSet.add(443);

        for(int i : linkedHashSet){
            System.out.println(i);
        }





    }

}
