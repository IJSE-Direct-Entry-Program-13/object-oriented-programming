public class Demo2 {

    public static void main(String[] args) {
        //Customer c1;
        //Customer c2 = (Customer) new Object();
        Customer[] customers;
        customers = new Customer[3];
    }
}

class Customer {
    static {
        System.out.println("Customer class is being initialized");
    }
}
