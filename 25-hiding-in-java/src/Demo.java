public class Demo {
    public static void main(String[] args) {
        B obj = new D();
        System.out.println(obj.value);
        System.out.println(obj.name);
    }
}
class A{
    int value = 10;
    String name = "A";
}
class B extends A{
    static String value = "ijse";
}
class C extends B{
    boolean value = false;
    static String name = "C";
}
class D extends C{
    static Object value = new Object();
}
