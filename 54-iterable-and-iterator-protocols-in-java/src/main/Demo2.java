package main;

import java.util.ArrayList;

public class Demo2 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        int[] nums = {10,20,30,40,50};
        names.add("Kasun");
        names.add("Nuwan");
        names.add("Ruwan");
        names.add("Sampath");
        names.add("Gayan");

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
        }

        System.out.println("========================");

        // [data structure.]iter + Tab

//        for (String name : names) {
//            System.out.println(name);
//        }
    }
}
