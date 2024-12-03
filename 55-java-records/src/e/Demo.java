package e;

import java.util.HashSet;

public class Demo {

    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Kasun");
        Customer c2 = new Customer(1, "kAsuN");
        System.out.println(c1 == c2);       // false
        System.out.println(c1.equals(c2));  // true

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers.size());
        System.out.println(numbers);

        HashSet<Customer> customerSet = new HashSet<>();
        customerSet.add(new Customer(1, "Kasun"));
        customerSet.add(new Customer(2, "Nuwan"));
        customerSet.add(new Customer(3, "Ruwan"));
        customerSet.add(new Customer(1, "Kasun"));
        customerSet.add(new Customer(2, "Nuwan"));
        System.out.println(customerSet.size());
        System.out.println(customerSet);
        for (Customer customer : customerSet) {
            System.out.printf("id=%s, name=%s %n", customer.id, customer.name);
        }
    }
}
class Customer{
    int id;
    String name;
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return 1;
    }
    @Override
    public boolean equals(Object obj) {
        Customer c = (Customer) obj;
        return c.id == this.id && c.name.equalsIgnoreCase(this.name);
    }
}