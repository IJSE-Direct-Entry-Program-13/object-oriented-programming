package lk.ijse.dep13.oop.abstraction.data;

import java.sql.*;
import java.util.ArrayList;

public class MySqlDataAccess implements DataAccess {

    private final Connection connection;

    {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dep13_buddhi",
                    "root", "mysql");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean saveCustomer(CustomerTo customer) {
        try {
            Statement stm = connection.createStatement();
            String sql = "INSERT INTO customer (id, name, address) VALUES ('%s', '%s', '%s')"
                    .formatted(customer.id(), customer.name(), customer.address());
            int affectedRows = stm.executeUpdate(sql);
            return affectedRows == 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteCustomer(String id) {
        try {
            Statement stm = connection.createStatement();
            String sql = "DELETE FROM customer WHERE id = '%s'" .formatted(id);
            int affectedRows = stm.executeUpdate(sql);
            return affectedRows == 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public ArrayList<CustomerTo> findAllCustomers() {
        final ArrayList<CustomerTo> customerList = new ArrayList<>();
        try {
            Statement stm = connection.createStatement();
            ResultSet rst = stm.executeQuery("TABLE customer");
            while (rst.next()){
                String id = rst.getString("id");
                String name = rst.getString("name");
                String address = rst.getString("address");
                customerList.add(new CustomerTo(id, name, address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
