import java.time.LocalDate;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Item i001 = new Item("I001", "Mouse", 5, 1250, 1500);
        Item i002 = new Item("I002", "Keyboard", 2, 1500, 1600);
        Item i003 = new Item("I003", "USB PenDrive", 2, 1000, 1350);

        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(i001);
        itemList.add(i002);
        itemList.add(i003);

        Order order1 = new Order(1, LocalDate.now(), "Kasun", itemList);
        System.out.println(order1.getTotal());
        System.out.println(order1.getProfit());
    }
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
        double total = 0;
        for (int i = 0; i < itemList.size(); i++) {
            Item item = itemList.get(i);
            total += item.qty * item.sellingPrice;
        }
        return total;
    }

    public double getProfit(){
        double sellingPriceTotal = 0;
        double buyingPriceTotal = 0;
        for (int i = 0; i < itemList.size(); i++) {
            Item item = itemList.get(i);
            sellingPriceTotal += item.qty * item.sellingPrice;
            buyingPriceTotal += item.qty * item.buyingPrice;
        }
        return sellingPriceTotal - buyingPriceTotal;
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