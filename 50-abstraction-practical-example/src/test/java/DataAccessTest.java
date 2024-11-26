import lk.ijse.dep13.oop.abstraction.data.CustomerTo;
import lk.ijse.dep13.oop.abstraction.data.DataAccess;
import lk.ijse.dep13.oop.abstraction.data.InMemoryDataAccess;

import java.util.ArrayList;

public class DataAccessTest {

    public static void main(String[] args) {
        DataAccess dataAccess = new InMemoryDataAccess();
        ArrayList<CustomerTo> customerList = dataAccess.findAllCustomers();
        customerList.forEach(System.out::println);
        boolean saved = dataAccess.saveCustomer(new CustomerTo("C001", "Ruwan", "Galle"));
        System.out.println("Saved: " + saved);
        customerList.forEach(System.out::println);
        boolean removed = dataAccess.deleteCustomer("C004");
        System.out.println("Removed: " + removed);
        customerList.forEach(System.out::println);
    }
}
