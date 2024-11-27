package fourth;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        System.out.println(B.a);
    }
}

class A{
    final static int a = new Random().nextInt();
    static{
        System.out.println("A class is being initialized");
    }
}
class B extends A{
    static int b = 20;
    static {
        System.out.println("B class is being initialized");
    }
}
