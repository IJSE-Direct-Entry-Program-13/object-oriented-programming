package lk.ijse.dep13.oop.abstraction.data;

import java.io.*;
import java.util.ArrayList;

public class FileDataAccess implements DataAccess {

    private final File dbFile = new File("db.dep");
    private ArrayList<CustomerTo> customerList = new ArrayList<>();

    {
        readCustomersFromFile();
    }

    public boolean writeCustomersToFile(ArrayList<CustomerTo> customerList) {
        try (var fos = new FileOutputStream(dbFile);
             var oos = new ObjectOutputStream(fos)) {
            oos.writeObject(customerList);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void readCustomersFromFile() {
        if (dbFile.exists()) {
            try (var fis = new FileInputStream(dbFile);
                 var ois = new ObjectInputStream(fis)) {
                customerList = (ArrayList<CustomerTo>) ois.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean saveCustomer(CustomerTo customer) {
        for (int i = 0; i < customerList.size(); i++) {
            CustomerTo c = customerList.get(i);
            if (c.id().equals(customer.id())) return false;
        }
        ArrayList<CustomerTo> updatedCustomerList = new ArrayList<>(customerList);
        updatedCustomerList.add(customer);
        if (writeCustomersToFile(updatedCustomerList)) {
            customerList = updatedCustomerList;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteCustomer(String id) {
        for (int i = 0; i < customerList.size(); i++) {
            CustomerTo c = customerList.get(i);
            if (c.id().equals(id)) {
                ArrayList<CustomerTo> updatedCustomerList = new ArrayList<>(customerList);
                updatedCustomerList.remove(c);
                if (writeCustomersToFile(updatedCustomerList)) {
                    customerList = updatedCustomerList;
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public ArrayList<CustomerTo> findAllCustomers() {
        return customerList;
    }
}
