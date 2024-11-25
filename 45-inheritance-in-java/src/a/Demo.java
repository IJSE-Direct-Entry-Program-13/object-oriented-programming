package a;

public class Demo {
    public static void main(String[] args) {
        new SubClass().print();
    }
}

class SuperClass {
    int a = 10;
    int b = 20;
    static {
        System.out.println("SuperClass is being initialized");
    }
    {
        System.out.println("Super Class");
    }
    void print(int value) {
        System.out.println(value);
    }
}
class SubClass extends SuperClass {
    int c = 30;
    static {
        System.out.println("SubClass is being initialized");
    }
    {
        System.out.println("Sub Class");
    }
    void print() {
        super.print(a + b + c);
    }
}
