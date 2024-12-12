package i;

public class Demo {

    public static void main(String[] args) {
        F fn = (id, name) -> new Customer(id, name);

        F fn2 = Customer::new;
    }
}

interface F{
    Customer process(String id, String name);
}

record Customer(String id, String name){}