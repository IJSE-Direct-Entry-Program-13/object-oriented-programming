package main;

public class Demo {

    public static void main(String[] args) {
        Object ref = Math.random() < 0.5 ? new Customer(1, "Kasun", "Galle") : "ijse";
        if (ref instanceof Customer(var id, var name, var address)) {
            // Customer c = (Customer) ref;
            // var id = c.id();
            // var name = c.name();
            // var address = c.address();
            System.out.printf("id=%s, name=%s, address=%s %n", id, name, address);
        }else if (ref instanceof String s){
            // System.out.println(((String) ref).toUpperCase());
            System.out.println(s.toUpperCase());
        }
    }
}

record Customer(int id, String name, String address){
}
