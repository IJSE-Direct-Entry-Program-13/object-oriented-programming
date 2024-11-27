package first;

public class Demo {

    public static void main(String[] args) throws ClassNotFoundException {
        // new MyClass();
        // System.out.println(MyInterface.PI);
        Class.forName("first.MyInterface");
    }
}

interface MyInterface{
    public static final double PI = getPi();
    public static final int VALUE = getValue();

    private static double getPi(){
        return 3.14;
    }

    private static int getValue(){
        initialize();
        return 10;
    }

    private static void initialize(){
        System.out.println("Interface initializing");
    }
}

class MyClass implements MyInterface{}
