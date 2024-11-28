package rule2.b;

public class Demo {

    public static void main(String[] args) {
        //System.out.println(B.b);    // System.out.println(20);
        //System.out.println(B.c);
        // System.out.println(B.a);
        B.print();
    }
}
class Top {
    static {
        System.out.println("Class Top is being initialized");
    }
}
class A extends Top{
    static int a = 10;
    final static int b = 20;
    final static int c = getValue();
    private static int getValue() {
        return 30;
    }
    public static void print(){
        System.out.println("A -> print()");
    }
    static {
        System.out.println("Class A is being initialized");
    }
}
class Middle extends A {
    static {
        System.out.println("Class Middle is being initialized");
    }
}
class B extends Middle {
    static {
        System.out.println("Class B is being initialized");
    }
}
class C extends B {
    static  {
        System.out.println("Class C is being initialized");
    }
}
