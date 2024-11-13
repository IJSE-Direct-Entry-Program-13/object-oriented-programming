public class Demo {

    public static void main(String[] args) {
        // 1) Loading of a class or interface that contains a string literal
        // or a text block may create a new String object
        System.out.println("ijse");
        System.out.println("ijse");
        System.out.println("""
                This is a text block
                """);

        // 2) Boxing conversion may create a new object of a wrapper class
        // associated with one of the primitive types.
        Integer i = 10;
        Integer i2 = 10;

        // 3) Execution of a string concatenation operator + that is not part of a constant expression
        // always creates a new String object to represent the result.
        System.out.println("hello" + "world");
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1 + s2;
        System.out.println(s3);

        // 4) Evaluation of a method reference expression or a lambda expression may require that a new instance

        // 5) Class Instance Creation Expression statement always create a new object of a class
        new Customer();
    }
}

class Customer {

    {
        System.out.println("Instance Initializer1");
    }

    public Customer() {
        super();
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Initializer2");
    }

}
