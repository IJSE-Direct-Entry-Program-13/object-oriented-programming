package j;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Demo {

    public static void main(String[] args) {
        var names = new ArrayList<String>();
        names.add("Kasun");
        names.add("Nimal");
        names.add("Supun");
        names.add("Nuwan");
        names.add("Ruwan");

        names.forEach(System.out::println);

//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
//
//        for (String name : names) {
//            System.out.println(name);
//        }
    }
}

//class MyConsumer implements Consumer<String> {
//
//    @Override
//    public void accept(String s) {
//        System.out.println(s);
//    }
//}
