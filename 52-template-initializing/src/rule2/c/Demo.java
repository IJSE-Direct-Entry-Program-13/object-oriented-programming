package rule2.c;

public class Demo {
    public static void main(String[] args) {
        B.printA();
    }
}
interface SuperTopInterface{
    boolean INITIALIZED = initialize();
    private static boolean initialize(){
        System.out.println("SuperTop interface is being initialized");
        return true;
    }
    default void defaultMethod(){}
}
interface TopInterface extends SuperTopInterface{
    boolean INITIALIZED = initialize();
    private static boolean initialize(){
        System.out.println("Top interface is being initialized");
        return true;
    }
}
class SuperTop implements SuperTopInterface{
    static {
        System.out.println("SuperTop class is being initialized");
    }
}
class Top extends SuperTop implements TopInterface{
    static {
        System.out.println("Top class is being initialized");
    }
}
class A extends Top {
    final static int a = 20;
    static void printA(){
        System.out.println(a);
    }
    static {
        System.out.println("Class A is being initialized");
    }
}
class B extends A {
    static  {
        System.out.println("Class B is being initialized");
    }
}

