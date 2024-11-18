public class Demo {

    public static void main(String[] args) {
        new MyClass();
    }
}

class MyClass {
    {
        System.out.println("Instance Initializer 1");
        System.out.println("a=" + getValueOfA());
    }
    int a = 10;
    public MyClass() {
        super();
        System.out.println("Constructor");
    }
    {
        System.out.println("Instance Initializer 2");
        System.out.println("a=" + a);
    }
    int getValueOfA() {
        return a;
    }
}