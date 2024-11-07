import java.math.BigDecimal;

public class Item {
    String barcode;
    String name;
    BigDecimal buyingPrice;
    BigDecimal sellingPrice;
    int stock;

    public Item(String barcode, String name, BigDecimal buyingPrice, BigDecimal sellingPrice, int stock) {
        this.barcode = barcode;
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.stock = stock;
    }
}
