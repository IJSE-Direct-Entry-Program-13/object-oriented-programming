package i;

public class Demo {
    static Customer c;
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000 * 60 * 10);
        Customer kasun = new Customer(1, "Kasun");
        c = kasun;
        kasun = null;
        c = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println("About to exit");
    }
}
class Customer{
    int id;
    String name;
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
    protected void finalize() throws Throwable {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Menna moo maawa maranna hadanwo...!");
    }
}