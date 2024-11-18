public class Demo3 {
    public static void main(String[] args) {
//        new MyClass3(100);
//        // Instance Initializer
//        // a=20
//        // Constructor(int)
//        // a = 100

        new MyClass3();
    }
}

class MyClass3{
    int a = 20;
    {
        System.out.println("Instance Initializer");
        System.out.println("a=" + a);
    }
    public MyClass3() {
        this(40);
        System.out.println("Constructor()");
        System.out.println("a=" + a);
    }
    public MyClass3(int a) {
        this.a = a;
        System.out.println("Constructor(int)");
        System.out.println("a=" + this.a);
    }
    public MyClass3(String something){
        super();
        System.out.println("Constructor(int)");
        System.out.println("a=" + this.a);
    }
}
