package g;

@MyAnnotation
public class Demo {
    @MyAnnotation
    int x;

    @MyAnnotation
    public static void main(String[] args) {

    }
}

@MyAnnotation
abstract class MyAbstractClass{}
abstract interface MyInterface{}
abstract @interface MyAnnotation{}

@MyAnnotation
final class MyLeafClass{}
enum MyEnum{}
final record MyRecord(){}

class JustANormalClass{}
