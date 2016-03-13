package javaconcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Sathvik on 15/02/16.
 */
public class IteratorExample {

    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<Integer,String>();

        map.put(1,"sath");
        map.put(2,"sath2");
        map.put(3,"sath3");
        map.put(4,"sath4");

        Iterator i = map.entrySet().iterator();
        while (i.hasNext()){
            System.out.println(i.next().toString());
            if(i.hasNext()){
                i.remove();
            }

        }

        // print from the removed list
        Iterator i2 = map.entrySet().iterator();
        System.out.println(i2.hasNext());

        while (i2.hasNext()){
            System.out.println(i2.next().toString());
        }

    }

}

