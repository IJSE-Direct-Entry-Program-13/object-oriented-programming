import java.time.LocalDate;
import java.util.ArrayList;

public class Demo {
}

class Order {
    int id;
    LocalDate date;
    String customerName;
    ArrayList<Item> itemList;

    public Order(int id, LocalDate date, String customerName, ArrayList<Item> itemList) {
        this.id = id;
        this.date = date;
        this.customerName = customerName;
        this.itemList = itemList;
    }

    public double getTotal(){
        return 0;
    }

    public double getProfit(){
        return 0;
    }

}

class Item{
    String code;
    String description;
    int qty;
    double buyingPrice;
    double sellingPrice;

    public Item(String code, String description, int qty, double buyingPrice, double sellingPrice) {
        this.code = code;
        this.description = description;
        this.qty = qty;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }
}