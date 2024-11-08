public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        new C();
    }
}
class A{
    static{
        System.out.println("Class A is being initialized");
    }
}
class B extends A{
    static{
        System.out.println("Class B is being initialized");
    }
}
class C extends B{
    static{
        System.out.println("Class C is being initialized");
    }
}
