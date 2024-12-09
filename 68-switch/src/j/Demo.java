package j;

import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        byte b = 10;
        final short s = 20;
        final char c = 30;
        int i = 40;
        int value = switch (new Random().nextInt(5)){
            case 0 -> 10;
            case 1 -> s;
            case 2 -> c;
            case 3 -> b ;
            case 4 -> 50;
            default -> 0;
        };
        System.out.println(value);
    }
}
