package rule3;

public class Demo {

    public static void main(String[] args) throws ClassNotFoundException {
        //Class.forName("rule3.SubClass");
        Class.forName("rule3.MyInterface3");
    }
}

interface MyInterface1 {
    boolean INITIALIZED = initialize();
    private static boolean initialize() {
        System.out.println("MyInterface1 is being initialized");
        return true;
    }
    default void print(){}
}
interface MyInterface2  {
    boolean INITIALIZED = initialize();
    private static boolean initialize() {
        System.out.println("MyInterface2 is being initialized");
        return true;
    }
}
interface MyInterface3 extends MyInterface1, MyInterface2 {
    boolean INITIALIZED = initialize();
    private static boolean initialize() {
        System.out.println("MyInterface3 is being initialized");
        return true;
    }
    // default void print(){}
}

//=======================================================

interface I1 {
    boolean INITIALIZED = initialize();
    private static boolean initialize() {
        System.out.println("I1 is being initialized");
        return true;
    }
    default void print(){}
}

interface I2 extends I1 {
    boolean INITIALIZED = initialize();
    private static boolean initialize() {
        System.out.println("I2 is being initialized");
        return true;
    }
}

class SuperClass implements I2 {
    static {
        System.out.println("SuperClass is being initialized");
    }
}

class SubClass extends SuperClass{
    static {
        System.out.println("SubClass is being initialized");
    }
}
