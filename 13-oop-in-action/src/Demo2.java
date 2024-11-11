import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(AbcCompany.getEmployeeCount());
        System.out.println(AbcCompany.addEmployee(new Employee("E001", "Kasun", "011-1234567")));
        System.out.println(AbcCompany.addEmployee(new Employee("E002", "Nuwan", "022-1234567")));
        System.out.println(AbcCompany.getEmployeeCount());
        AbcCompany.printEmployeeDetails("E001");
        AbcCompany.printEmployeeDetails("E005");
        System.out.println(AbcCompany.removeEmployee("E001"));
        System.out.println(AbcCompany.removeEmployee("E005"));
        System.out.println(AbcCompany.getEmployeeCount());
        System.out.println(AbcCompany.addEmployee(new Employee("E003", "Supun", "011-1234567")));
    }
}

class AbcCompany {
    static ArrayList<Employee> employeeList = new ArrayList<>();
    static ArrayList<String> removedEmployeeList = new ArrayList<>();

    private AbcCompany() {
    }

    public static boolean addEmployee(Employee e) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            if (employee.id.equals(e.id) || employee.contact.equals(e.contact)) {
                System.out.println("Employee ID or contact already exist");
                return false;
            }
        }
        if (removedEmployeeList.contains(e.id)) {
            System.out.println("A previous employee id can't be added");
            return false;
        }
        employeeList.add(e);
        return true;
    }

    public static void printEmployeeDetails(String employeeId) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            if (employee.id.equals(employeeId)) {
                System.out.printf("ID=%s, NAME=%s, CONTACT=%s %n",
                        employeeId, employee.name, employee.contact);
                return;
            }
        }
        System.out.println("Employee Not Found");
    }

    public static boolean removeEmployee(String employeeId) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            if (employee.id.equals(employeeId)) {
                employeeList.remove(i);
                removedEmployeeList.add(employeeId);
                return true;
            }
        }
        return false;
    }

    public static int getEmployeeCount() {
        return employeeList.size();
    }
}

class Employee {
    String id;
    String name;
    String contact;

    public Employee(String id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }
}


