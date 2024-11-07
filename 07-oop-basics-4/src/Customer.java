public class Customer {
    int id;
    String name;
    String address;

    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void print(){
        System.out.printf("id=C%03d, name=%s, address=%s %n", id, name,
                this.address);
    }
}
