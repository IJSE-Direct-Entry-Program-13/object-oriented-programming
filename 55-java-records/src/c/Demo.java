package c;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("S001", "Kasun", 10,
                "Grace Peries Road", "Panadura", "Sri Lanka");
        Student cloneOfs1 = s1.clone();
        System.out.println(s1 == cloneOfs1);    // false
        System.out.println(s1.id == cloneOfs1.id);  // true
        System.out.println(s1.name == cloneOfs1.name); // true
        System.out.println(s1.address == cloneOfs1.address); // false
        System.out.println(s1.address.houseNumber == cloneOfs1.address.houseNumber); // true
        System.out.println(s1.address.street == cloneOfs1.address.street); // true
        System.out.println(s1.address.city == cloneOfs1.address.city); // true
        System.out.println(s1.address.country == cloneOfs1.address.country); // true
    }
}

class Student implements Cloneable{
    String id;
    String name;
    Address address;
    public Student(String id, String name, int houseNumber, String street, String city, String country) {
        this.id = id;
        this.name = name;
        this.address = new Address(houseNumber, street, city, country);
    }
    @Override
    public Student clone() throws CloneNotSupportedException {
        Student s = (Student) super.clone();
        s.address = address.clone();
        return s;
    }
}
class Address implements Cloneable{
    int houseNumber;
    String street;
    String city;
    String country;
    public Address(int houseNumber, String street, String city, String country) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.country = country;
    }
    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}
