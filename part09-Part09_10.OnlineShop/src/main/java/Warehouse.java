
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.products = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        if (this.products.containsKey(product)) {
            return this.products.get(product);
        }
        return -99;
    }

    public boolean take(String product) {
        if (this.stocks.containsKey(product) && this.stocks.get(product) - 1 >= 0) {
            int num = this.stocks.get(product) - 1;
            this.stocks.put(product, num);
            return true;
        }
        return false;
    }

    public int stock(String product) {
        if (this.stocks.containsKey(product)) {
            return this.stocks.get(product);
        }
        return 0;
    }
    
    public Set<String> products() {
        return this.products.keySet();
    }

}
