package g;

public class Demo {

    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Kasun");
        Customer c2 = new Customer(2, "Nuwan");
        System.out.println(c1 + "");
        System.out.println(c2 + "");
        print(c1 + "");
        print(c2 + "");
        print(c1);
        print(c2);
    }

    public static void print(Object s){
        System.out.println(s.toString());
    }
}

class Customer {
    int id;
    String name;
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
}