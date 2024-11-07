import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    int orderId;
    LocalDate orderDate;
    BigDecimal orderTotal;
    ArrayList<Item> itemList;
    Customer customer;

    public Order(int orderId, LocalDate orderDate, BigDecimal orderTotal, ArrayList<Item> itemList, Customer customer) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderTotal = orderTotal;
        this.itemList = itemList;
        this.customer = customer;
    }
}

