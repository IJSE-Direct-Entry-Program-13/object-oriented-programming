package d;

public class Demo {
    public static void main(String[] args) {

    }
}
abstract class MyAbstractClass{
    public static void myPublicStaticMethod(){}
    protected static void myProtectedStaticMethod(){}
    static void myPackagePrivateStaticMethod(){}
    private void myPrivateStaticMethod(){}
}

interface MyInterfaces{
    public static void myPublicStaticMethod(){}
    // protected static void myProtectedStaticMethod(){}
    /* public */ static void myStillPublicStaticMethod(){}    // <-This is implicitly public
    private void myPrivateStaticMethod(){}
}
