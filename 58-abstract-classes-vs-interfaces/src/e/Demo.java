package e;

public class Demo {
    public static void main(String[] args) {

    }
}

abstract class MyAbstractClass{
    abstract void myAbstractMethod1();
    // private abstract void myAbstractMethod2();
    protected abstract void myAbstractMethod3();
    public abstract void myAbstractMethod4();
    final void myMyFinalMethod(){}
    synchronized void mySynchronizedMethod(){}
    public void myPublicInstanceMethod(){}
    protected void myProtectedInstanceMethod(){}
    void myPackagePrivateInstanceMethod(){}
    private void myPrivateInstanceMethod(){}
    native void MyNativeMethod();
}

interface MyInterface {
    /* public */ abstract void myAbstractMethod1();
    // private abstract void myAbstractMethod2();
    //protected abstract void myAbstractMethod3();
    public abstract void myAbstractMethod4();
    //final void myMyFinalMethod(){}
    //synchronized void mySynchronizedMethod(){}
    //public void myPublicInstanceMethod(){}
    //protected void myProtectedInstanceMethod(){}
    //void myPackagePrivateInstanceMethod(){}
    private void myPrivateInstanceMethod(){}
    // native void MyNativeMethod();
}





