package rule2.a;

import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        // 1.
        // System.out.println(B.a);
        // 2.
        // System.out.println(B.COMPILE_TIME_CONSTANT);   // System.out.println(10);
        // 3.
        // System.out.println(B.RUNTIME_TIME_CONSTANT);
        // 4.
        // B.printA();
    }
}

interface SuperInterface {
    int VALUE = getValue();
    private static int getValue() {
        initialize();
        return 10;
    }
    private static void initialize(){
        System.out.println("SuperInterface is being initialized");
    }
//    default void myMethod(){}
}
class A implements SuperInterface {
    static int a = 10;
    final static int COMPILE_TIME_CONSTANT = 10;
    final static int RUNTIME_TIME_CONSTANT = new Random().nextInt();
    static {
        System.out.println("Class A is being initialized");
    }
    static void printA(){
        System.out.println("a=" + a);
    }
}
class Middle extends A{
    static {
        System.out.println("Class Middle is being initialized");
    }
}
class B extends Middle{
    static int b = 20;
    static {
        System.out.println("Class B is being initialized");
    }
    static void printB(){
        System.out.println("b=" + b);
    }
}