package datastructures.customlist;

import datastructures.customlist.CustomList;

import java.util.Random;

/**
 * Created by Sathvik on 11/02/16.
 */
public class CustomListMain {

    public static void main(String[] args){

        CustomList<Integer> integerCustomList = new CustomList<Integer>();
        Random random = new Random();
        for(int i=0;i<=30;i++){
            integerCustomList.add(random.nextInt(100));
        }
        integerCustomList.remove(4);
        System.out.println(integerCustomList);
        integerCustomList.add(44);
        System.out.println(integerCustomList);
        integerCustomList.clear();
        System.out.println(integerCustomList);

    }

}
