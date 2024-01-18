
import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {

    private List<Item> myCart;

    public ShoppingCart() {
        this.myCart = new ArrayList<Item>();
    }

    public void add(String product, int price) {
        int qty = 1;
        Item temp = new Item(product, qty, price);

        if (this.myCart.contains(temp)) {
            for (Item i : myCart) {
                if (i.equals(temp)) {
//                    qty = i.getQty() +1;
//                    int index = this.myCart.indexOf(i);
//                    this.myCart.set(index, new Item(product, qty, price * qty));
                    i.increaseQuantity();
                }
            }
        } else {
            this.myCart.add(temp);
        }
    }

    public int price() {
        int sum = 0;
        if (this.myCart.isEmpty()) {
            return 0;
        }
        for (Item i : myCart) {
            sum += i.price();
        }
        return sum;
    }

    public void print() {
        if (this.myCart.isEmpty()) {
            System.out.println("No items");
        }
        for (Item i : myCart) {
            System.out.println(i.toString());
        }
    }
}
