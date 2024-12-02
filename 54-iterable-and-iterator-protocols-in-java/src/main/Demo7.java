package main;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo7 {

    public static void main(String[] args) {
        Customer c001 = new Customer("C001", "Kasun Sampath");
        Customer c002 = new Customer("C002", "Nuwan", "011-1234567");
        Customer c003 = new Customer("C003", "Lasan",
                "011-1234567", "055-1234567", "033-1234567");

        for(String contact: c003){
            System.out.println(contact);
        }
    }
}

class Customer implements Iterable<String>{
    private final String id;
    private final String name;
    private final ArrayList<String> contacts = new ArrayList<>();

    public Customer(String id, String name, String... contacts) {
        this.id = id;
        this.name = name;
        for (String contact : contacts) {
            this.contacts.add(contact);
        }
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public Iterator<String> iterator() {
        return new CustomerContactIterator(this.contacts);
    }
}

class CustomerContactIterator implements Iterator<String>{

    private final ArrayList<String> contactList;
    private int i = 0;

    public CustomerContactIterator(ArrayList<String> contactList) {
        this.contactList = contactList;
    }

    @Override
    public boolean hasNext() {
        return i < contactList.size();
    }

    @Override
    public String next() {
        return contactList.get(i++);
    }
}
