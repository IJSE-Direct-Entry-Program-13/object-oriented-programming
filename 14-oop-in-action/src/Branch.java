import java.util.ArrayList;

public class Branch {
    String name;
    String contact;
    Employee branchManager;
    ArrayList<Employee> employeeList;

    public Branch(String name, String contact, Employee branchManager) {
        this.name = name;
        this.contact = contact;
        this.branchManager = branchManager;
        employeeList = new ArrayList<>();
    }
}
