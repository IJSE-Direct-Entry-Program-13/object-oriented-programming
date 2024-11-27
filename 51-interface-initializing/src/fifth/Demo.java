package fifth;

public class Demo {

    public static void main(String[] args) {
        System.out.println(A.a);
    }
}

class A{
    final static int a = getA();
    static {
        System.out.println("Class A is being initialized");
    }
    private static final int getA(){
        return 10;
    }
}
