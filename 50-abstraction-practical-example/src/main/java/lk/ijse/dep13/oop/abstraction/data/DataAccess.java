package lk.ijse.dep13.oop.abstraction.data;

import java.util.ArrayList;

public interface DataAccess {
    boolean saveCustomer(CustomerTo customer);
    boolean deleteCustomer(String id);
    ArrayList<CustomerTo> findAllCustomers();
}
