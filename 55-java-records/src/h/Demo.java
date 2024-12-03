package h;

public class Demo {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Kasun");
        Employee e2 = new Employee(2, "Sampath");
        // Full qualified Class Name +  @ + Hexadecimal(Hashcode())
        System.out.println(e1);
        System.out.println(e2);
    }
}
class Employee{
    int id;
    String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    // To generate toString() method to print the object's state,
    // Use lombok @ToString annotation or IntelliJ IDEA (Alt+Insert -> toString)
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}