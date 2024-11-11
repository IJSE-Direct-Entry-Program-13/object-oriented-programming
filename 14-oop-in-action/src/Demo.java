public class Demo {

    public static void main(String[] args) {
        Employee e001 = new Employee("E001", "Kasun", "011-1234567");
        Employee e002 = new Employee("E002", "Nuwan", "022-1234567");
        Employee e003 = new Employee("E003", "Ruwan", "033-1234567");
        Employee e004 = new Employee("E004", "Supun", "044-1234567");
        Employee e005 = new Employee("E005", "Lakmal", "055-1234567");

        Branch panadura = new Branch("Panadura", "011-1234567", e001);
        Branch galle = new Branch("Galle", "011-1234567", e003);
        Branch matara = new Branch("Matara", "011-1234567", e003);

        System.out.println(AbcInstitute.addBranch(panadura));
        System.out.println(AbcInstitute.addBranch(galle));
        AbcInstitute.addEmployee(e002, galle);
        AbcInstitute.addEmployee(e004, galle);
        System.out.println(AbcInstitute.addBranch(matara));
        AbcInstitute.addEmployee(e005, matara);

        //AbcInstitute.printCompanyProfile();
        AbcInstitute.removeEmployee(e001);
        AbcInstitute.removeEmployee(e003);
        AbcInstitute.removeEmployee(e005);
        AbcInstitute.printCompanyProfile();


//        System.out.println(AbcInstitute.addEmployee(e002, matara));
//        System.out.println(AbcInstitute.addEmployee(e004, matara));
//        System.out.println(AbcInstitute.addEmployee(e005, matara));
//
//        AbcInstitute.printCompanyProfile();
//
//        AbcInstitute.removeEmployee(e003);
//        AbcInstitute.printBranchReport(matara);
//        AbcInstitute.removeEmployee(e002);
//        AbcInstitute.removeEmployee(e004);
//        AbcInstitute.removeEmployee(e005);
//        AbcInstitute.printBranchReport(matara);
    }
}
