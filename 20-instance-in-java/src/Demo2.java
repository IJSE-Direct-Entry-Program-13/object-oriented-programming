public class Demo2 {
    public static void main(String[] args) {
        new MyClass2();
        new MyClass2(20);
    }
}

class MyClass2 {
    int a = 10;
    {
        System.out.println("Instance Initializer");
    }
    public MyClass2() {
        System.out.println("Constructor()");
        System.out.println("a=" + a);
    }
    public MyClass2(int a) {
        System.out.println("Constructor(int)");
        System.out.println("a=" + a);
        System.out.println("a=" + this.a);
    }
}
