package j;

public class Demo {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Kasun");
        Customer c2 = new Customer(2, "Nuwan");
        Customer c3 = new Customer(1, "Kasun");
        System.out.println(c1.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c2));
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        //new Customer(-5, "Upul");
    }
}
record Customer(int id, String name){
//    Customer{       // This is called "Compact constructor"
//        if (id < 0) throw new IllegalArgumentException();
//        if (name == null || name.isEmpty()) throw new IllegalArgumentException();
//    }

    // You can't explicitly define instance variables or instance initializers
//    int x = 10;
//    {
//
//    }

    // But you can define static variables and static initializers if you want
    static int x = 10;
    static {

    }

    // Except for nested classes any other nested type in java record is implicitly static
    class MyNestedClass{}
    static interface MyInterface{}
    static enum MyEnum{}
    static @interface MyAnnotation{}

    // You use only "Canonical constructor" only if you have to create final/leaf/read-only parameters
    Customer(final int id, final String name) { // This is called "Canonical Constructor"
     // super();
     if (id < 0) throw new IllegalStateException("Invalid id");
     //id++;
     if (name == null) throw new IllegalStateException("Invalid name");
     this.id = id;
     this.name = name;
    }
}
