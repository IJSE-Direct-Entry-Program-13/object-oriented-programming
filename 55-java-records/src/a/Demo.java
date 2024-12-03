package a;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        CustomerDto c = new CustomerDto(-1, "Kasun", "Galle");
    }
}

class EmployeeDto implements Serializable {
    private int id;
    private String name;
    private String department;
    private ArrayList<String> contactList = new ArrayList<>();

    public EmployeeDto() {
    }

    public EmployeeDto(int id, String name, String department, ArrayList<String> contactList) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.contactList = contactList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<String> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<String> contactList) {
        this.contactList = contactList;
    }
}

class OrderDto{
    private int orderId;
    private LocalDate orderDate;
    private BigDecimal orderTotal;
    private String customerId;

    public OrderDto() {
    }

    public OrderDto(int orderId, LocalDate orderDate, BigDecimal orderTotal, String customerId) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderTotal = orderTotal;
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}

@Getter
@AllArgsConstructor
//@Setter
//@NoArgsConstructor
class CustomerDto implements Serializable{
    private final int id;
    private final String name;
    private final String address;

//    public CustomerDto(int id, String name, String address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
}

record StudentDto(int id, String name, String address) {
}