package e;

public class Demo {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Kasun");
        System.out.println(c1.id());
        System.out.println(c1.name());
    }
}

record Customer(int id, String name){}
