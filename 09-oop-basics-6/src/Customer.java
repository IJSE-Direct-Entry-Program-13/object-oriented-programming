public class Customer {
    int id;
    String name;
    String address;

    // No-args constructor
    public Customer() {
        System.out.println("Customer()");
    }

    public Customer(int id) {
        this.id = id;
        System.out.println("Customer(id)");
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Customer(id,name)");
    }

//    public Customer(long id, String name) {
//        this.id = (int) id;
//        this.name = name;
//        System.out.println("Customer(id,name)");
//    }

    // All-args constructor, Full-args constructor
    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        System.out.println("Customer(id,name,address)");
    }
}
