package i;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        double value = switch (new Random().nextInt(5)){
            case 0 -> 10l;
            case 1 -> 20;
            case 2 -> 30f;
            case 3 -> 40;
            case 4 -> 50d;
            default -> 0;
        };
        System.out.println(value);
    }
}
