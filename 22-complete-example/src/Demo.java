public class Demo {
    static int a = 20 + getB();
    static{
        System.out.println("Demo class is being initialized");
        System.out.println("a=" + a);
    }
    static int b = 10;
    static{
        a += b;
    }
    public static int getB(){
        System.out.println("getB()");
        return b;
    }
    public static void main(String[] args) {
        System.out.println("a="+ a);
        System.out.println("b="+ b);
        new Child();
    }
}
class Parent{
    static int a = 20;
    static void print(){
        System.out.println("a=" + a);
    }
    static {
        System.out.println("Parent class is being initialized");
        print();
    }
    static int b = 50;
    int c;
    {
        c = a + b;
        System.out.println("c=" + c);
    }
    public Parent(int c) {
        super();
        this.a = c;
        System.out.println("b=" + b);
        System.out.println("Parent(int)");
        print();
    }
}
class Child extends Parent{
    static int a = 10;
    static{
        System.out.println("Child class is being initialized");
        print();
    }
    static void print(){
        System.out.println("a=" + a);
    }
    public Child(){
        this(b);
        System.out.println("Child()");
        System.out.println("c=" + c);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
    public Child(int c) {
        super(a);
        this.c = a + b +c;
        System.out.println("Child(int)");
        System.out.println("d=" + d);
    }
    int d = -25;
    {
        System.out.println("d=" + (d = a += b = d + 5));
        System.out.println("Child instance initializer");
    }
}