import java.util.ArrayList;

public class AbcInstitute {

    static ArrayList<Branch> branches = new ArrayList<>();

    private AbcInstitute() {
    }

    public static boolean addBranch(Branch newBranch) {
        for (int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if (branch.name.equals(newBranch.name)) {
                System.out.printf("Branch: %s already exists %n", newBranch.name);
                return false;
            }
        }
        System.out.printf("New branch: %s added %n", newBranch.name);
        if (!transferEmployee(newBranch.branchManager, newBranch)) {
            newBranch.employeeList.add(newBranch.branchManager);
        }
        branches.add(newBranch);
        return true;
    }

    public static boolean removeBranch(Branch branch) {
        return branches.remove(branch);
    }

    public static boolean addEmployee(Employee employee, Branch branch) {
        if (!branches.contains(branch)) {
            System.out.println("Invalid branch");
            return false;
        }
        for (int i = 0; i < branches.size(); i++) {
            Branch b = branches.get(i);
            for (int k = 0; k < b.employeeList.size(); k++) {
                Employee e = b.employeeList.get(k);
                if (e.id.equals(employee.id)) {
                    System.out.printf("Employee %s already exists %n", employee.id);
                    return false;
                }
            }
        }
        branch.employeeList.add(employee);
        System.out.println("Employee added");
        return true;
    }

    public static boolean removeEmployee(Employee employee) {
        for (int i = 0; i < branches.size(); i++) {
            Branch b = branches.get(i);
            if (b.employeeList.contains(employee)) {
                b.employeeList.remove(employee);
                if (b.branchManager == employee) {
                    if (b.employeeList.isEmpty()) removeBranch(b);
                    else b.branchManager = b.employeeList.getFirst();
                }
                return true;
            }
        }
        System.out.println("Employee not found");
        return false;
    }

    public static boolean transferEmployee(Employee employee, Branch newBranch) {
        if (!branches.contains(newBranch)) {
            return false;
        }
        for (int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if (branch == newBranch) continue;
            for (int k = 0; k < branch.employeeList.size(); k++) {
                Employee e = branch.employeeList.get(k);
                if (e.id.equals(employee.id)) {
                    removeEmployee(employee);
                    newBranch.employeeList.add(e);
                    return true;
                }
            }
        }
        return false;
    }

    public static void printBranchReport(Branch branch) {
        if (!branches.contains(branch)) {
            System.out.println("No branch found");
            return;
        }
        System.out.printf("BRANCH NAME: %s %n", branch.name);
        System.out.printf("BRANCH CONTACT: %s %n", branch.contact);
        System.out.printf("BRANCH MANAGER: %s %n", branch.branchManager);
        System.out.printf("BRANCH EMPLOYEE COUNT: %d %n", branch.employeeList.size());
        for (int i = 0; i < branch.employeeList.size(); i++) {
            if (branch.branchManager == branch.employeeList.get(i)) continue;
            printEmployeeDetails(branch.employeeList.get(i));
        }
    }

    public static void printEmployeeDetails(Employee employee) {
        for (int i = 0; i < branches.size(); i++) {
            Branch b = branches.get(i);
            if (b.employeeList.contains(employee)) {
                System.out.printf("ID=%s, NAME=%s, CONTACT=%s %n", employee.id, employee.name, employee.contact);
            }
        }
        System.out.println("Employee not found");
    }

    public static void printCompanyProfile() {
        System.out.printf("Company Profile %n");
        System.out.printf("BRANCHES COUNT: %s %n", branches.size());
        int totalEmployeeCount = 0;
        for (int i = 0; i < branches.size(); i++) {
            printBranchReport(branches.get(i));
            totalEmployeeCount += branches.get(i).employeeList.size();
        }
        System.out.printf("TOTAL EMPLOYEE COUNT: %s %n", totalEmployeeCount);
    }

}
