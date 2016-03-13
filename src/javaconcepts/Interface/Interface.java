package javaconcepts.Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Sathvik on 10/02/16.
 */
public class Interface implements InterfaceExample{

    public static void main(String[] args){
        System.out.print(InterfaceExample.i);

        List<Integer> integerList = new ArrayList<Integer>();
        int j = InterfaceExample.i;
        integerList = Collections.synchronizedList(integerList);

    }


    @Override
    public void getData() {

    }

    @Override
    public void getData2() {

    }
}
