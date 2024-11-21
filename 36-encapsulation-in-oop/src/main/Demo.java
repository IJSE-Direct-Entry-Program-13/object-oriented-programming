package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

    }
}

class Customer implements Serializable {
    private int id;
    private String name;
    private String address;
    private ArrayList<String> contacts = new ArrayList<>();

    public String getContact(int index) {
        return contacts.get(index);
    }

    public void setContact(int index, String contact) {
        contacts.set(index, contact);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
