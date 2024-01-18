
public class Item {

    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.unitPrice * this.qty;
    }

    public void increaseQuantity() {
        this.qty += 1;
    }

    public String toString() {
        return this.product + ": " + this.qty;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item comparedObj = (Item) obj;
        
        if (this.product == comparedObj.product) {
            return true;
        }
        return false;
    }

}
