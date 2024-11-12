import java.util.ArrayList;

public class Item {
    private String barcode;
    private String description;
    protected int qty;
    public double sellingPrice;
    public double buyingPrice;
    private final static ArrayList<Item> itemList = new ArrayList<>();

    public Item() {
    }

    public Item(String barcode, String description, int qty, double sellingPrice, double buyingPrice) {
        this.barcode = barcode;
        this.description = description;
        this.qty = qty;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    protected final double getProfit(){
        return 0.;
    }
}
