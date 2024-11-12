public class Customer {
    public static int x = 10;
    static {
        System.out.println("Customer class is being initialized");
    }

    public Customer() {
        System.out.println("Customer()");
    }
}