package lk.ijse.dep13.oop.abstraction.data;

import lk.ijse.dep13.oop.abstraction.tm.Customer;

import java.io.*;
import java.util.ArrayList;

public class FileDataAccess implements DataAccess{

    private final File file = new File("db.dep");
    private ArrayList<CustomerTo> customerList = new ArrayList<>();

    @Override
    public boolean saveCustomer(CustomerTo customer) {
        for (int i = 0; i < customerList.size(); i++) {
            CustomerTo c = customerList.get(i);
            if (c.id().equals(customer.id())) return false;
        }
        ArrayList<CustomerTo> updatedCustomerList = new ArrayList<>(customerList);
        updatedCustomerList.add(customer);
        if (writeCustomersToFile(updatedCustomerList)){
            customerList = updatedCustomerList;
            return true;
        }else{
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
                if (writeCustomersToFile(updatedCustomerList)){
                    customerList = updatedCustomerList;
                }else{
                    return false;
                }
            }
        }
        return false;
    }

    private boolean writeCustomersToFile(ArrayList<CustomerTo> customerList) {
        try(var oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(customerList);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public ArrayList<CustomerTo> findAllCustomers() {
        return null;
    }
}
