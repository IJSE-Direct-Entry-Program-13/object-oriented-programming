package a;

public class Demo {

    public static void main(String[] args) {
        Employee e01 = new Employee(1, "Kasun");
        Employee e02 = new Employee(2, "Nuwan");
    }
}

class Employee{
    int id;
    String name;
    private static int numOfInstances;

    public Employee(int id, String name) {
        if (numOfInstances > 0) throw new IllegalStateException("Only one instance per employee class");
        this.id = id;
        this.name = name;
        numOfInstances++;
    }
}
