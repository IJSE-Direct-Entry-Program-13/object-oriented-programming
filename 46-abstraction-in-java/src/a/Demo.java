package a;

public class Demo {

    public static void main(String[] args) {

    }
}

abstract interface CalculatorIdea{
    public static final int x = 10;
    int y = 10;     // This is not an instance variable, this is a static constant
    // int y;       // This will raise a compilation error because you need to provide a value for the constant

    // Interfaces do not have static/instance initializers or constructors
    // static {}
    // {}
    // public CalculatorIdea(){}

    // To improve readability, flexibility, scalability in Java interfaces
    // To align with streams, lambdas and method references
    // Now we can keep utility functions in a one place without creating an extra class when exposing the idea
    // Now we can expose the main method from an interface
    public static void myStaticMethod(){
        System.out.println("My Static Method since Java 8");
    }

    // To introduce (OCP) Open Closed Principle to Java Interfaces => Open for extensions, Close for modifications
    public default void myInstanceMethod(){
        System.out.println(this);
        System.out.println("My Instance Method since Java 8");
    }

    private static void myPrivateStaticMethod(){
        System.out.println("My Private Static Method since Java 9");
    }

    private void myPrivateInstanceMethod(){
        System.out.println(this);
        System.out.println("My Private Instance Method since Java 9");
    }

    public static class MyStaticNestedClass{}
    public static enum MyStaticEnum{}
    public static record MyRecord(){}
    public static interface MyStaticInterface{}
    public static @interface MyAnnotation{}
    // static class MyRegularNestedClass{}

    public abstract int add(int a, int b);
    public abstract  int subtract(int a, int b);
    public abstract  int multiply(int a, int b);
    public abstract double divide(int a, int b);
    public abstract  double mod(int a, int b);
}

interface SuperInterface{
    public default void print(){}
    public default void execute(){}
}

interface SubInterface extends SuperInterface{
    @Override
    public default void print(){
//        super.print();      // Moota super arahan
//        this.abc();
//        this.execute();
    }

    private void abc(){}
}
