package main;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo3 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

//        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
//            Integer value = iterator.next();
//            System.out.println(value);
//        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }

        System.out.println("========================");

        for (Integer value : numbers) {
            System.out.println(value);
        }
    }
}
