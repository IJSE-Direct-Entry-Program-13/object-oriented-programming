package k;

import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        var value = switch(new Random().nextInt(4)){
            case 0 -> 10;
            case 1 -> 20;
            case 2 -> 30;
            case 3 -> true;
            default -> 40;
        };
        System.out.println(value);
    }
}
