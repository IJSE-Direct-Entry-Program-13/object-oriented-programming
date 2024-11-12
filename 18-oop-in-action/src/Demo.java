public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("MyClass");
    }
}

class MyClass{
    static int x = 10;
    static {
        System.out.println(x);
        //System.out.println(y);
        System.out.println("I can execute before y is initialized");
        System.out.println("y=" + getValue());
    }
    static int y = 20;
    public static int getValue(){
        return y;
    }
    static{
        System.out.println("y=" + y);
    }
}
