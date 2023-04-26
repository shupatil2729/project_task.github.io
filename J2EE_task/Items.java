package J2EE_task;

public class Items {

    private String itemName;
    private double itemPrice;
    private int itemQty;

    @Override
    public String toString() {
        return "Items [itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemQty=" + itemQty + ", phNo="
                + "]";
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public double getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public int getItemQty() {
        return itemQty;
    }
    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }
    public Items(String itemName, double itemPrice, int itemQty) {
        super();
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQty = itemQty;

    }

    public Items(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
}
