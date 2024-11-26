package lk.ijse.dep13.oop.abstraction.data;

import java.util.ArrayList;

public class InMemoryDataAccess implements DataAccess {

    private final ArrayList<CustomerTo> customerList = new ArrayList<>();

    {
        saveCustomer(new CustomerTo("C001", "Kasun", "Galle"));
        saveCustomer(new CustomerTo("C002", "Nuwan", "Matara"));
        saveCustomer(new CustomerTo("C003", "Ruwan", "Panadura"));
        saveCustomer(new CustomerTo("C004", "Supun", "Moratuwa"));
    }

    @Override
    public boolean saveCustomer(CustomerTo customer) {
        for (int i = 0; i < customerList.size(); i++) {
            CustomerTo c = customerList.get(i);
            if (c.id().equals(customer.id())) return false;
        }
        return customerList.add(customer);
    }

    @Override
    public boolean deleteCustomer(String id) {
        for (int i = 0; i < customerList.size(); i++) {
            CustomerTo c = customerList.get(i);
            if (c.id().equals(id)) return customerList.remove(c);
        }
        return false;
    }

    @Override
    public ArrayList<CustomerTo> findAllCustomers() {
        return customerList;
    }
}
