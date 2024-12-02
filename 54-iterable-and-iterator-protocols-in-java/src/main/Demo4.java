package main;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo4 {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int i = 0;
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); i++) {
            Integer value = iterator.next();
            System.out.println("t1: " + value);
            if (i == 2) {
                new Thread(() -> {
                    for (Iterator<Integer> sameIterator = iterator; sameIterator.hasNext(); ) {
                        Integer value2 = sameIterator.next();
                        System.out.println("t2: " + value2);
                    }
                }).start();
                Thread.sleep(500);
            }
        }
    }
}
