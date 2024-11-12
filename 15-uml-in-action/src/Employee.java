public class Employee {
    private static final String COMPANY = "IJSE";
    private volatile transient int id;
    private volatile String name;

    protected Employee(int id, String name) {
        this.id = id;
        this.name = name;
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

    public static final synchronized void printEmployee(Employee e){
        System.out.printf("%s, %s %n", e.id, e.name);
    }
}
