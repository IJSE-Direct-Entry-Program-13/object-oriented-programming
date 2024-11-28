package rule2.e;

interface Top {
    boolean INITIALIZED = initialize();

    private static boolean initialize() {
        System.out.println("Top is being initialized");
        return true;
    }

    default void printTop() {
    }
}

interface MyInterface {
    boolean INITIALIZED = initialize();

    private static boolean initialize() {
        System.out.println("MyInterface is being initialized");
        return true;
    }

    default void printMyInterface() {
    }
}

interface Middle extends Top, MyInterface {
    boolean INITIALIZED = initialize();
    int VALUE = getValue();

    public static int getValue(){
        return VALUE;
    }

    public static void print(){
        System.out.println("Hey middle");
    }

    private static boolean initialize() {
        System.out.println("Middle is being initialized");
        return true;
    }
}

interface Bottom extends Middle {
    boolean INITIALIZED = initialize();

    private static boolean initialize() {
        System.out.println("Bottom class is being initialized");
        return true;
    }
}

public class Demo {

    public static void main(String[] args) {
        // Bottom.print();
        System.out.println(Bottom.VALUE);
    }
}