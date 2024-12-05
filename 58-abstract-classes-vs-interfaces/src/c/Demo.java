package c;

public class Demo {
    public static void main(String[] args) {

    }
}

abstract class MyAbstractClass {
    static int x;
    private static int y;
    protected int z;
    public static int a;
    static {
        System.out.println("Static Initializer");
    }
    private static final int MY_CONST1 = 10;
    static final int MY_CONST2 = 10;
    protected static final int MY_CONST3 = 10;
    public static final int MY_CONST4 = 10;
}

interface MyInterface{
//    static int x;
//    private static int y;
//    protected int z;
//    public static int a;
//    static {
//        System.out.println("Static Initializer");
//    }
    // private static final int MY_CONST1 = 10;
    static final int MY_CONST2 = 10;
    // protected static final int MY_CONST3 = 10;
    public static final int MY_CONST4 = 10;
}
