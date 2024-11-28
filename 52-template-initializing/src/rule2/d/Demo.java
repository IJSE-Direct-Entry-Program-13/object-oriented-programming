package rule2.d;

public class Demo {

    public static void main(String[] args) {
        B.a = 20;
    }
}

interface I1 {
    boolean INITIALIZED = initialize();
    private static boolean initialize() {
        System.out.println("I1 is being initialized");
        return true;
    }
    default void printI1(){}
}
interface I2 extends I1 {
    boolean INITIALIZED = initialize();
    private static boolean initialize() {
        System.out.println("I2 is being initialized");
        return true;
    }
    default void printI2(){}
}
interface I3 extends I1, I2 {
    boolean INITIALIZED = initialize();
    private static boolean initialize() {
        System.out.println("I3 is being initialized");
        return true;
    }
}
interface I4 extends I2, I3 {
    boolean INITIALIZED = initialize();
    private static boolean initialize() {
        System.out.println("I4 is being initialized");
        return true;
    }
    default void printI4(){}
}
class Top implements I3, I1{
    static{
        System.out.println("Top is being initialized");
    }
}
class A extends Top implements I4, I2 {
    static int a = 10;
    static {
        System.out.println("A is being initialized");
    }
}
class B extends A implements I1, I2, I3, I4 {
    static {
        System.out.println("B is being initialized");
    }
}