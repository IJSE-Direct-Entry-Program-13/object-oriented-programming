package h;

public class Demo {
    public static void main(String[] args) {

    }
}

abstract class MyAbstractClass{
    public static class MyPublicNestedClass{}
    public class MyPublicNonStaticNestedClass{}
    public static interface MyPublicNestedInterface{}
    public static enum MyPublicEnum{}
    public static record MyPublicRecord(){}
    public static  @interface MyPublicAnnotation{}

    protected static class MyProtectedNestedClass{}
    protected class MyProtectedNonStaticNestedClass{}
    protected static interface MyProtectedNestedInterface{}
    protected static enum MyProtectedEnum{}
    protected static record MyProtectedRecord(){}
    protected static  @interface MyProtectedAnnotation{}

    static class MyPackagePrivateNestedClass{}
    class MyPackagePrivateNonStaticNestedClass{}
    static interface MyPackagePrivateNestedInterface{}
    static enum MyPackagePrivateEnum{}
    static record MyPackagePrivateRecord(){}
    static  @interface MyPackagePrivateAnnotation{}

    private static class MyPrivateNestedClass{}
    private class MyPrivateNonStaticNestedClass{}
    private static interface MyPrivateNestedInterface{}
    private static enum MyPrivateEnum{}
    private static record MyPrivateRecord(){}
    private static  @interface MyPrivateAnnotation{}
}

interface MyInterface{
    public static class MyNestedClass{}
    public static interface MyNestedInterface{}
    public static enum MyEnum{}
    public static record MyRecord(){}
    public static  @interface MyAnnotation{}

//    protected static class MyProtectedNestedClass{}
//    protected class MyProtectedNonStaticNestedClass{}
//    protected static interface MyProtectedNestedInterface{}
//    protected static enum MyProtectedEnum{}
//    protected static record MyProtectedRecord(){}
//    protected static  @interface MyProtectedAnnotation{}
}