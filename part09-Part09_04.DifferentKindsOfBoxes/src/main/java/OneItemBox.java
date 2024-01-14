
import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> itemsInBox;

    public OneItemBox() {
        this.itemsInBox = new ArrayList<>();
    }

    public void add(Item item) {
        if (this.itemsInBox.isEmpty()) {
            itemsInBox.add(item);
        }
    }

    public boolean isInBox(Item item) {
        if (this.itemsInBox.contains(item)) {
            return true;
        }
        return false;
    }
    
//    public void printItems() {
//        for (Item i : itemsInBox) {
//            System.out.println(i.getName());
//        }
//    }
}
