package e;

import java.util.function.BiFunction;
import java.util.function.Function;

interface F {
    int exec(int x, int y);
}

public class Demo {

    public static void main(String[] args) {
        F myFn = (x, y) -> x * x + 2 * x * y + y * y;
        int result = myFn.exec(10, 5);
        System.out.println(result);

        F myFn2 = (x, y) -> x * x + y * y;
        int result2 = myFn2.exec(2, 3);
        System.out.println(result2);

        BiFunction<Integer, Integer, Integer> func = (x, y) -> x * x + y * y;
        Integer result3 = func.apply(2, 3);
        System.out.println(result3);

        Function<Integer, Integer> func2 = x -> x * x * x;
        Integer result4 = func2.apply(2);
        System.out.println(result4);
    }
}
