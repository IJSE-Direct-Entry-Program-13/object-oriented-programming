public class Demo extends Object {
    static {
        System.out.println("Demo class is being initialized");
    }

    public static void main(String[] args) {
        new Child(50);
    }
}

class Parent extends Object {
    static int a = 20;
    static {
        System.out.println("Parent class is being initialized");
    }
    int b = 20;
    public Parent() {
        super();
        System.out.println("Parent()");
        System.out.println("b=" + b);
    }
    public Parent(int b) {
        this();
        this.b = b;
        System.out.println("Parent(int)");
        System.out.println("b=" + b);
    }
    {
        System.out.println("Parent Instance Initializer");
        b = a;
        System.out.println("b=" + b);
    }
}

class Child extends Parent {
    static int a = 70;
    static {
        System.out.println("Child class is being initialized");
    }
    {
        System.out.println("Child Instance Initializer 1");
        c = b;
    }
    int c = -30;
    public Child() {
        this(20, a);
        System.out.println("Child()");
        System.out.println("a=" + a);
        System.out.println("c=" + c);
    }
    {
        System.out.println("Child Instance Initializer 2");
        System.out.println("c=" + c);
        c = a;
    }
    public Child(int a, int b) {
        super(b);
        System.out.println("Child(int)");
        System.out.println("a=" + a);
        System.out.println("c=" + c);
    }
}
