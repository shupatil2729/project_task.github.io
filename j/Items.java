package j;

class Items {

    private String itemName;
    private double itemPrice;
    private int itemQty;
    private long phNo;
    @Override
    public String toString() {
        return "Items [itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemQty=" + itemQty + ", phNo=" + phNo
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
    public long getPhNo() {
        return phNo;
    }
    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }
    public Items(String itemName, double itemPrice, int itemQty, long phNo) {
        super();
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQty = itemQty;
        this.phNo = phNo;
    }



}
