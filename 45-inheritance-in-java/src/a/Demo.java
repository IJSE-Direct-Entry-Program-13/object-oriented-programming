package a;

public class Demo {
    public static void main(String[] args) {
        new SubClass().print();
    }
}

class SuperClass {
    private int a = 10;
    int b = 20;
    static {
        System.out.println("SuperClass is being initialized");
    }
    {
        System.out.println("Super Class");
    }
    void print(int value) {
        print(value);
        this.print(value);
        ((SuperClass)this).print(value);
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
        super.print( b + c);
    }
    void print(int value) {
        System.out.println("value=" + value);
    }
}
